/*
 * GeoJSON
 * GeoJSON
 *
 * The version of the OpenAPI document: 0.1.9
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.geojson.model;


import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

/**
 * Model tests for GeoJSON
 */
public class SampleModelData {

    public SampleModelData(long seed) {
        this.random = new Random(seed);
    }

    public GeometryCollectionDto sampleGeometryCollectionDto(String propertyName) {
        return new GeometryCollectionDto()
            .type("GeometryCollection")
            .geometries(sampleListOfGeometryDto("geometries"))
            ;
    }

    public List<GeometryCollectionDto> sampleListOfGeometryCollectionDto(String propertyName) {
        return sampleList(() -> sampleGeometryCollectionDto(propertyName), propertyName);
    }

    public GeometryDto sampleGeometryDto(String propertyName) {
        List<Supplier<GeometryDto>> factories = List.of(
            () -> samplePointDto(propertyName),
            () -> samplePolygonDto(propertyName),
            () -> sampleLineStringDto(propertyName)
        );
        return pickOne(factories).get();
    }

    public List<GeometryDto> sampleListOfGeometryDto(String propertyName) {
        return sampleList(() -> sampleGeometryDto(propertyName), propertyName);
    }

    public LineStringDto sampleLineStringDto(String propertyName) {
        return new LineStringDto()
            .type("LineString")
            //.coordinates is too complex to map (List<List<Double>>)
            ;
    }

    public List<LineStringDto> sampleListOfLineStringDto(String propertyName) {
        return sampleList(() -> sampleLineStringDto(propertyName), propertyName);
    }

    public PointDto samplePointDto(String propertyName) {
        return new PointDto()
            .type("Point")
            .coordinates(sampleList(() -> randomDouble("coordinates"), "coordinates"))
            ;
    }

    public List<PointDto> sampleListOfPointDto(String propertyName) {
        return sampleList(() -> samplePointDto(propertyName), propertyName);
    }

    public PolygonDto samplePolygonDto(String propertyName) {
        return new PolygonDto()
            .type("Polygon")
            //.coordinates is too complex to map (List<List<List<Double>>>)
            ;
    }

    public List<PolygonDto> sampleListOfPolygonDto(String propertyName) {
        return sampleList(() -> samplePolygonDto(propertyName), propertyName);
    }

    protected final Random random;
    protected final Map<String, Supplier<String>> dataFormatFactories = new HashMap<>(Map.of(
        "email", this::randomEmail,
        "phone", this::randomPhoneNumber
    ));
    protected final Map<String, Supplier<String>> propertyNameFactories = new HashMap<>(Map.of(
        "givenName", this::randomGivenName,
        "familyName", this::randomFamilyName,
        "personName", this::randomPersonName
    ));

    public <T> List<T> sampleList(Supplier<T> supplier, String propertyName) {
        return sampleList(supplier, propertyName, 1, 4);
    }

    public <T> List<T> sampleList(Supplier<T> supplier, String propertyName, int min, int max) {
        List<T> result = new ArrayList<>();
        int count = min + random.nextInt(max - min);
        for (int i=0; i<count; i++) {
            result.add(supplier.get());
        }
        return result;
    }

    public <T> Map<String, T> sampleMap(Supplier<T> supplier, String propertyName) {
        return sampleMap(supplier, propertyName, 1, 4);
    }

    public <T> Map<String, T> sampleMap(Supplier<T> supplier, String propertyName, int min, int max) {
        Map<String, T> result = new HashMap<>();
        int count = min + random.nextInt(max - min);
        for (int i=0; i<count; i++) {
            result.put(randomString(propertyName), supplier.get());
        }
        return result;
    }

    public String randomString(String propertyName, String dataFormat) {
        if (dataFormatFactories.containsKey(dataFormat)) {
            return dataFormatFactories.get(dataFormat).get();
        }
        if (propertyNameFactories.containsKey(propertyName)) {
            return propertyNameFactories.get(propertyName).get();
        }
        return "str" + randomUUID(propertyName);
    }

    public String randomString(String propertyName) {
        return randomString(propertyName, null);
    }

    public UUID randomUUID(String propertyName) {
        byte[] bytes = new byte[16];
        random.nextBytes(bytes);
        return UUID.nameUUIDFromBytes(bytes);
    }

    public Long randomLong(String propertyName) {
        return random.nextLong() % 10000L;
    }

    public Integer randomInteger(String propertyName) {
        return random.nextInt(10000);
    }

    public Double randomDouble(String propertyName) {
        return random.nextDouble() * 10000.0;
    }

    public Boolean randomBoolean(String propertyName) {
        return random.nextBoolean();
    }

    public LocalDate sampleLocalDate(String propertyName) {
        return LocalDate.of(2022, 1, 1).plusDays(random.nextInt(1000));
    }

    public LocalTime sampleLocalTime(String propertyName) {
        return LocalTime.of(0, 0).plusMinutes(random.nextInt(24*60));
    }

    public LocalDateTime sampleLocalDateTime(String propertyName) {
        return LocalDateTime.of(
            sampleLocalDate(propertyName), sampleLocalTime(propertyName)
        );
    }

    public ZoneId sampleZoneId(String propertyName) {
        return ZoneId.of(pickOne(ZoneId.getAvailableZoneIds()));
    }

    public ZonedDateTime sampleZonedDateTime(String propertyName) {
        return ZonedDateTime.of(
            sampleLocalDateTime(propertyName), sampleZoneId(propertyName)
        );
    }

    public OffsetDateTime sampleOffsetDateTime(String propertyName) {
        return sampleZonedDateTime(propertyName).toOffsetDateTime();
    }

    public URI randomURI(String propertyName) {
        return asURI("https://" + randomDomainName());
    }

    public String randomDomainName() {
        return pickOne(List.of("a", "b", "c")) +
            ".example." +
            pickOne(List.of("com", "net", "io"));
    }

    public String randomEmail() {
        return (
            randomGivenName().toLowerCase() +
            "." +
            randomFamilyName().toLowerCase() +
            "@" +
            randomDomainName()
        );
    }

    public String randomPersonName() {
        return randomGivenName() + " " + randomFamilyName();
    }

    public String randomGivenName() {
        return pickOne(List.of("James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Linda"));
    }

    public String randomFamilyName() {
        return pickOne(List.of("Smith", "Williams", "Johnson", "Jones", "Brown", "Davis", "Wilson"));
    }

    public String randomPhoneNumber() {
        return "636-555-" + (1000 + random.nextInt(9000));
    }

    public <T> T pickOne(T[] alternatives) {
        return alternatives[random.nextInt(alternatives.length)];
    }

    public <T> T pickOne(List<T> alternatives) {
        return alternatives.get(random.nextInt(alternatives.size()));
    }

    public <T> T pickOne(Set<T> alternatives) {
        return pickOne(new ArrayList<>(alternatives));
    }

    public static URI asURI(String uri) {
        try {
            return new URI(uri);
        } catch (java.net.URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

}

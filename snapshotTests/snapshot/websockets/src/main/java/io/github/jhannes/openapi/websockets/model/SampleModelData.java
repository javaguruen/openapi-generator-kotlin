/*
 * WebSockets
 * An example of sending requests and commands
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: johannes@brodwall.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.websockets.model;


import java.net.URI;
import java.time.Instant;
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
 * Model tests for WebSockets
 */
public class SampleModelData {

    public SampleModelData(Random random) {
        this.random = random;
    }

    public SampleModelData(long seed) {
        this(new Random(seed));
    }

    public ChangeTrackedDto sampleChangeTrackedDto(String propertyName) {
        return sampleChangeTrackedDto();
    }

    public ChangeTrackedDto sampleChangeTrackedDto() {
        return new ChangeTrackedDto()
            .createdAt(sampleOffsetDateTime("createdAt"))
            .createdBy(randomString("createdBy", "username"))
            .updatedAt(sampleOffsetDateTime("updatedAt"))
            .updatedBy(randomString("updatedBy", "username"));
    }

    public List<ChangeTrackedDto> sampleListOfChangeTrackedDto(String propertyName) {
        return sampleListOfChangeTrackedDto();
    }

    public List<ChangeTrackedDto> sampleListOfChangeTrackedDto() {
        return sampleList(() -> sampleChangeTrackedDto());
    }

    public CreatePersonCommandDto sampleCreatePersonCommandDto(String propertyName) {
        return sampleCreatePersonCommandDto();
    }

    public CreatePersonCommandDto sampleCreatePersonCommandDto() {
        return new CreatePersonCommandDto()
            .command("createPerson")
            .id(randomUUID("id"))
            .person(samplePersonDto("person"));
    }

    public List<CreatePersonCommandDto> sampleListOfCreatePersonCommandDto(String propertyName) {
        return sampleListOfCreatePersonCommandDto();
    }

    public List<CreatePersonCommandDto> sampleListOfCreatePersonCommandDto() {
        return sampleList(() -> sampleCreatePersonCommandDto());
    }

    public PersonDto samplePersonDto(String propertyName) {
        return samplePersonDto();
    }

    public PersonDto samplePersonDto() {
        return new PersonDto()
            .id(randomUUID("id"))
            .type(randomString("type"))
            .givenName(randomString("givenName"))
            .familyName(randomString("familyName"))
            .email(randomString("email", "email"))
            .phone(randomString("phone", "phone"))
            .birthDate(sampleLocalDate("birthDate"));
    }

    public List<PersonDto> sampleListOfPersonDto(String propertyName) {
        return sampleListOfPersonDto();
    }

    public List<PersonDto> sampleListOfPersonDto() {
        return sampleList(() -> samplePersonDto());
    }

    public PersonSnapshotDto samplePersonSnapshotDto(String propertyName) {
        return samplePersonSnapshotDto();
    }

    public PersonSnapshotDto samplePersonSnapshotDto() {
        return new PersonSnapshotDto()
            .createdAt(sampleOffsetDateTime("createdAt"))
            .createdBy(randomString("createdBy", "username"))
            .updatedAt(sampleOffsetDateTime("updatedAt"))
            .updatedBy(randomString("updatedBy", "username"))
            .id(randomUUID("id"))
            .type(randomString("type"))
            .givenName(randomString("givenName"))
            .familyName(randomString("familyName"))
            .email(randomString("email", "email"))
            .phone(randomString("phone", "phone"))
            .birthDate(sampleLocalDate("birthDate"));
    }

    public List<PersonSnapshotDto> sampleListOfPersonSnapshotDto(String propertyName) {
        return sampleListOfPersonSnapshotDto();
    }

    public List<PersonSnapshotDto> sampleListOfPersonSnapshotDto() {
        return sampleList(() -> samplePersonSnapshotDto());
    }

    public SubscribeDto sampleSubscribeDto(String propertyName) {
        return sampleSubscribeDto();
    }

    public SubscribeDto sampleSubscribeDto() {
        return new SubscribeDto()
            .request("Subscribe");
    }

    public List<SubscribeDto> sampleListOfSubscribeDto(String propertyName) {
        return sampleListOfSubscribeDto();
    }

    public List<SubscribeDto> sampleListOfSubscribeDto() {
        return sampleList(() -> sampleSubscribeDto());
    }

    public UnsubscribeDto sampleUnsubscribeDto(String propertyName) {
        return sampleUnsubscribeDto();
    }

    public UnsubscribeDto sampleUnsubscribeDto() {
        return new UnsubscribeDto()
            .request("Unsubscribe");
    }

    public List<UnsubscribeDto> sampleListOfUnsubscribeDto(String propertyName) {
        return sampleListOfUnsubscribeDto();
    }

    public List<UnsubscribeDto> sampleListOfUnsubscribeDto() {
        return sampleList(() -> sampleUnsubscribeDto());
    }

    public UpdatePersonCommandDto sampleUpdatePersonCommandDto(String propertyName) {
        return sampleUpdatePersonCommandDto();
    }

    public UpdatePersonCommandDto sampleUpdatePersonCommandDto() {
        return new UpdatePersonCommandDto()
            .command("updatePerson")
            .id(randomUUID("id"))
            .person(samplePersonDto("person"));
    }

    public List<UpdatePersonCommandDto> sampleListOfUpdatePersonCommandDto(String propertyName) {
        return sampleListOfUpdatePersonCommandDto();
    }

    public List<UpdatePersonCommandDto> sampleListOfUpdatePersonCommandDto() {
        return sampleList(() -> sampleUpdatePersonCommandDto());
    }

    public WebSocketCommandDto sampleWebSocketCommandDto(String propertyName) {
        return sampleWebSocketCommandDto();
    }

    public WebSocketCommandDto sampleWebSocketCommandDto() {
        List<Supplier<WebSocketCommandDto>> factories = List.of(
            () -> sampleCreatePersonCommandDto().command("createPerson"),
            () -> sampleUpdatePersonCommandDto().command("updatePerson")
        );
        return pickOne(factories).get();
    }

    public List<WebSocketCommandDto> sampleListOfWebSocketCommandDto(String propertyName) {
        return sampleListOfWebSocketCommandDto();
    }

    public List<WebSocketCommandDto> sampleListOfWebSocketCommandDto() {
        return sampleList(() -> sampleWebSocketCommandDto());
    }

    public WebSocketMessageDto sampleWebSocketMessageDto(String propertyName) {
        return sampleWebSocketMessageDto();
    }

    public WebSocketMessageDto sampleWebSocketMessageDto() {
        List<Supplier<WebSocketMessageDto>> factories = List.of(
        );
        return pickOne(factories).get();
    }

    public List<WebSocketMessageDto> sampleListOfWebSocketMessageDto(String propertyName) {
        return sampleListOfWebSocketMessageDto();
    }

    public List<WebSocketMessageDto> sampleListOfWebSocketMessageDto() {
        return sampleList(() -> sampleWebSocketMessageDto());
    }

    public WebSocketRequestDto sampleWebSocketRequestDto(String propertyName) {
        return sampleWebSocketRequestDto();
    }

    public WebSocketRequestDto sampleWebSocketRequestDto() {
        List<Supplier<WebSocketRequestDto>> factories = List.of(
            () -> sampleSubscribeDto().request("Subscribe")
        );
        return pickOne(factories).get();
    }

    public List<WebSocketRequestDto> sampleListOfWebSocketRequestDto(String propertyName) {
        return sampleListOfWebSocketRequestDto();
    }

    public List<WebSocketRequestDto> sampleListOfWebSocketRequestDto() {
        return sampleList(() -> sampleWebSocketRequestDto());
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

    public <T> List<T> sampleList(Supplier<T> supplier) {
        return sampleList(supplier, 1, 4);
    }

    public <T> List<T> sampleList(Supplier<T> supplier, String propertyName, int min, int max) {
        return sampleList(supplier, min, max);
    }

    public <T> List<T> sampleList(Supplier<T> supplier, int min, int max) {
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

    public Object randomObject(String propertyName) {
        Map<String, String> result = new HashMap<>();
        result.put(randomString(propertyName + ".key"), randomString(propertyName + ".value"));
        return result;
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

    public Instant sampleInstant(String propertyName) {
        return sampleZonedDateTime(propertyName).toInstant();
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
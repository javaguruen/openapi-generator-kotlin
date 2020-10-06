/*
 * Sample API
 * Optional multiline or single-line description in [CommonMark](http://commonmark.org/help/) or HTML.
 *
 * The version of the OpenAPI document: 0.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.petstore.model;

import java.net.URI;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

public interface AnyPetDto  {
    String getPetType();

    static CatDto Cat() {
        return new CatDto().petType("Cat");
    }
    static DogDto Dog() {
        return new DogDto().petType("Dog");
    }

    static Class<?> getType(String type) {
        switch (type) {
        case "Cat":
            return CatDto.class;
        case "Dog":
            return DogDto.class;
        default:
            throw new IllegalArgumentException("Illegal petType " + type);
        }
    }
}


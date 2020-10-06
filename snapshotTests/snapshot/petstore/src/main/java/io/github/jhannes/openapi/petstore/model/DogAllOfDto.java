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

/**
* DogAllOfDto
*/
public class DogAllOfDto {

    private Boolean bark;
            
    /**
     * Gets or Sets breed
     */
    public enum BreedEnum {
        DINGO("Dingo"),
        
        HUSKY("Husky"),
        
        RETRIEVER("Retriever"),
        
        SHEPHERD("Shepherd");

        private String value;

        BreedEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static BreedEnum fromValue(String text) {
            for (BreedEnum b : BreedEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }

    private BreedEnum breed;

    public static String[] readOnlyFields() {
        return new String[] {
        };
    }

    public static String[] writeOnlyFields() {
        return new String[] {
        };
    }

    public static String[] requiredFields() {
        return new String[] {
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        return result;
    }

    private boolean isMissing(String s) {
        return s == null || s.isEmpty();
    }

    private boolean isMissing(Object s) {
        return s == null;
    }


    /**
     * Get bark
     * @return bark
     */
    public Boolean getBark() {
        return bark;
    }

    public void setBark(Boolean bark) {
        this.bark = bark;
    }

    public DogAllOfDto bark(Boolean bark) {
        this.bark = bark;
        return this;
    }

    /**
     * Get breed
     * @return breed
     */
    public BreedEnum getBreed() {
        return breed;
    }

    public void setBreed(BreedEnum breed) {
        this.breed = breed;
    }

    public DogAllOfDto breed(BreedEnum breed) {
        this.breed = breed;
        return this;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DogAllOfDto dogAllOf = (DogAllOfDto) o;
        return Objects.equals(this.bark, dogAllOf.bark) &&
            Objects.equals(this.breed, dogAllOf.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bark, breed);
    }

    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DogAllOfDto {\n");
        sb.append("    bark: ").append(toIndentedString(bark)).append("\n");
        sb.append("    breed: ").append(toIndentedString(breed)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}


/*
 * Sample API
 * A small example to demonstrate individual problems
 *
 * The version of the OpenAPI document: 0.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.bigExample.model;

import java.io.File;
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
* PetDto
*/
public class PetDto {

    private String pet_type;

    private String name = null;

    private LocalDate birth_date = null;

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
                "pet_type",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getPetType())) result.add("pet_type");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
    }

    private boolean isMissing(String s) {
        return s == null || s.isEmpty();
    }

    private boolean isMissing(List<?> list) {
        return list == null || list.isEmpty();
    }

    private boolean isMissing(Object s) {
        return s == null;
    }


    /**
     * Get pet_type
     * @return pet_type
     */
    public String getPetType() {
        return pet_type;
    }

    public void setPetType(String petType) {
        this.pet_type = petType;
    }

    public PetDto petType(String petType) {
        this.pet_type = petType;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetDto name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get birth_date
     * @return birth_date
     */
    public LocalDate getBirthDate() {
        return birth_date;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birth_date = birthDate;
    }

    public PetDto birthDate(LocalDate birthDate) {
        this.birth_date = birthDate;
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
        PetDto pet = (PetDto) o;
        return Objects.equals(this.getPetType(), pet.getPetType()) &&
                Objects.equals(this.getName(), pet.getName()) &&
                Objects.equals(this.getBirthDate(), pet.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPetType(), getName(), getBirthDate());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PetDto {\n");
        sb.append("    pet_type: ").append(toIndentedString(getPetType())).append("\n");
        sb.append("    name: ").append(toIndentedString(getName())).append("\n");
        sb.append("    birth_date: ").append(toIndentedString(getBirthDate())).append("\n");
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


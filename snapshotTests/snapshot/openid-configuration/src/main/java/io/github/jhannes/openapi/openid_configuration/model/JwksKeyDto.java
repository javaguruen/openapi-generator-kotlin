/*
 * Open ID Connect
 * Open ID Connect Discovery
 *
 * The version of the OpenAPI document: 1.0.0-draft
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.openid_configuration.model;

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
* JwksKeyDto
*/
public class JwksKeyDto {

    private String kty = null;

    private String use = null;

    private String kid;

    private String x5c;

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
                "kid",
                "x5c",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getKid())) result.add("kid");
        if (isMissing(getX5c())) result.add("x5c");
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
     * Get kty
     * example: RSA
     * @return kty
     */
    public String getKty() {
        return kty;
    }

    public void setKty(String kty) {
        this.kty = kty;
    }

    public JwksKeyDto kty(String kty) {
        this.kty = kty;
        return this;
    }

    /**
     * Get use
     * example: sig
     * @return use
     */
    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public JwksKeyDto use(String use) {
        this.use = use;
        return this;
    }

    /**
     * Get kid
     * @return kid
     */
    public String getKid() {
        return kid;
    }

    public void setKid(String kid) {
        this.kid = kid;
    }

    public JwksKeyDto kid(String kid) {
        this.kid = kid;
        return this;
    }

    /**
     * Get x5c
     * @return x5c
     */
    public String getX5c() {
        return x5c;
    }

    public void setX5c(String x5c) {
        this.x5c = x5c;
    }

    public JwksKeyDto x5c(String x5c) {
        this.x5c = x5c;
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
        JwksKeyDto jwksKey = (JwksKeyDto) o;
        return Objects.equals(this.getKty(), jwksKey.getKty()) &&
                Objects.equals(this.getUse(), jwksKey.getUse()) &&
                Objects.equals(this.getKid(), jwksKey.getKid()) &&
                Objects.equals(this.getX5c(), jwksKey.getX5c());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKty(), getUse(), getKid(), getX5c());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JwksKeyDto {\n");
        sb.append("    kty: ").append(toIndentedString(getKty())).append("\n");
        sb.append("    use: ").append(toIndentedString(getUse())).append("\n");
        sb.append("    kid: ").append(toIndentedString(getKid())).append("\n");
        sb.append("    x5c: ").append(toIndentedString(getX5c())).append("\n");
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


/*
 * Poly API
 * An example of a polymorphic API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: johannes@brodwall.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.poly.model;

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
* OrganizationDto
*/
public class OrganizationDto implements AnyPartyDto {

    private UUID id = null;

    private String type;

    private String name;

    private String organizationId = null;

    private URI url = null;

    private String email = null;

    private List<String> emailDomains = null;

    private String phone = null;

    public static String[] readOnlyFields() {
        return new String[] {
                "id",
                "emailDomains",
        };
    }

    public static String[] writeOnlyFields() {
        return new String[] {
        };
    }

    public static String[] requiredFields() {
        return new String[] {
                "type",
                "name",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getType())) result.add("type");
        if (isMissing(getName())) result.add("name");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
        if (!isMissing(getId())) {
            result.add("OrganizationDto.id");
        }
        if (!isMissing(getEmailDomains()) && !getEmailDomains().isEmpty()) {
            result.add("OrganizationDto.emailDomains");
        }
    }

    private boolean isMissing(String s) {
        return s == null || s.isEmpty();
    }

    private boolean isMissing(List<?> list) {
        return list == null;
    }

    private boolean isMissing(Object s) {
        return s == null;
    }


    /**
     * Get id
     * read only
     * @return id
     */
    public UUID getId() {
        return id;
    }

    /** <strong>read only</strong> */
    public void setId(UUID id) {
        this.id = id;
    }

    public OrganizationDto id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OrganizationDto type(String type) {
        this.type = type;
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

    public OrganizationDto name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get organizationId
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public OrganizationDto organizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public OrganizationDto url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public OrganizationDto email(String email) {
        this.email = email;
        return this;
    }

    public <T> OrganizationDto emailDomains(Collection<T> items, Function<T, String> mapper) {
        return emailDomains(items.stream().map(mapper).collect(Collectors.toList()));
    }

    public <T> List<T> getEmailDomains(Function<String, T> mapper) {
        return getEmailDomains().stream().map(mapper).collect(Collectors.toList());
    }

    public OrganizationDto addEmailDomainsItem(String emailDomainsItem) {
        if (this.emailDomains == null) {
            this.emailDomains = new ArrayList<>();
        }
        this.emailDomains.add(emailDomainsItem);
        return this;
    }

    /**
     * Get emailDomains
     * read only
     * @return emailDomains
     */
    public List<String> getEmailDomains() {
        return emailDomains;
    }

    /** <strong>read only</strong> */
    public void setEmailDomains(List<String> emailDomains) {
        this.emailDomains = emailDomains;
    }

    public OrganizationDto emailDomains(List<String> emailDomains) {
        this.emailDomains = emailDomains;
        return this;
    }

    /**
     * Get phone
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public OrganizationDto phone(String phone) {
        this.phone = phone;
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
        OrganizationDto organization = (OrganizationDto) o;
        return Objects.equals(this.getId(), organization.getId()) &&
                Objects.equals(this.getType(), organization.getType()) &&
                Objects.equals(this.getName(), organization.getName()) &&
                Objects.equals(this.getOrganizationId(), organization.getOrganizationId()) &&
                Objects.equals(this.getUrl(), organization.getUrl()) &&
                Objects.equals(this.getEmail(), organization.getEmail()) &&
                Objects.equals(this.getEmailDomains(), organization.getEmailDomains()) &&
                Objects.equals(this.getPhone(), organization.getPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getType(), getName(), getOrganizationId(), getUrl(), getEmail(), getEmailDomains(), getPhone());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationDto {\n");
        sb.append("    id: ").append(toIndentedString(getId())).append("\n");
        sb.append("    type: ").append(toIndentedString(getType())).append("\n");
        sb.append("    name: ").append(toIndentedString(getName())).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(getOrganizationId())).append("\n");
        sb.append("    url: ").append(toIndentedString(getUrl())).append("\n");
        sb.append("    email: ").append(toIndentedString(getEmail())).append("\n");
        sb.append("    emailDomains: ").append(toIndentedString(getEmailDomains())).append("\n");
        sb.append("    phone: ").append(toIndentedString(getPhone())).append("\n");
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


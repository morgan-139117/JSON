
package com.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "created_at",
    "birthdate",
    "chain_id",
    "custom_data",
    "email",
    "first_name",
    "last_name",
    "name",
    "phone",
    "points",
    "state"
})
public class Attributes {

    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("birthdate")
    private String birthdate;
    @JsonProperty("chain_id")
    private String chainId;
    @JsonProperty("custom_data")
    private CustomData customData;
    @JsonProperty("email")
    private String email;
    @JsonProperty("first_name")
    private Object firstName;
    @JsonProperty("last_name")
    private Object lastName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("points")
    private Integer points;
    @JsonProperty("state")
    private String state;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("birthdate")
    public String getBirthdate() {
        return birthdate;
    }

    @JsonProperty("birthdate")
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @JsonProperty("chain_id")
    public String getChainId() {
        return chainId;
    }

    @JsonProperty("chain_id")
    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    @JsonProperty("custom_data")
    public CustomData getCustomData() {
        return customData;
    }

    @JsonProperty("custom_data")
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("first_name")
    public Object getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(Object firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("last_name")
    public Object getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(Object lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("points")
    public Integer getPoints() {
        return points;
    }

    @JsonProperty("points")
    public void setPoints(Integer points) {
        this.points = points;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

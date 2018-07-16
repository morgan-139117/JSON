
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
    "gender",
    "zipcode",
    "linked_card",
    "partner_uuid",
    "preferences_receive_promo_emails",
    "preferences_receive_txt_messages",
    "preferences_receive_receipt_emails",
    "preferences_receive_push_notifications"
})
public class CustomData {

    @JsonProperty("gender")
    private String gender;
    @JsonProperty("zipcode")
    private String zipcode;
    @JsonProperty("linked_card")
    private String linkedCard;
    @JsonProperty("partner_uuid")
    private String partnerUuid;
    @JsonProperty("preferences_receive_promo_emails")
    private String preferencesReceivePromoEmails;
    @JsonProperty("preferences_receive_txt_messages")
    private String preferencesReceiveTxtMessages;
    @JsonProperty("preferences_receive_receipt_emails")
    private String preferencesReceiveReceiptEmails;
    @JsonProperty("preferences_receive_push_notifications")
    private String preferencesReceivePushNotifications;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("zipcode")
    public String getZipcode() {
        return zipcode;
    }

    @JsonProperty("zipcode")
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @JsonProperty("linked_card")
    public String getLinkedCard() {
        return linkedCard;
    }

    @JsonProperty("linked_card")
    public void setLinkedCard(String linkedCard) {
        this.linkedCard = linkedCard;
    }

    @JsonProperty("partner_uuid")
    public String getPartnerUuid() {
        return partnerUuid;
    }

    @JsonProperty("partner_uuid")
    public void setPartnerUuid(String partnerUuid) {
        this.partnerUuid = partnerUuid;
    }

    @JsonProperty("preferences_receive_promo_emails")
    public String getPreferencesReceivePromoEmails() {
        return preferencesReceivePromoEmails;
    }

    @JsonProperty("preferences_receive_promo_emails")
    public void setPreferencesReceivePromoEmails(String preferencesReceivePromoEmails) {
        this.preferencesReceivePromoEmails = preferencesReceivePromoEmails;
    }

    @JsonProperty("preferences_receive_txt_messages")
    public String getPreferencesReceiveTxtMessages() {
        return preferencesReceiveTxtMessages;
    }

    @JsonProperty("preferences_receive_txt_messages")
    public void setPreferencesReceiveTxtMessages(String preferencesReceiveTxtMessages) {
        this.preferencesReceiveTxtMessages = preferencesReceiveTxtMessages;
    }

    @JsonProperty("preferences_receive_receipt_emails")
    public String getPreferencesReceiveReceiptEmails() {
        return preferencesReceiveReceiptEmails;
    }

    @JsonProperty("preferences_receive_receipt_emails")
    public void setPreferencesReceiveReceiptEmails(String preferencesReceiveReceiptEmails) {
        this.preferencesReceiveReceiptEmails = preferencesReceiveReceiptEmails;
    }

    @JsonProperty("preferences_receive_push_notifications")
    public String getPreferencesReceivePushNotifications() {
        return preferencesReceivePushNotifications;
    }

    @JsonProperty("preferences_receive_push_notifications")
    public void setPreferencesReceivePushNotifications(String preferencesReceivePushNotifications) {
        this.preferencesReceivePushNotifications = preferencesReceivePushNotifications;
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

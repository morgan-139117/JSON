
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
    "point_changes",
    "chain",
    "offers",
    "rewards",
    "unfulfilled_redemptions",
    "segments"
})
public class Relationships {

    @JsonProperty("point_changes")
    private PointChanges pointChanges;
    @JsonProperty("chain")
    private Chain chain;
    @JsonProperty("offers")
    private Offers offers;
    @JsonProperty("rewards")
    private Rewards rewards;
    @JsonProperty("unfulfilled_redemptions")
    private UnfulfilledRedemptions unfulfilledRedemptions;
    @JsonProperty("segments")
    private Segments segments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("point_changes")
    public PointChanges getPointChanges() {
        return pointChanges;
    }

    @JsonProperty("point_changes")
    public void setPointChanges(PointChanges pointChanges) {
        this.pointChanges = pointChanges;
    }

    @JsonProperty("chain")
    public Chain getChain() {
        return chain;
    }

    @JsonProperty("chain")
    public void setChain(Chain chain) {
        this.chain = chain;
    }

    @JsonProperty("offers")
    public Offers getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(Offers offers) {
        this.offers = offers;
    }

    @JsonProperty("rewards")
    public Rewards getRewards() {
        return rewards;
    }

    @JsonProperty("rewards")
    public void setRewards(Rewards rewards) {
        this.rewards = rewards;
    }

    @JsonProperty("unfulfilled_redemptions")
    public UnfulfilledRedemptions getUnfulfilledRedemptions() {
        return unfulfilledRedemptions;
    }

    @JsonProperty("unfulfilled_redemptions")
    public void setUnfulfilledRedemptions(UnfulfilledRedemptions unfulfilledRedemptions) {
        this.unfulfilledRedemptions = unfulfilledRedemptions;
    }

    @JsonProperty("segments")
    public Segments getSegments() {
        return segments;
    }

    @JsonProperty("segments")
    public void setSegments(Segments segments) {
        this.segments = segments;
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

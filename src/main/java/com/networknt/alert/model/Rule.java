
package com.networknt.alert.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Rule {

    
    private String timeframe;
    
    private String search;
    
    private String alerter;
    
    private String name;
    
    private Integer min_events;
    
    private Boolean disabled;
    
    private java.lang.Long id;
    
    private String type;
    
    private String frequency;
    

    public Rule () {
    }

    
    
    @JsonProperty("timeframe")
    public String getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(String timeframe) {
        this.timeframe = timeframe;
    }
    
    
    
    @JsonProperty("search")
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
    
    
    
    @JsonProperty("alerter")
    public String getAlerter() {
        return alerter;
    }

    public void setAlerter(String alerter) {
        this.alerter = alerter;
    }
    
    
    
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    @JsonProperty("min_events")
    public Integer getMin_events() {
        return min_events;
    }

    public void setMin_events(Integer min_events) {
        this.min_events = min_events;
    }
    
    
    
    @JsonProperty("disabled")
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }
    
    
    
    @JsonProperty("id")
    public java.lang.Long getId() {
        return id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }
    
    
    
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
    @JsonProperty("frequency")
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
    
    

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rule Rule = (Rule) o;

        return Objects.equals(timeframe, Rule.timeframe) &&
        Objects.equals(search, Rule.search) &&
        Objects.equals(alerter, Rule.alerter) &&
        Objects.equals(name, Rule.name) &&
        Objects.equals(min_events, Rule.min_events) &&
        Objects.equals(disabled, Rule.disabled) &&
        Objects.equals(id, Rule.id) &&
        Objects.equals(type, Rule.type) &&
        
        Objects.equals(frequency, Rule.frequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeframe, search, alerter, name, min_events, disabled, id, type,  frequency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Rule {\n");
        
        sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    alerter: ").append(toIndentedString(alerter)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    min_events: ").append(toIndentedString(min_events)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

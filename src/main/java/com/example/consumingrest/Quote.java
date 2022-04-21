package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Value;

/*
* Domain class to contain the data needed to interact with RESTful service
* @JsonIgnoreProperties: ignore properties not bound in this type
* @JsonProperty can be used to specify name of JSON document key
* when names do not match
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String type;
    private Value value;

    public Quote() {
    }

    public String getType() {
        return type;
    }

    public String setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}

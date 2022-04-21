package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
 * Class in  which to embed the inner quotation
 * @JsonIgnoreProperties: ignore properties not bound in this type
 * @JsonProperty can be used to specify name of JSON document key
 * when names do not match
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private long id;
    private String quote;

    public Long getId() {
        return id;
    }

    public String getQuote() {
        return quote;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuotes(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                '}';
    }
}

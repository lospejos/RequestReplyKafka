
package com.gauravg.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import static com.gauravg.Const.KEY_FIRST_NUMBER;
import static com.gauravg.Const.KEY_SECOND_NUMBER;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    KEY_FIRST_NUMBER,
    KEY_SECOND_NUMBER
})
public class Model {

@JsonProperty(KEY_FIRST_NUMBER)
private int firstNumber;
@JsonProperty(KEY_SECOND_NUMBER)
private int secondNumber;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty(KEY_FIRST_NUMBER)
public int getFirstNumber() {
return firstNumber;
}

@JsonProperty(KEY_FIRST_NUMBER)
public void setFirstNumber(int firstNumber) {
this.firstNumber = firstNumber;
}

@JsonProperty(KEY_SECOND_NUMBER)
public int getSecondNumber() {
return secondNumber;
}

@JsonProperty(KEY_SECOND_NUMBER)
public void setSecondNumber(int secondNumber) {
this.secondNumber = secondNumber;
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
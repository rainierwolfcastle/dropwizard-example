package io.dropwizard;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class HelloWorldConfiguration : Configuration() {
    @NotEmpty private var template: String = ""
    @NotEmpty private var defaultName: String = "Stranger"

    @JsonProperty fun getTemplate(): String {
        return this.template
    }

    @JsonProperty fun setTemplate(template: String) {
        this.template = template
    }

    @JsonProperty fun getDefaultName(): String {
        return defaultName
    }

    @JsonProperty fun setDefaultName(name: String) {
        this.defaultName = name
    }    
}
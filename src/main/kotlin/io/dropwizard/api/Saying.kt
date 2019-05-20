package io.dropwizard.api

import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.validator.constraints.Length

class Saying {
    private var id: Long? = 0
    @Length(max = 3) private var content: String? = null

    constructor(): super()

    constructor(id: Long, content: String) {
        this.id = id
        this.content = content
    }
    
    @JsonProperty fun getId(): Long? {
        return id
    }

    @JsonProperty fun getContent(): String? {
        return content
    }
}
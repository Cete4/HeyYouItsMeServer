package com.example.heyyouitsmeserver.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*

@Entity
@JsonIgnoreProperties
class Message(private val str: String) {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    var id: Long = 0


    @JsonProperty
    var content: String = str;


    override fun toString(): String {
        return "Message(id=$id, content='$content')"
    }
}
package com.example.heyyouitsmeserver.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*

@Entity
class Message(@JsonProperty("content") private val content: String) {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    @JsonProperty("id")
    var id: Long = 0


    override fun toString(): String {
        return "Message(id=$id, content='$content')"
    }
}
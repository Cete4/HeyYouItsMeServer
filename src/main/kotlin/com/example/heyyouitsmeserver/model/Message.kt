package com.example.heyyouitsmeserver.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@Entity
@JsonIgnoreProperties
class Message(private val content: String = "Default") {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    var id: Long = 0


    override fun toString(): String {
        return "Message(id=$id, content='$content')"
    }
}
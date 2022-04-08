package com.example.heyyouitsmeserver.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*

@Entity
@JsonIgnoreProperties
class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    var id: Long? = null


    @JsonProperty
    var content: String = "";


}
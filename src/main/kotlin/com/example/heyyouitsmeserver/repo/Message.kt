package com.example.heyyouitsmeserver.repo

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import com.example.heyyouitsmeserver.model.Message

@Repository
interface Message : CrudRepository<Message, Long?>
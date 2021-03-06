package ru.itmo.bllab1.service

import org.springframework.stereotype.Service
import ru.itmo.bllab1.repo.Client
import java.time.LocalDateTime

interface MessageService {
    fun sendNotificationToClient(notification: String, client: Client)
}

@Service
class MessageServiceStub : MessageService {
    override fun sendNotificationToClient(notification: String, client: Client) {}
}

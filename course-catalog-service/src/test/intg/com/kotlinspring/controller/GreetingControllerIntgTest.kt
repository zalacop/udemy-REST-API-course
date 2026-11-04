package com.kotlinspring.controller

import org.junit.jupiter.api.Assertions
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.webclient.test.autoconfigure.AutoConfigureWebClient
import org.springframework.test.web.reactive.server.WebTestClient
import kotlin.test.Test

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebClient
class GreetingControllerIntTest {

    @Autowired
    lateinit var webTestClient: WebTestClient

    @Test
     fun retrieveGreeting() {

        val name = "Zala"

        val result = webTestClient.get()
            .uri("/v1/greetings/{name}", name)
            .exchange()
            .expectStatus().is2xxSuccessful
            .expectBody(String::class.java)
            .returnResult()

        Assertions.assertEquals("$name, Hello from default profile", result.responseBody)
    }


}
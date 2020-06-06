package com.tgarcia.labs.elk.infra.controllers

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
private val LOG: Logger = LogManager.getLogger(LogStashTest::class)

@Controller
@RequestMapping("/api/test-logs")
class LogStashTest
{
    @GetMapping()
    fun logStashTest(): ResponseEntity<*> {

        LOG.debug("Debug in our greeting controller")
        LOG.info("Info in our greeting controller")
        LOG.warn("Warning in our greeting controller")
        LOG.error("Error in our greeting controller")
        LOG.fatal("FATAL in our greeting controller")

        return ResponseEntity.status(HttpStatus.OK).body("Show the logs in Kibana!!")
    }
}
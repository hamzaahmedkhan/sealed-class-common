package com.github.hamzaahmedkhan.sealed_class_common

import com.github.hamzaahmedkhan.sealed_class_service_1.ProfileProducer
import com.github.hamzaahmedkhan.sealed_class_service_1.profileConsumer
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

suspend fun main() {

    val producer = ProfileProducer()

    // KAFKA dummy copy
    GlobalScope.launch {
        producer.state.collectLatest{ profileType ->
            profileConsumer(profileType)
        }

    }
    producer.sendMeStates()


}



package org.leegeonhui.project

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return platform.name
    }
}
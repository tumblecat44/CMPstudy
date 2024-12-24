package org.leegeonhui.project.network.test

data class RoomInfo(
    val status: Int,
    val state: String,
    val message: String,
    val data: RoomData,
)

data class RoomData(
    val id: Int,
    val name: String,
    val participants: List<String>,
    val lastMessage: String
)
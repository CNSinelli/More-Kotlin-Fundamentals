enum class Daypart {
    morning,
    afternoon,
    evening,
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val duration: Int,
)

fun main() {
    val event = Event(title="Study Kotlin", description="Commit to studying Kotlin at least 15 minutes per day.", daypart=Daypart.morning, duration=15)
    println("Title: "+event.title)
    println("Description: "+event.description)
    println("Daypart: "+event.daypart)
    println("Duration: "+event.duration)
}
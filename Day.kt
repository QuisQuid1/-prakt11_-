enum class Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}
fun displayDay(day: Day) {
    println("День недели: ${day.name}, Номер дня недели: ${day.ordinal + 1}")
}

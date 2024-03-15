//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    try {

        println("Выберите день недели (1-7):")
        val day=Day.values()[readLine()!!.toInt()-1]
        println("Выберите цвет (1-7):")
        val color= Color.values()[readLine()!!.toInt()-1]
        displayDay(day)
        displayColor(color)
    }
    catch (e:Exception){
        println("Что то не то")}
}
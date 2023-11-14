package id.infinitelearning.KotlinSubmission.exercise2

/**Latihan 1*/
fun main() {
    println("===LIST BILANGAN GENAP===")
    val bilanganGenap = mutableListOf<Int>()
    var index= 0

    for (i in 1..100) {
        if (i%2 == 0) {
            bilanganGenap.add(index++, i)
        }
    }
    println(bilanganGenap)



    /**Latihan 2 */

    val months = mapOf(
        "Jan" to "January",
        "Feb" to "February",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "December"
    )

    println("\n===MONTHS===")
    months.forEach { entry ->
        println("${entry.key} -> ${entry.value}")
    }

    println("\nIt's ${months.get("Nov")}, I was born in ${months.get("Jun")}")

}
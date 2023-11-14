package id.infinitelearning.KotlinSubmission.exercise4
/**Latihan 1*/

fun main() {
    try {
        // Menentukan dua angka
        val result1 = pembagian(25, 5)
        println("hasil pembagian dari 25/5 = $result1\n")

        val result2 = pembagian(10, 0)
        println("hasil pembagian dari 10/0 = $result2\n")
    }
    catch (e: ArithmeticException) {
        println("terjadi error : ${e.message}")
        println("hasil pembagian dengan 0 = undefined")
    }
}

fun pembagian(a: Int, b:Int) : Int{
    return a/b
}

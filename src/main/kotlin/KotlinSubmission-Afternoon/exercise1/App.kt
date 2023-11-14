package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
*/
fun myProfile() {
    val firstName: String = "Diah Nur Astanti"
    val lastName: String = "Astanti"
    val age: Number = 20
    val isSingle: Boolean = true

    println("===PROFIL SAYA===")
    println("Nama lengkap saya adalah $firstName $lastName")
    println("Saya berusia $age tahun")
    if (isSingle) {
        println("Status saya yaitu single\n")
    }else {
        println("Status saya yaitu tidak single\n")
    }
}

/**
Latihan 2
 */
fun groupDetail(groupId: String, groupMember:
List<Any>, session: String): Any {
    val grup = """
        ===DETAIL GRUP===
        Id Grup = $groupId
        Sesi = $session
        Anggota Grup = $groupMember
    """.trimIndent()

    return println(grup)
}

/**
Latihan 3
 */

fun myTeam(): List<Any> {
    val groupMembers = listOf("Defry Salwan", "Ahmad Rofiq", "Diah Nur Astanti", "Deni Zailani", "Firyal Wishal N")


    return listOf(groupMembers[0])
}

/**
Latihan 4
 */

fun totalMember(): Int {
    val mentors = arrayOf(
        "Kelvin", "Shania", "Iffan")
    val groupMembers = arrayOf("Defry Salwan", "Ahmad Rofiq", "Diah Nur Astanti", "Deni Zailani", "Firyal Wishal N")

    return mentors.size + groupMembers.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember\n")

    /**
    Latihan 5
     */
    groupDetail("10", listOf("Defry Salwan", "Ahmad Rofiq", "Diah Nur Astanti", "Deni Zailani", "Firyal Wishal N"),
        "Afternoon A")

}

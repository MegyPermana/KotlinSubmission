package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    try {
        validateAndSayHello("Megy")
//      validateAndSayHello("")
        println("Kotlin")
    } catch (error: Exception){
        println("Terjadi Error ${error.message}")
    } finally {
        println("Program Selesai")
    }
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
fun validateAndSayHello(name: String) {
    if (name.isBlank()) {
        throw Exception("Name is blank")
    } else {
        println("Hello $name")
    }
}

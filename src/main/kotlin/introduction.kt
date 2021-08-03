package collections

fun main(args: Array<String>) {

        // List - array, Set, Hashmap

    val l1 = listOf("Madrid", "São Paulo", "Berlim") // a listOf é IMUTÁVEL
    val l2 = mutableListOf("Madrid", "São Paulo", "Berlim")
    val a1 = arrayListOf("Madrid", "São Paulo", "Berlim")

    val s1 = setOf("Madrid", "São Paulo", "Berlim", "Berlim") //o setOf impede que elementos repetidos sejam inseridos
    val s2 = mutableSetOf("Madrid", "São Paulo", "Berlim", "Berlim")

    val h1 = hashMapOf<String, String>(Pair("key", "value"), Pair("França", "Paris"))
    println(h1["França"]) // a partir de uma chave eu coonsigo ter um valor e tb hashMapOf já é mutável

    val n1 = mapOf(Pair("key", "value"), Pair("França", "Paris")) //aqui eu não tenho o "add"
    val n2 = mutableMapOf(Pair("key", "value"), Pair("França", "Paris")) // aqui eu tneho o entries.add
}
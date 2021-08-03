package collections

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())

data class Ingredientes(val nome: String, val quantidade: Int)

fun hasIngredient(list: List<Ingredientes>, nome: String): Boolean {
    return list.filter { it.nome == nome }.any()

}


fun main(args: Array<String>) {

    // Cria lista de dados
    val data = listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingredientes("Farinha", 1),
                Ingredientes("Presunto", 5),
                Ingredientes("Queijo", 10),
                Ingredientes("Molho de tomate", 2),
                Ingredientes("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingredientes("Pão", 1),
                Ingredientes("Hamburguer", 3),
                Ingredientes("Queijo", 1),
                Ingredientes("Catupiry", 1),
                Ingredientes("Bacon", 3),
                Ingredientes("Alface", 1),
                Ingredientes("Tomate", 1)
            )
        )
    )

    // Tenho receitas na lista?
    println("tenho receitas? ${if (data.any()) "sim" else "não"}.")

    // Quantas receitas tenho na coleção?
    println("Tenho ${data.count()} receitas.")

    // Qual a primeira e última receita?
    println("A primeira receita é: ${data.first().nome}")
    println("A última receita é: ${data.last().nome}")
    // Qual a soma de calorias?
    val sumCalories = data.sumOf { it.calorias }
    println("A soma de calorias é: $sumCalories")
    // listOf(1,2,3,4,5,3,2).sum()

    // Me dê as duas primeiras receitas
    val firstTwo = data.take(2)
    for (x in firstTwo.withIndex()) {
        println("${x.index + 1} - ${x.value.nome}") // o +1 é apenas para começar do 1 e não do 0
        //o withIndex tudo o que ele fez foi transformar essa lista num tipo de dado que tem um index e um valor para esse index
    }

    // Sei como fazer panqueca? E sushi?
    val knowPancake = data.filter { it.nome == "Panqueca" }.any()
    println("Sei fazer panqueca? ${if (knowPancake) "sim" else "não"}")

    val knowSushi = data.filter { it.nome == "Sushi" }.any()
    println("Sei fazer panqueca? ${if (knowSushi) "sim" else "não"}")

    // Quais são as comidas com mais de 500 calorias?
    val more500 = data.filter { it.calorias > 500 }.forEach { println(it.nome) }

    // Par (chave, valor) de comidas com mais de 500 calorias (nome, calorias)
    data.filter { it.calorias > 500 }.map { Pair(it.nome, it.calorias) }
        .forEach { println("${it.first}: ${it.second} calorias.") }

    // Quais das receitas possui farinha como ingrediente?
    val result = data.filter { hasIngredient(it.ingredientes, "Farinha") }.forEach { println(it.nome) }

}
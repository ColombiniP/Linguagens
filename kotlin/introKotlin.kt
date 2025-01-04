/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

// Variáveis declaradas fora do escopo main(), são ditas variáveis de nível superior
val meuNome = "Paschoal Colombini";
var minhaIdade = 33
var date = 12

fun main() {
    println(meuNome)
    // 'val' é um declarador de variável imutável
    // meuNome = "Outro nome" // essa alteração no conteúdo da variável causa erro, pois 'val' é uma constante
    // print(meuNome) // 'val' cannot be reassigned.
    
    println(minhaIdade)
    
    if (date == 12) {
        minhaIdade++
        print("Nova idade: ")
        println(minhaIdade)
    }
    
    // usando o declarador 'var' consegimos alterar o valor da variável
    
    //usando a tamplate String
    // a tamplate String é declarada colocando a variável dentro do escopo com '${variavel}'
    println(" ")
    println("Idade ${minhaIdade}")
    println("Nova idade: ${minhaIdade + 1}")
    
    println(" ")
    var numero = 1
    println(numero)
    numero += 5
    println(numero)
    numero -= 2
    println(numero)
    numero *= 2
    println(numero)
    numero /= 2
    println(numero)
    
    if(numero % 2 == 0) {
        println("$numero é par")
    } else {
        println("$numero é ímpar")
    }

    
    // TIPOS BÁSICOS
    
    println("---------------")
    println(" ")
    // declarando uma variável tipada e sem atribuição
    
    val fa: Int
    fa = 3
    println(fa)
    
    
    // declarando uma variável com tipo e atribuindo o valor
    
    println(" ")
    val es: String = "Olá!";
    println(es)
    
    
    val s: Boolean
    
    
    
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'

    
    
    // COLEÇÕES
    
    //LISTS -> Coleção ordenada de itens
    //SETS -> Coleção única e não ordenada de itens
    //MAPS -> Conjunto de pares de chave-valor onde as chaves são únicas e mapeadas para apenas um valor
    
    
    // Listas armazenam itens na sequancia que foram adicionadas e permite que itens sejam duplicados 
    // O Kotlin infere o tipo da lista a não ser que seja explicitamente declarado com <> depois de declarado
    // Criamos uma lista imutáve usando o listOf()
    val formasConstantes: List<String> = listOf("Circulo", "Quadrado", "Triangulo")
    println(formasConstantes)
    
    // Criamos uma lista mutáve usando o mutableListOf()
    val formas = mutableListOf("Circulo", "Quadrado", "Triangulo")
    println(formas)
    
    println(formas[1]);
    println("O último item da lista é o '${formas.last()}'")
    println("O último item da lista é o '${formasConstantes.first()}'")
    println("A lista tem um total de ${formas.count()} itens")
    println("Exagono" in formas) // retorna um boolean
    val exagono: String = "Exagono"
    val naoTemNaLista =  exagono in formas
    if (!naoTemNaLista) {
        formas.add(exagono)
        println(formas)
    }
    val circulo = "Circulo"
    if (circulo in formas) {
        formas.remove(circulo)
        println(formas)
    }
    
    println(" ")
    
    // Diferente das lists os sets não permitem itens duplicados, temos os sets mutáveis e imutáveis como nas lists e da mesma forma
    // se não especificado o tipo, o kotlin infere automaticamente 
    
    // set imutável usamos o setOf()
    val setImutavelUm: Set<String> = setOf("maçã", "banana", "pêra", "maçã")
    val setImutavelDois = setOf(1,2,3,4,5,1)
    
    // set mutável usamos o MutableSetOf()
    val setMutavel: MutableSet<Int> = mutableSetOf(1,1,2,3,4,4,5,6,7,10);
    
    println(setImutavelUm)
    println("banana" in setImutavelUm)
    println(setImutavelDois)
    println("Temos um total de ${setImutavelUm.count()} itens no conjunto de frutas")
    println(" ")
    println("Esse é o set mutável ${setMutavel}")
    println("No set mutável conseguimos add e remove itens")
    println("dicionando o número 12")
    setMutavel.add(12)
    println("${setMutavel}")
    setMutavel.remove(12)
	println("Removendo o item adicionado ${setMutavel}")  
    
    //tornor o conjuto mutável com um casting
      
    val setMutavelAgoraImutavel: Set<Int> = setMutavel
    println("")
    
    // Maps são conjunto de itens indexados por uma chave-valor, e para acessar o item, podemos passar sua chave como referencia entre []
    // Se tentar acessar uma chave-valor inexistente no map, recebemos um retorno null
    // Cada chave deve ser única para que o kotlin consiga encontrar a referência
    // Os valores podem ser duplicados
    // A maneira mais fácil de relacionar chave-valor é com o operador 'to' mapOf("Banana" to 2.25, "Maçã" to 3.35)
    
    println("Vamos aos Maps")
    println("")
    // Map como os outros conjuntos, temos mutáveis - mutableMapOf() e imutaveis - mapOf() pondendo ter e não ter o tipo implicitamente
    // caso não tenha passado o tipo do conjunto, o kotlin fará a inferência
    
    val precoFrutas: Map<String, Double> = mapOf("Banana" to 2.25, "Maçã" to 3.35, "Abacaxi" to 8.0)
    println(precoFrutas)
    println("Preço da Maçã é: R\$ ${precoFrutas["Maçã"]}");
    println("Preço da Abacaxi é: R\$ ${precoFrutas["Abacaxi"]}");
    println("Preço da Uva é: R\$ ${precoFrutas["Uva"]}"); // não existe na coleção, portanto vamos add
    println("não existe na coleção, portanto vamos add")
    
    
    val abertoPrecoFrutas: MutableMap<String, Double> = mutableMapOf("Banana" to 2.25, "Maçã" to 3.35, "Abacaxi" to 8.0)
    abertoPrecoFrutas["Uva"] = 4.88
    println("Preço da Uva é: R\$ ${abertoPrecoFrutas["Uva"]}");
    println("Vamos remover o Abacaxi")
    abertoPrecoFrutas.remove("Abacaxi")
    println(abertoPrecoFrutas)
    println("Temos um total de ${abertoPrecoFrutas.count()} itens")
    println("Tem abacaxi? ${abertoPrecoFrutas.containsKey("Abacaxi")}")
    val temAbacaxi = abertoPrecoFrutas.containsKey("Abacaxi")
    if (!temAbacaxi) {
        abertoPrecoFrutas["Abacaxi"] = 7.50
        println("Adicionamos a promoção do Abacaxi: R\$ ${abertoPrecoFrutas["Abacaxi"]}")
    }
    
    
    println("Temos algum item que custe 2.25? ${2.25 in precoFrutas.values}")
   
    println("")
    println("EXERCICIOS")
    /**
     * EX 1
     * Você tem uma lista de números “verdes” e uma lista de números “vermelhos”. Complete o código para imprimir quantos números há no total.
     */
     
     
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    // Write your code here
    val total = greenNumbers.count() + redNumbers.count()
    println(total)
    println("")

    /*
     * EX 2
     * Você tem um conjunto de protocolos suportados pelo seu servidor. 
     * Um usuário solicita o uso de um protocolo específico. 
     * Complete o programa para verificar se o protocolo solicitado é suportado ou não ( isSupporteddeve ser um valor booleano).
     */

    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    
    
    println("Support for $requested: $isSupported")
    println("")
    
    /*
     * EX3
     * Defina um mapa que relacione números inteiros de 1 a 3 com suas grafias correspondentes. 
     * Use este mapa para soletrar o número fornecido.
     * */
    
    
     val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
    println("")
    
    
    
    
    
    
    
    
}
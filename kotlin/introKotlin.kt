import kotlin.math.PI
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
    
    
    val lista: List<Int> = listOf(10,5,3,2,4,1,7,9,8,6)
    println(lista)
    // Acessa valores pelo indice 
    println(lista[4])
    
    val listaSet: Set<Int> = setOf(10,5,3,2,4,1,7,9,8,6)
    println(listaSet)
    // Não usa indice ou chaves para acessar os valores
    
    val listaMap: Map<Int, Int> = mapOf(10 to 1,5 to 2,3 to 3,2 to 4,4 to 5,1 to 6,7 to 7,9 to 8,8 to 9,6 to 10)
    println(listaMap)
    // Acessa valores pelas chaves
    println(listaMap[10])
    println("")
    println("")
   
   // 
   
   
   // Fluxo de controle
   // Como em qualquer linguagem de programação, em kotlin também temos as expressões condicionais e loops
   
   // EXPRESSÃO CONDICIONAL
   
   // if
   
    val n1: Int = 2
    val n2: Int = 3
    
    if (n1 == n2) {
        println("Iguais")
    } else {
        println("Não iguais")
    }
       
    // Não usamos ternários em kotlin, se houver uma única linha de teste, podemos usar assim:
    
    println(if (n1 < n2) n1 else n2)
    println("")
    println("")
    
   // when
   
   // Recomendado no caso de multiplas expressões, aninhamentos
   // Usamos o when dessa forma:
   
    val obj = "Hello"
    
    when (obj) {
        // checando o valor de when
        "1" -> println("Um")
        "Hello" -> println ("Ótimo")
        else -> println("Nenhuma opção")
        
        // as verificações são feitas em sequência
    }
    
    // When ainda pode ser atribuido a uma variável
    
    val resultado = when (obj) {
        "1" -> "Um"
        "Hello" -> "Ótimo"
        else -> "Nenhuma opção"
    }
    
    println(resultado)
    
    // usando o when sem uma variável de controle
    
    val luzDeSemaforo = "red"
    val acaoDoCarro = when {
        luzDeSemaforo == "verde" -> "Pode ir"
        luzDeSemaforo == "amarelo" -> "Atenção"
        luzDeSemaforo == "red" -> "Pare"
        else -> "Não está funcionando"
    }
    
    println(acaoDoCarro)
   
   // Mas a forma mais recomendada é com uso de uma variável de controle
    
    val luzDeSemaforo1 = "vermelho"
    val acaoDoCarro1 = when (luzDeSemaforo1) {
        "verde" -> "Pode ir"
        "amarelo" -> "Atenção"
        "vermelho" -> "Pare"
        else -> "Não está funcionando"
    }
    
    println(acaoDoCarro1)
    println("")
    println("")
    
 
    // RANGES -> intervalo para loops com interação
    
    // Usamos o operador '..' para criar um intervalo em Kotlin 1..4 é a mesma coisa que 1,2,3,4
    // Podemos não incluir o valor final com o operador ..< por exemplo 1..<4 é a mesma coisa que 1,2,3
    // Podemos mudar a ordem do intervalo com downTo. por exemplo 4 donwTo 1 é a mesma coisa que 4,3,2,1,
    // Podemos ja definir o valor de incremento da iteração com step, ao inves de 1 vamos incrementar de 2
    	// veja o exemplo 1..5 step 2: 1,3,5
        // 1..10 step 3 = 1,3,5,7,9
        
    // Podemos fazer com caracteres:
    // 'a' .. 'd' = 'a','b','c','d'
    // 'z' donwTo 's' = 'z','y','x','w','v','u','t','s'
    // 'z' donwTo 's' step 2 = 'z','x','v','t'
    
    
    //LOOPS
    
    // for
    
    for (number in 1..10) {
        print("$number,")
    }
    println("")
    
    // PODEMOS ITERAR EM CIMA DAS COLOEÇÔES USANDO LOOPS
    
    val bolos = listOf("Cenoura", "Queijo", "Chocolate");
    for (bolo in bolos) {
        println ("Oba, temos um Bolo de $bolo")
    }
    println("")
    
    //while
    
    var n = 0
    while (n < 10) {
        print(n)
        n++
    }
    println("")
    
    
    // DO-WHILE
    
    
    var num = 0
    do {
		println(num)
        num++
    } while (num < 10) 
    
    // EXERCICIOS
    /*
     * Escreva um programa que simule o jogo Fizz buzz. Sua tarefa é imprimir números de 1 a 100 incrementalmente, 
     * substituindo qualquer número divisível por três pela palavra "fizz", 
     * e qualquer número divisível por cinco pela palavra "buzz".
     * Qualquer número divisível por 3 e 5 deve ser substituído pela palavra "fizzbuzz".
     * */
    
    for (i in 1..100) {
        when {
            i % 3 == 0 && i % 5 == 0 -> print("(fizzbuzz), ")
            i % 3 == 0 -> print("(fizz), ")
            i % 5 == 0 -> print("(buzz), ")
            else -> print("$i, ")
        }
    }
    
    println("")
    println("")
    
    
    /*
     * Você tem uma lista de palavras. Use for e if para imprimir somente as palavras que começam com a letra l.
     * */
     
     val words = listOf("dinosaur", "limousine", "magazine", "language")
     
     for (word in words) {
         if (word.startsWith("l")){ 
             println(word)
         }
     }
    

     val lista = listOf(1,2,3,4,5)
    for((indice,valor) in lista.withIndex()) {/*println("Índice: $indice valor:$valor")*/}
	println("")
    var x = 0
    while(x < 10) {
        //println(x.toString())
        x++
    }
    
    
        // FUNÇÕES

    // Definimos funções como um conjunto de código agrupado em um bloco
    // Para definir uma função usamos a palavra 'fun' seguida do nome da função

    fun soma(a: Int, b: Int) : Int 
    {
        return a + b
    }

    println(soma(4,5))
    
    // Podemos ter funções sem retorno, e para isso usamos o tipo : Unit
    // Como é uma função sem retorno, podemos omitir o tipo Unit, e o kotlin faz a inferência
    
    fun dizOi() : Unit
    {
        println("Olá, mundo!")
    }
    
    dizOi()
    
    // Single-Expression functions (Funções de expressões únicas) quando há apenas 1 linha, não precisa de chaves
    
    fun plus(num1: Int, num2: Int) = num1 + num2
    println(plus(234,342))
    
    fun sayHello() = println("Hello, world!") 
    sayHello()
    
    // E em expressões de linha única não tem a necessidade da palavra return ou tipar o retorno

    /*
        Usando a palavra return no corpo da função, faz com que o a verificação seja interropida
    */


    val nomeDeUsuarios = mutableListOf("usuario1","usuario2","usuario3")
    fun cadastroDeUsuario(nomeDeUsuario:String): String {
        if (nomeDeUsuario in nomeDeUsuarios) {
            return "Usuário já cadastrado"
        } else {
            println("Digite o usuário")
        }
    }


    /**
    * EXERCICIOS

        1 Escreva uma função chamada circleArea que recebe 
        o raio de um círculo em formato inteiro como parâmetro e gera a área desse círculo.
        FORMULA a = PI*r²
    */

    fun circleArea(r:Int) : Double {
        var r = r * 2
        return PI * r
    }

    fun circleAreaSEF(radius:Int) = PI * radius * radius

    println(circleArea(2))
    println(circleAreaSEF(2))


/*
 * Você tem uma função que traduz um intervalo de tempo dado em horas, minutos e segundos em segundos.
 * Na maioria dos casos, você precisa passar apenas um ou dois parâmetros de função, enquanto o restante é igual a 0.
 * Melhore a função e o código que a chama usando valores de parâmetros padrão e argumentos nomeados para que o código seja mais fácil de ler.
 * */

fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) = ((hours * 60) + minutes) * 60 + seconds

fun main() {
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(minutes =  1, seconds = 25))
    println(intervalInSeconds(hours = 2))
    println(intervalInSeconds(minutes = 10))
    println(intervalInSeconds(hours = 1, seconds = 1))

}

    
    // ORIENTAÇãO a OBJETOS
    // Kotlin é uma linguagem orientada a obejetos, além de ter o paradigma funcional.
    // Podemos definir programação orientada a objetos a um modelo baseado em objetos.
    // OBJETO -> é uma 'abstração' de algo do mundo real ou não
    // Um objeto tem propriedades -> caracteristicas e tem métodos -> o que ele faz (ação)
    
    open class Carro {
        var nome: String = ""
        var marca: String = ""
        var cor: String = ""
        var ano: Int = 0
        
        fun andar() {
            println("Carro em movimento")
        }
        
        fun parar() {
            println("Carro parou")
        }
    }
    
    // A classe carro é um molde, e dessa classe classe podemos instanciar vários obejtos
    
    val c3 = Carro() // Esse é a forma de instancia a classe carro, e criamos o objeto c3
    c3.ano = 2010
    c3.cor = "Prata"
    c3.marca = "Citroen"
    c3.nome = "Citroen C3"
    
    println(c3.nome)
    c3.andar()
    c3.parar()
    println("")
    
    val civic = Carro()
    civic.cor = "Preto"
    civic.nome = "Honda Civic"
    civic.marca = "Honda"
    civic.ano = 2020
    
    println(civic.nome)
    civic.andar()
    civic.parar()
    println("")
    
    // Em POO temos alguns conceitos que chamamamos de pilares (HERANÇA) (ENCAPSULAMENTO) (POLIMORFISMO) (ABSTRAÇÃO)
    
    /* HERANÇA
     é a habilidade de herdar caracteristicas de uma outra classe, evita reescrita de código
     criamos a classe que vai receber a herança e tipamos com a classe que possue as caracteristicas
     a classe 'pai' precisa permitir explicitamente que a classe 'filha' herde com a palavra 'open' antes da palavra class
    */
    
    class CarroEspecial : Carro() {
        
        fun fazerDrift() {
            println("Cavalo de pau")
        }
        
    }
    
    val tunado = CarroEspecial()
    
    // tunado.marca("Nissan")
    // tunado.ano(1998)
    // tunado.nome("Nissan Skiline GT")
    // tunado.cor("fucsia metalico")
    
    // println(tunado.nome)
    tunado.andar()
    tunado.fazerDrift()
   
   
   /*
    * Em kotlin temos uma classe de dados, usada para armazenar propriedade e não tem uma função, como um usuário que tem nome, senha, email ...
    * ótima para mater a organização.
    * Usamos a palavra 'data' antes da palavra class, além de poder ser feita em 1 linha
    * */
    
    data class Usuario(var nome:String, var email:String, var senha:String)
    
    



















    
    
}
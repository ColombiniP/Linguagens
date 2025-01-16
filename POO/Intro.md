# Intro Paradigma de Programação Orientada a Objetos

Para entender o os conceitos de POO, usaremos java que é uma linguagem totalmene voltada a esse paradigma, vamos usar os livros do professo Ricardo da Costa Veras - Liguagem de Programação Orientada a Objetos de I ao IV.

## Temas de cada modulo

- Modulo I - Classes, Objetos, Atributos, Métodos e estrutura lógica 
- Modulo II - Encapsulamento, Herança Polimorfismo e bases de entendimento dos modificadores private public protected e default, além de métodos construtores
- Mudulo III - Polimorfismo de classes e os modificadores static, final, abstract e as interfaces
- Mudulo IV - Execeções e processo paralelo

## Introdução

O paradigma da programação orientada a objetos possui três pilares:

- Herança; (Permite o reaproveitamento de código)
- Encapsulamento; (Protege a utilização inapropriada de atributos de uma classe)
- Polimorfismo; (Permite um elemento se comportar de forma diferente dependendo de como é estruturado)

OO representa entidades do mundo real

Objeto é um elemento criado em mémoria (RAM) a partir de um modelo da classe, de forma a possuir todas as suas caracteristicas. Já a classe é o molde para criar obejtos.

## Java

- O método main é o responsável por acionar um programa java. Ele precisa existir em apenas uma das classes do sistema construido (naquela que acionará o programa).

Sua sintaxe 

```java
public class ClasseA {
    public static void main(String[] args) {
        // Código
    }
}
```

- Classe são modelos para se construi os objetos, a classe possui
    - Atributos: elementos que definem a classe
    - Métodos: elementos que definem as possíveis ações dos obejetos gerados

- Representação da classe via UML


|classes| ordem
|-------|------|
|atributos| primeiro
|métodos| por último

Um exemplo de Classe qualquer e a disponibilidade dos atributos e métodos

```java
public class ClasseQualquer {
    
    public int atributo1;
    public int atributo2;
    public int atributoN;

    public void metodo1() {
        // Código do método
    }

    public void metodo2() {
        // Còdigo do método
    }
}
```

A sintaxe de uma classe deve ser:
```java
public class NomeDaClasse {
    //....
}
```
- Os objetos são as classes em memória, gerados quando o sistema é executado

A sintaxe de um objeto

```java
NomeDaClasse nomeDoObjeto = new NomeDaClasse();
```
Gerar um objeto em memória, é instanciar uma classe.
A partir de uma classe, podemos instanciar diversos objetos

- Atributo é uma caracteristica que defina uma classe.
exemplo

```java
public class ClasseQualquer {
    public int quantidadeProduto;
    // ou ainda
    public int quantidadeEstoque = 0;
    private String nomeSistema = "Sistema de Compras";
}
```
- Métodos é a ação que pode ser acionada após instanciar a classe. Métodos podem possuir parâmetros separados por virgula, e retornam algum valor, quando o método possui retorno, especificamos o tipo do dado retornado, se o método não possui retorno, o tipo é void.

- Modificadores de acesso
    - public;
    - private;
    - protected;
    - (defaut);

- Modificadores de comportamento
    - static; (este não é utilizado para classes)
    - final;
    - abstract (este não é utilizado para atributos)

Vejamos o exemplo:
```java
public class SomaValores {
    
    // - atributos da classe
    public int resultInt;
    public double resultDouble;

    // - métodos da classe
    public int somarInteiros(int a, int b) {
        int result = a + b;
        resultInt = result;
        return result;
    }

    public double somarReais(double a, double b) {
        double result = a+b;
        resultDouble = result;
        return result;
    }

    public void mostrarResultado() {
        String txt = "--------\n";
        txt += “Resultado da soma de Inteiros: “ + resultInt + “\n”;
        txt += “Resultado da soma de Reais: “ + resultDouble + “\n”;
        System.out.println(txt);
    }

    public static void main(String[] args) {
        SomaValores sv = new SomaValores();
        int vi = sv.somarInteiros(7,15);
        System.out.println(vi);
        double vd = sv.somarReais(3.6,9.2);
        System.out.println(vd);
        sv.mostrarResultado();
    }

}
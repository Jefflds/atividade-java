## Programação Orientada a Objetos em Java
# Java
## _Programação Orientada a Objetos_

![HastyDEV](https://1000logos.net/wp-content/uploads/2020/09/Java-Logo.png)

## Arquivo Principal: App_Jogo.java
## Pacotes e Importações
O código começa com a importação de classes necessárias, como `ArrayList` e `Scanner`, que estão contidas no pacote `java.util`. Isso permite que você use essas classes em seu código.

```java
package jogo;

import java.util.ArrayList;
import java.util.Scanner;
```

## Classe Principal (app_jogo)
A classe `app_jogo` contém o método `main`, que é o ponto de entrada do programa. Aqui, um objeto `Scanner` é criado para ler entrada do usuário.

```java
public class app_jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Continuação do Código...
    }
}
```

## Classes de Carro
Há uma hierarquia de classes de carro. A classe `carros` é a classe base, enquanto `carros_especiais` herda dela. Isso demonstra o conceito de herança, onde `carros_especiais` é uma classe derivada que herda propriedades e comportamentos da classe base `carros`.
```java
public class carros {
    // Atributos e construtor

    public class carros_especiais extends carros {
        // Atributos e construtor
    }
}
```

### Conceito de Herança
A Herança possibilita que as classes compartilhem seus atributos, métodos e outros membros da classe entre si. Para a ligação entre as classes, a herança adota um relacionamento esquematizado hierarquicamente.

Na Herança temos dois tipos principais de classe:
 -- Classe Base: A classe que concede as características a uma outra classe.
 -- Classe Derivada: A classe que herda as características da classe base.

## Construtor
Os objetos de carro são criados usando construtores. Um construtor é um método especial chamado quando um objeto é instanciado.
```java
carros c1 = new carros(1, "Ferrari", "LaFerrari", /* ... */);
carros c6 = new carros_especiais(6, "tesla", "foguete car", /* ... */);
```

### Conceito de Construtor
Construtores são basicamente `funções de inicialização de uma classe`, as quais são invocadas no momento em que objetos desta classe são criadas. Eles permitem inicializar campos internos da classe e alocar recursos que um objeto da classe possa demandar, tais como memória, arquivos, semáforos, soquetes, etc.
#### Mas, o que é instanciar?
Pensa assim, uma classe associa `dados` (atributos) e `operações` (métodos) numa só estrutura. `Um objeto é uma instância de uma classe`. Ou seja, uma representação da classe. Por exemplo, usuario1 é uma instância de uma classe chamada Pessoa, mas a Pessoa é a classe que o representa de uma forma genérica. Se você criar um outro objeto chamado usuario2, esse objeto também será uma instancia da classe Pessoa.

## ArrayList
`Listacarros` é uma lista dinâmica que armazena objetos do tipo `carros`. Isso é feito usando a classe `ArrayList`, permitindo adicionar e manipular carros de forma flexível.

```java
ArrayList<carros> Listacarros = new ArrayList<>();
```
### O que é o Array List?
O Java ArrayList, é, basicamente, um `array dinâmico` que encontramos no java.util — um pacote que contém uma grande variedade de recursos, como estruturas de coleções, modelos de data e hora, recursos para internacionalização, entre muitos outras facilidades para o desenvolvimento de aplicações em Java. Esses arrays redimensionáveis são muito úteis quando utilizados para `implementações em que precisamos manipular listas`.

A dinamicidade do recurso possibilita à pessoa desenvolvedora a `criação de coleções — arrays, classes e objetos — sem precisar se preocupar com o redimensionamento dos vetores`. Caso algum haja necessidade de uma posição adicional em um array, o ArrayList realiza a operação de maneira autônoma.

## Polimorfismo
Ao adicionar carros à lista `Listacarros`, tanto objetos da classe base `carros` quanto da classe derivada `carros_especiais` são adicionados. Isso demonstra o polimorfismo.
```java
Listacarros.add(c1);
Listacarros.add(c6);
```
### O que é Polimorfismo?
Definimos Polimorfismo como um princípio a partir do qual as `classes derivadas de uma única classe base são capazes de invocar os métodos` que, embora apresentem a mesma assinatura, comportam-se de maneira diferente para cada uma das classes derivadas.
O Polimorfismo é um `mecanismo` por meio do qual selecionamos as funcionalidades utilizadas de forma dinâmica por um programa no decorrer de sua execução.
Com o Polimorfismo, `os mesmos atributos e objetos podem ser utilizados em objetos distintos, porém, com implementações lógicas diferentes.`
_Por exemplo: podemos assumir que uma bola de futebol e uma camisa da seleção brasileira são artigos esportivos, mais que o cálculo deles em uma venda é calculado de formas diferentes._

## Laço de Repetição
O laço `for` percorre a lista `Listacarros`, imprimindo informações sobre cada carro usando o método `vercarros`.
```java
for (carros carro : Listacarros) {
    System.out.println(carro.vercarros() + "\n");
}
```
## Fluxo de Controle
O código utiliza estruturas de controle como `if e else if` para determinar qual carro foi escolhido e realizar a ação apropriada.
```java
if (escolha == 1) {
    garagem.adicionarCarro(c1);
    System.out.println("Você comprou um " + c1.vercarrosimples());
} else if (escolha == 6) {
    garagem.adicionarCarro(c6);
    System.out.println("Você comprou um " + c6.vercarrosimples());
}
// Restante das condições
```

## Arquivo: Carro.java
## Classe `Carros`

```java
public class carros {

    private int id;
    private String marca;
    private String modelo;
    private float velocidade;
    private float controle;
    private float aceleração;
    private float arrancada;
    private float frenagem; 
    private int preço;  
    private String cor;   
    
    public carros(int id, String marca, String modelo, float velocidade, float controle, float aceleração, float arrancada, float frenagem, int preço, String cor) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.controle = controle;
        this.aceleração = aceleração;
        this.arrancada = arrancada;
        this.frenagem = frenagem;
        this.preço = preço;
        this.cor = cor;
    };
    
    public String vercarros() {
        return id + "- \n Marca: " + marca + "\nModelo: " + modelo + "\nVelocidade: " + velocidade + " km/h" + "\nControle: " + controle + "\nAceleração: " + aceleração + "\nArrancada: " + arrancada + "\nFrenagem: " + frenagem + "\nPreço: R$" + preço + "\nCor: " + cor;
    }
    
    public String vercarrosimples() {
        return marca + "  " + modelo;
    }
    
    void buzinar() {
        System.out.println("biiiiiiii");
    }
    
    void bater() {
        System.out.println("BOOOOOOOMMMM");
    }
}
```
## Classe carros
A classe `carros` representa um carro e contém várias propriedades (atributos) e métodos relacionados a carros. Os atributos são privados, o que significa que eles só podem ser acessados dentro da própria classe.

## Construtor
O construtor carros é usado para inicializar as propriedades do carro quando um objeto é criado. Ele aceita vários parâmetros, como id, marca, modelo, etc., e atribui esses valores às propriedades correspondentes da classe.

## Encapsulamento
Os atributos da classe, como id, marca, modelo, etc., são marcados como privados (private). Isso significa que eles não podem ser acessados diretamente de fora da classe. Em vez disso, são fornecidos métodos públicos (como vercarros e vercarrosimples) para acessar esses valores controladamente.
### Mas, então, o que é encapsulamento?
Encapsulamento vem de encapsular, que em programação orientada a objetos significa `separar o programa em partes`, o mais isolado possível. A idéia é tornar o software mais flexível, fácil de modificar e de criar novas implementações. O Encapsulamento serve para `controlar o acesso aos atributos e métodos de uma classe`. É uma forma eficiente de proteger os dados manipulados dentro da classe, além de determinar onde esta classe poderá ser manipulada. Usamos o nível de acesso mais restritivo, private, que faça sentido para um membro particular. Sempre usamos `private`, a menos que tenhamos um bom motivo para deixá-lo com outro nível de acesso. Não devemos permitir o acesso público aos membros, exceto em caso de ser constantes. Isso porque membros públicos tendem a nos ligar a uma implementação em particular e limita a nossa flexibilidade em mudar o código. O encapsulamento que é dividido em dois níveis:
-- Nível de classe: Quando determinamos o acesso de uma classe inteira que pode ser public ou Package-Private (padrão);
-- Nível de membro: Quando determinamos o acesso de atributos ou métodos de uma classe que podem ser public, private, protected ou Package-Private (padrão).

## Métodos de Acesso
Os métodos `vercarros` e `vercarrosimples` são métodos públicos que permitem visualizar informações sobre o carro. O primeiro método exibe detalhes completos do carro, enquanto o segundo método fornece uma visão simplificada (marca e modelo).

## Métodos Adicionais
Além dos métodos de visualização, a classe também possui dois métodos adicionais: `buzinar e bater`. Esses métodos simulam ações de um carro, como buzinar e colidir. Isso demonstra a ideia de que uma classe pode conter não apenas informações (atributos), mas também comportamentos (métodos).

### Exemplo de Uso
Um exemplo de uso dessa classe é criar objetos de carro e interagir com eles:
```java
carros c1 = new carros(1, "Ferrari", "LaFerrari", 8.3f, 8.8f, 9.6f, 9.3f, 10f, 800000, "vermelho");
System.out.println(c1.vercarros()); // Exibe detalhes completos do carro
c1.buzinar(); // Simula ação de buzina
```
Isso cria um objeto c1 do tipo carros, exibe seus detalhes e emite um som de buzina.

## Arquivo: Carros_especiais.java
## Classe carros_especiais
A classe `carros_especiais` é uma subclasse da classe `carros`, que representa carros especiais. Ela herda todos os atributos e métodos da classe `carros`, incluindo o construtor `carros` e os métodos `vercarros` e `vercarrosimples`.

## Herança:
A herança é um conceito que permite que a classe `carros_especiais` herde todas as características da classe carros. Isso evita a necessidade de duplicar código para os atributos e métodos que são comuns entre carros regulares e especiais.
```java
public class carros_especiais extends carros { // Restante do Código...
```
## Construtor Específico:
A classe `carros_especiais` possui um construtor que chama o construtor da classe `carros` usando `super(...)`. Isso permite que a inicialização dos atributos da classe base seja reutilizada para criar objetos de carros especiais.
```java
    public carros_especiais(int id, String marca, String modelo, float velocidade, float controle, float aceleração, float arrancada, float frenagem, int preço, String cor) {
        super(id, marca, modelo, velocidade, controle, aceleração, arrancada, frenagem, preço, cor);
    }
```

## Sobrescrita de Métodos:
Os métodos `buzinar e bater` são sobrescritos na classe `carros_especiais`. Isso significa que a implementação original desses métodos na classe base `carros` é substituída pela nova implementação na classe carros_especiais. Isso permite que os `carros especiais` tenham comportamentos de buzina e colisão diferentes dos carros regulares.
```java
    @Override
    public void buzinar() {
        System.out.println(" BRRRROOOMMMM!");
    }
    @Override
    public void bater() {
        System.out.println("CRASHHHHHHHH!");
    }
```

### Exemplo de Uso:
Você pode criar objetos da classe carros_especiais da mesma maneira que cria objetos da classe carros. Aqui está um exemplo:
```java
carros_especiais c6 = new carros_especiais(6, "tesla", "foguete car", 10f, 8.0f, 10f, 10f, 9.0f, 3000000, "Cinza");
c6.buzinar(); // Exibe a buzina específica de carros especiais
c6.bater();   // Exibe o som de colisão específico de carros especiais
```
Isso cria um objeto `c6` da classe `carros_especiais`, demonstra a chamada de métodos sobrescritos e exibe seus comportamentos exclusivos.

## Arquivo: Garagem.java
```java
package jogo;
import java.util.ArrayList;

class Garagem<T extends carros> {
    private ArrayList<T> carrosNaGaragem = new ArrayList<>();
    public void adicionarCarro(T carro) {
        carrosNaGaragem.add(carro);
    }
    public void listarCarros() {
        for (T carro : carrosNaGaragem) {
            System.out.println(carro.vercarros());
        }
    }
}
```
## Classe Garagem
A classe `Garagem` é uma classe genérica que permite adicionar e listar carros. Ela utiliza um tipo genérico `T`, que é restrito a ser uma subclasse de `carros` (usando `T extends carros`).

## Classe Genérica:
Uma classe genérica é uma classe que pode ser parametrizada com um ou mais tipos. Neste caso, `Garagem` é uma classe genérica que aceita um tipo `T` que deve ser uma subclasse de `carros`.

## Atributos e Construtor:
A classe `Garagem` possui um atributo `carrosNaGaragem` do tipo `ArrayList` que armazena objetos do tipo `T`. Ela possui métodos para adicionar carros à garagem e para listar os carros na garagem.

## Método adicionarCarro:
Este método permite adicionar um carro à lista `carrosNaGaragem`. Como o tipo genérico `T` é restrito a ser uma subclasse de `carros`, isso garante que apenas objetos que são do tipo de `carros` (ou suas subclasses, como `carros_especiais`) possam ser adicionados à garagem.

## Método listarCarros:
Este método percorre a lista de carros na garagem e chama o método `vercarros` para exibir os detalhes de cada carro na saída.

### Exemplo de Uso:
Você pode usar a classe Garagem para criar uma garagem, adicionar carros a ela e listar os carros presentes:
```java
// Criar objetos de carros
carros c1 = new carros(1, "Ferrari", "LaFerrari", 8.3f, 8.8f, 9.6f, 9.3f, 10f, 800000, "vermelho");
carros c2 = new carros(2, "McLaren", "P1", 9.4f, 8.7f, 9.5f, 9.1f, 10f, 780000, "Laranja");

// Criar uma garagem de carros regulares
Garagem<carros> garagemRegular = new Garagem<>();
garagemRegular.adicionarCarro(c1);
garagemRegular.adicionarCarro(c2);
garagemRegular.listarCarros(); // Exibir detalhes dos carros regulares

// Criar uma garagem de carros especiais
carros_especiais c6 = new carros_especiais(6, "tesla", "foguete car", 10f, 8.0f, 10f, 10f, 9.0f, 3000000, "Cinza");
Garagem<carros_especiais> garagemEspecial = new Garagem<>();
garagemEspecial.adicionarCarro(c6);
garagemEspecial.listarCarros(); // Exibir detalhes dos carros especiais
```

Isso cria garagens separadas para carros regulares e especiais, adiciona carros a elas e lista os carros presentes em cada garagem.

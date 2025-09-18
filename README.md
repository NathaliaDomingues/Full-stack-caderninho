# Full-stack-Java
> Foi criado para minhas anotações

## Operadores
> Usados para realizar ações na variáveis <br>

`int`: usado quando os númeors são inteiros.

`double`: números decimais com maior precisão.

`boolean`: true ou false.

`float`: números decimais simples.

`short`: números menores, que economizam mais a memória.

`long`: números grandes.

`byte`: números pequenos.

`char`: usado para um caractere só.


## Método Acessor (Getters e Setters)
> São usados para mudar os atributos de uma classe.

`get`(pegar): é para obter e retornar o valor.

`set`(atribuir): para receber ou injetar dados.


## Modificador de Acesso
> Usados para determinar se uma variável é pública ou não.

`private`: para restringir a visibilidade.

`default`: deixa que você adicione métodos a uma interface com uma implementação padrão.

`public`: determina a visibilidade.

`protected`: permite que o membro da classe seja acessada dentro da mesma classe, ou outras classes no mesmo pacote, mas não por classes em outros pacotes.

## Classes e Encapsulamento
> As classes são usadas para representar objetos do mundo real, onde declaramos atributos e métodos, já o encapsulamento é uma junção de atributos e funções, operam os dados dentro de uma classe.

para importar uma classe de um pacote: `Pacote nomePacote = new Pacote();`
- tornar as variáveis dentro do Pacote `Public`, Ex: `public String nome;`
para o `Main` conseguir puxar as variáveis
- renomeá-las no `Main`, fora do Pacote
- nas classes do Pacote usar: `Public void nomeClasse(){}` , dentro usará
`System.out.println` para imprimir e manter as variáveis organizadas.

## Herança
> Um conceito de Programação Orientada a Objetos (POO) que permite que uma classe (a subclasse) herde características e comportamentos (atributos e métodos) de outra classe (a superclasse).

- Superclasse: classe base, de onde a herança ocorre.
- Subclasse: classe que herda da superclasse.

## Polimorfismo
> é a capacidade de um objeto assumir diferentes formas, permitindo que ele seja tratado como uma instância de sua classe principal ou de suas subclasses.

- `abstract`: usada para atingir abstração, um princípio fundamental da Programação Orientada a Objetos (POO) que se concentra em ocultar detalhes de implementação e expor apenas funcionalidades essenciais. 
- `sealed`: só pode ser estendido por suas próprias subclasses explicitamente permitidas.
- `non-sealed`: 
- `permits`: usada em conjunto com `sealed` e interfaces para definir explicitamente quais classes ou interfaces podem estendê-las ou implementá-las.
- `super`: acionar algum comportamento da classePai.
- `extends´: palavra-chave usada para indicar a herança em Java.
- `@Override`: indica que o método está sendo sobrescrito, assim evitando erros de digitação.

## Laços de Repetição

`equalsIgnoreCase`: usado para comparar duas strings, ignorando se for maiúscula ou minúscula.

`break`: usado para terminar ou sair de um loop.

`continue`: para pular a iteração do loop atual e seguir para a próxima iteração.

`while()`: laço de repetição que executa um bloco de código enquanto uma condição específica for verdadeira.

`for()`: usado para criar um loop que executa repetidamente um bloco de código um número especificado de vezes.

`switch case()`: instrução em Java fornece uma maneira de controlar o fluxo do programa executando diferentes blocos de código com base no valor de uma única expressão.

## ArrayList
> `ArrayList<>` serve para desenvolver listas.

`add()`: adiciona os elementos na lista.

`for()`: pode ser usado para imprimir ou combinar com if.

`remove()`: remove o elementos.

`size()`: para visualizar o número de elementos.

`clear()`: remove todos os elementos da lista.

`Collections.sort():` serve para organizar em ordem alfabética.

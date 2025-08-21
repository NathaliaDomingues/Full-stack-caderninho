# Full-stack-caderninho
> Foi criado para minhas anotações

## Operadores
> Usados para realizar ações na variáveis

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

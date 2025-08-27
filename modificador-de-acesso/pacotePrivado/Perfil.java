package pacotePrivado;

public class Perfil {
    private String nome;
    private int idade;

    public void setNome(String nome){
        //Ex: public void setNome(String nome) {
        //nome = nome;
        //}  vai dar erro
        this.nome = nome;
        //this: serve para fazer referência ao objeto da classe, evitando confusões entre os atributos.
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void exibeFicha(){
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
    }
}

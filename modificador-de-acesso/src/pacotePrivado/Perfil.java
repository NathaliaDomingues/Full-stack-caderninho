package pacotePrivado;

public class Perfil {
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void exibeFicha(){
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
    }
}
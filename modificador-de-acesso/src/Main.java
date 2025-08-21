import pacotePrivado.Perfil;

public class Main {
    public static void main(String[] args) {
        //private
        System.out.println("EXEMPLO DE PRIVATE");
        Perfil perfil = new Perfil();

        perfil.setNome("João");
        perfil.setIdade(23);
        perfil.exibeFicha();

        System.out.println("----------------");

        //default
        System.out.println("EXEMPLO DE DEFAULT");
        Default produto = new Default();
        produto.produto = "Shampoo";
        produto.preco = 13.90;
        produto.exibirInfo();

        System.out.println("----------------");

        //public
        System.out.println("EXEMPLO DE PUBLIC");
        Public animal = new Public();
        animal.especie = "Elefante";
        animal.idade = 30;
        animal.exibir();

        System.out.println("----------------");

        //protected
        System.out.println("EXEMPLO DE PROTECTED");
        Protected ave = new Protected();
        ave.nome = "Pombo";
        ave.emitirSom();
        System.out.println("O " + ave.nome + " está cantando");
    }
    }

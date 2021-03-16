package Classes;

public class Comer {

    public static void main(String[] args) {
        Comida c1 = new Comida("Arroz", 0.1);
        Comida c2 = new Comida("Feijão", 0.1);
        Comida c3 = new Comida("Batata", 0.05);
        Comida c4 = new Comida("Bife", 0.1);

        Pessoa pessoaUm = new Pessoa("Rafael", 63.300);
        System.out.println(pessoaUm.apresentar());
        pessoaUm.comer(c1);
        pessoaUm.comer(c2);
        pessoaUm.comer(c3);
        pessoaUm.comer(c4);
        System.out.println("Almoçei...");
        System.out.println(pessoaUm.apresentar());
    }
}
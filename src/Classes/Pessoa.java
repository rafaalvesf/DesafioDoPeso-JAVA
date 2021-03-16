package Classes;

public class Pessoa {
    String nomePessoa;
    Double pesoPessoa;

    Pessoa(String nomePessoa, Double pesoPessoa){
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }

    //metodocomer
    void comer(Comida comida){
        this.pesoPessoa += comida.pesoComida;
    }

    String apresentar(){
        return "Sou o " + nomePessoa + " e peso " + pesoPessoa + "KG";
    }

}

package br.edu.fescfafic.substituicaoLiscov.Model;

public class Gato extends Animal{
    public Gato(String nome, int idade) {
        super(nome, idade);

    }

   @Override
    public void emitirSom(){
        System.out.printf("%s Miau!\n", nome);
    }
    public String toString(){
        return "Gato{" +
                "Nome='" + nome + '\'' +
                "Idade='" + idade + '\'' +
                "}";
    }

}

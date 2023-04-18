package br.edu.fescfafic.substituicaoLiscov.Model;

public class AnimalSelvagem extends Animal{

    public AnimalSelvagem(String nome, int idade) {
        super(nome, idade);

    }

    @Override
    public void emitirSom(){
        System.out.printf("%s AAAAAAAAA!\n", nome);
    }
    public String toString(){
        return "AnimalSelvagem{" +
                "Nome='" + nome + '\'' +
                "Idade='" + idade + '\'' +
                "}";
    }
}

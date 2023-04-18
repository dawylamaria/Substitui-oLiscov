package br.edu.fescfafic.substituicaoLiscov.Model;

public abstract class Animal {
    public String nome;
    public int idade;

    public Animal (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom(){
        System.out.printf("%s emitiu som!\n", nome);
    }
}

package br.edu.fescfafic.substituicaoLiscov.Model;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.printf("%s Rouff!\n", nome);
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade + '\'' +
                '}';
    }
}

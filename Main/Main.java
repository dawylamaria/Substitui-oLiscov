package br.edu.fescfafic.substituicaoLiscov.Main;
import br.edu.fescfafic.substituicaoLiscov.Model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Animal gato = new Gato("tapioca", 2);
        Animal cachorro = new Cachorro("toto", 3);
        Animal leao = new AnimalSelvagem("simba", 3);

        ArrayList<Animal> listaDeAnimais = new ArrayList<>();

        listaDeAnimais.add(gato);
        listaDeAnimais.add(cachorro);
        listaDeAnimais.add(leao);

        for(Animal animal: listaDeAnimais){
            animal.emitirSom();

        }

    }
}
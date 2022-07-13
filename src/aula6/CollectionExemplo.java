package aula6;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionExemplo {

    public static void main(String[] args) {
        //foi adicionado o set.of ou list.of nas collections para facilicar ao instanciar
        Collection<String> nomes = Set.of("Joao", "Paulo", "Oliveira", "Santos");

        System.out.println(nomes);
    }
}
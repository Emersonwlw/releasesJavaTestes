package aula5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import java.util.stream.Collectors;

public class InferenciaExemplo {

    public static void main(String[] args) throws IOException {

        connectAndPrintJavaOracle();

//        printarNomeCompleto("Joao", "Santos");
//
//        printarSoma(3, 4, 5);

    }

    private static void connectAndPrintJavaOracle() {

        try {
            var url = new URL("https://docs.oracle.com/javase/10/language/");
            var urlConnection = url.openConnection();
            try(var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));) {

                System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
                }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void printarNomeCompleto(String nome, String sobrenome){
        var nomecompleto = String.format(nome +" "+ sobrenome);
        System.out.println(nomecompleto);

    }


    public static void printarSoma(int... numeros) {
        int soma;
        if (numeros.length > 0) {
            soma = 0;
            for (var numero = 0; numero < numeros.length; numero++) {
                soma += numeros[numero];
            }
            System.out.println("A soma e: " + soma);
        }

    }
}

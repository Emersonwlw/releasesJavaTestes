package aula6;
import java.util.function.Function;

public class InferenciaLambda {
    public static void main(String[] args) {

        //inferencia de variavel dentro de uma função lambda
        Function<Integer,Double> divisaoPor2 = (var numero) -> numero / 2.0;

        System.out.println(divisaoPor2.apply(9849387));
    }
}
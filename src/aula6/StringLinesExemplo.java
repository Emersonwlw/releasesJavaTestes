package aula6;
import java.util.stream.Collectors;

public class StringLinesExemplo {

    public static void main(String[] args) {
        //função lines para trabalhar com strings alterações e filtros
        String html = "<html>\n<head>\n</head>\n <body> \n </body> \n</html>";
        System.out.println(html.lines().map(s -> "[TAG] :: "+s).collect(Collectors.toList()));
    }
}
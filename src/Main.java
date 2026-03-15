public class Main {
    public static void main(String[] args) {

        AnalisadorLexico lexer = new AnalisadorLexico();

        String entrada = "x 10 3.14 verdadeiro abc y123 falso";

        String[] lexemas = entrada.split("\\s+");

        for (String lexema : lexemas) {

            Token token = lexer.analisar(lexema);

            System.out.println(token);
        }
    }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double valor;
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o valor que você dispõe parainvestir mensalmente em um curso? ");
        valor = scan.nextDouble();

        if (valor <= 20.99) {
            System.out.println("Com o valor de R$ " + valor + " você pode fazer o curso de Python.");
            System.out.println("O curso de Python do SENAI custa apenas R$ 20,99 com duração de x meses.");
        } else if (valor <= 35.99) {
            System.out.println("Com o valor de R$ " + valor + " você pode fazer o curso de PHP.");
            System.out.println("O curso de Python do SENAI custa apenas R$ 35,99 com duração de x meses.");
        } else if (valor <= 44.99) {
            System.out.println("Com o valor de R$ " + valor + " você pode fazer o curso de JAVA.");
            System.out.println("O curso de Python do SENAI custa apenas R$ 44,99 com duração de x meses.");
        } else {
            System.out.println(
                    "Com o valor de R$ " + valor + " você pode fazer o curso Técnico de desenvolvimento de sistemas.");
            System.out.println(
                    "O curso Técnico de desenvolvimento de sistemas do SENAI custa apenas R$ 45,00 com duração de x meses.");
        }
    }
}

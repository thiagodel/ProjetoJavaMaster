package conversor;

import java.util.Scanner;

public class ConversorMoedasApp {
    public static void iniciar(Scanner sc) {

        System.out.println("\n=== CONVERSOR DE MOEDAS ===");
        System.out.print("Valor em Reais (R$): ");
        double valor = sc.nextDouble();

        double dolar = valor / 5.70;
        double euro = valor / 6.10;

        System.out.printf("Dólar: US$ %.2f\n", dolar);
        System.out.printf("Euro: € %.2f\n", euro);

    }
}

package juros;

import java.util.Scanner;

public class JurosCompostosApp {
    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);

            System.out.println("\n=== CALCULADORA DE JUROS COMPOSTOS ===");
            System.out.print("Capital Inicial: ");
            double capital = sc.nextDouble();

            System.out.print("Taxa de juros (% ao mês): ");
            double taxa = sc.nextDouble() / 100;

            System.out.print("tempo (Meses): ");
            int tempo = sc.nextInt();

            double montante = capital * Math.pow(1 + taxa, tempo);
            System.out.printf("Montante final: R$ $%.2f\n", montante);


            sc.close();
        }


    }

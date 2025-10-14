package app;


import bancario.BancoApp;
import conversor.ConversorMoedasApp;
import imc.ImcApp;
import juros.JurosCompostosApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Sistema Bancário");
            System.out.println("2 - Calculadora de IMC");
            System.out.println("3 - Conversor de Moedas");
            System.out.println("4 - Calculadora de Juros Compostos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> BancoApp.iniciar(sc);
            case 2 -> ImcApp.iniciar(sc);
            case 3 -> ConversorMoedasApp.iniciar(sc);
            case 4 -> JurosCompostosApp.iniciar(sc);
            case 0 -> System.out.println("Encerrando programa....");
            default -> System.out.println("Opção inválida!");
        }
    } while (opcao != 0);


        sc.close();
        }

}
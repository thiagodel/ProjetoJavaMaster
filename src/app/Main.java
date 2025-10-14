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
            System.out.println("5 - Gerenciador de Tarefas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> BancoApp.main(new String[]{});
            case 2 -> ImcApp.main(new String[]{});
            case 3 -> ConversorMoedasApp.main(new String[]{});
            case 4 -> JurosCompostosApp.main(new String[]{});
            case 0 -> System.out.println("Encerrando programa....");
            default -> System.out.println("Opção inválida!");
        }
    } while (opcao != 0);


        sc.close();
        }

}
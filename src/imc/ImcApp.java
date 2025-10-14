package imc;

import java.util.Scanner;

public class ImcApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULADORA DE IMC ===");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();

        // cria o objeto da classe PessoaFit com os dados digitados
        PessoaFit pessoa = new PessoaFit(nome, idade, peso, altura);

        // exibe dados e IMC
        System.out.println("\n--- RESULTADO ---");
        pessoa.exibirDados();

        sc.close();
    }
}





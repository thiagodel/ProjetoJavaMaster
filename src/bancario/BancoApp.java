package bancario;

import java.util.Locale;
import java.util.Scanner;


public class BancoApp {


    public static void iniciar(Scanner sc) {

        Locale.setDefault(Locale.US);

        System.out.print("Número da conta: ");
        int numero = sc.nextInt();

        System.out.print("Nome do titular: ");
        String nome = sc.next();

        System.out.print("Deseja fazer o depósito inicial? (s/n): ");
        String resp = sc.next();

        ContaBancaria cont1;


        if (resp.equalsIgnoreCase("s")) {
            System.out.print("Valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            cont1 = new ContaBancaria(numero, nome, depositoInicial);

        } else {
            cont1 = new ContaBancaria(numero, nome);
        }

        System.out.println(cont1.exibirDados());

        System.out.print("Digite um valor para depositar: ");
        double valorDeposito = sc.nextDouble();
        cont1.depositar(valorDeposito);

        System.out.println(cont1.exibirDados());

        System.out.print("Digite um valor para sacar: ");
        double valorSaque = sc.nextDouble();
        cont1.sacar(valorSaque);
        System.out.println("Obs: Uma taxa de 5,00R$ foi aplicada pelo banco no valor do saque!!!");

        System.out.println(cont1.exibirDados());



    }
}

	
	
	

    

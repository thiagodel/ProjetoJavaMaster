package imc;

public class PessoaFit {

    String nome;
    int idade;
    double peso;
    double altura;

    public PessoaFit(String nome, int idade, double peso, double altura) {

        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    double calcularImc() {
        return peso / (altura * altura);
    }

    public String classificacaoImc() {
        double imc = calcularImc();

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        }else
            return "Obesidade";
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.printf("IMC: %.2f%n", calcularImc());
        System.out.println("Classificação: " + classificacaoImc());
        System.out.println("---------------");
    }



}


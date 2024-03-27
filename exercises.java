import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import java.util.Date;

public class exercises {
    public static void main(String[] args) {
        exercicio24();
    }

    // Exercício 1: Verificar se um número é positivo, negativo ou zero
    public static void exercicio1() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva um número para ver se ele é positivo negativo ou zero");
        double num = entrada.nextDouble();
        entrada.close();

        if (num > 0) {
            System.out.println(num + " é positivo");
        } else if (num < 0) {
            System.out.println(num + " é negativo");
        } else if (num == 0) {
            System.out.println(num + " é zero");
        }
    }

    // Exercício 2: Numeros pares de 1 a 10
    public static void exercicio2() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    // Exercício 3: Calcular o fatorial de um número
    public static void exercicio3() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva um número para ser fatorado");
        float brabo = entrada.nextFloat();
        float fatorial = 1;
        entrada.close();

        for (float i = 1; i <= brabo; i++) {
            fatorial *= i;
            System.out.println("O fatorial de " + brabo + " é " + fatorial);
        }
    }

    // Exercício 4: Verificar se um número é primo
    public static void exercicio4() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Defina um numero para ver se ele e primo ou nao");
        double brabo = entrada.nextDouble();
        entrada.close();

        for (double i = 1; i <= brabo; i++) {
            if (brabo % 2 == 0) {
                System.out.println("o numero nao e primo");
                break;
            } else {
                System.out.println("o numero e primo");
                break;
            }
        }
    }

    // Exercício 5: Calcular o somatório dos números de 1 a 100
    public static void exercicio5() {
        int soma = 1;

        while (soma < 100) {
            System.out.println("a soma é " + (soma + 1));
            soma++;
        }
    }

    // Exercício 6: Verificar se um número é par ou ímpar utilizando switch-case
    public static void exercicio6() {
        Scanner s = new Scanner(System.in);
        System.out.println("digite um numero ");
        int num = s.nextInt();
        s.close();

        switch (num % 2) {
            case 0:
                System.out.println("o numero e par ");
                break;

            default:
                System.out.println("o numero e impar");
                break;
        }
    }

    // Exercício 7: Imprimir os números de 1 a 10 utilizando while
    public static void exercicio7() {
        int num = 1;
        while (num <= 9) {
            System.out.println(num + 1);
            num++;
        }
    }

    // Exercício 8: Calcular a média de 5 números, usando for para solicitar cada
    // número
    public static void exercicio8() {
        Scanner entrada = new Scanner(System.in);
        int soma = 1, brabo = entrada.nextInt();
        entrada.close();

        for (int i = 0; i <= 5; i++) {
            System.out.println("Escreva um numero");
            soma += brabo;
        }

        System.out.println(soma / 5);
    }

    public static void exercicio9() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void exercicio10() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um ano para ver se ele é bissexto");
        int ano = entrada.nextInt();
        entrada.close();

        if (ano % 100 != 0 && ano % 400 == 0) {
            System.out.println("O ano é bissexto");
        } else if (ano % 4 == 0) {
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");
        }
    }

    // Exercicio 11
    public static void exercicio11() {
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

    // Exercicio 12
    public static void exercicio12() {
        int soma = 0;
        for (int i = 0; i <= 50; i += 2) {
            soma += i;
            System.out.println(soma);
        }
    }

    // Exercicio 12+1
    public static void exercicio13() {
        float soma = 1;
        for (float i = 1; i <= 100; i += 2) {
            soma += i;
        }
        System.out.println(soma / 100);
    }

    // Exercicio 14
    public static void exercicio14() {
        Scanner entrada = new Scanner(System.in);
        int brabo = entrada.nextInt();
        int quantidade = 10;
        for (int i = 0; i <= quantidade; i++) {
            int calculo = brabo * i;
            System.out.println(calculo);
        }
    }

    // Exercicio 15
    public static void exercicio15() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva uma letra para ver se ela é vogal ou consoante");
        String letra = entrada.nextLine();
        entrada.close();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("A letra " + letra + " é uma vogal");
        } else if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O")
                || letra.equals("U")) {
            System.out.println("A letra " + letra + " é uma vogal");
        } else {
            System.out.println("A letra " + letra + " é uma consoante");
        }
    }

    // Exercicio 16
    public static void exercicio16() {
        int soma = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 > 0) {
                soma += i;
                System.out.println(soma);
                continue;
            }
        }
    }

    // Exercicio 17
    public static void exercicio17() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva um ano para ver se teve copa ou não");
        int ano = entrada.nextInt();
        entrada.close();

        if (ano == 1946 || ano == 1942) {
            System.out.println("o ano não é de copa");
        } else if (ano >= 1930 && (ano - 1930) % 4 == 0) {
            System.out.println("é ano de copa");
        } else {
            System.out.println("não é ano de copa");
        }
    }

    // Exercicio 18
    public static void exercicio18() {
        Random random = new Random();

        int resultado = random.nextInt(6) + 1;
        System.out.println("o dado foi lançado e o resultado foi " + resultado);
    }

    // Exercicio 19
    public static void exercicio19() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("A sua altura");
        int altura = entrada.nextInt();

        System.out.println("O seu peso");
        int peso = entrada.nextInt();

        int soma = altura / peso;

        System.out.println("O seu IMC é " + Math.pow(soma, 2));
    }

    // Exercicio 20
    public static void exercicio21() {
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("escreva um número");
        double num1 = entrada2.nextDouble();

        System.out.println("escreva um número");
        double num2 = entrada2.nextDouble();

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite 1 para soma, 2 para subtração, 3 para multiplicação ou 4 para divisão");
        int escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("A soma é: " + (num1 + num2));
                break;
            case 2:
                System.out.println("A subtração é: " + (num1 - num2));
                break;
            case 3:
                System.out.println("A multiplicação é: " + (num1 * num2));
                break;
            case 4:
                System.out.println("A divisão é: " + (num1 / num2));
                break;
            default:
                System.out.println("escolha invalida");
                break;
        }
    }

    // Exercicio EXTRA
    public static void exercicio22() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tente adivinhar o número!");
        int num = entrada.nextInt();
        entrada.close();

        Random random = new Random();
        int resultado = random.nextInt(10) + 1;

        if (num == resultado) {
            System.out.println("O número correto era " + resultado);
        } else {
            System.out.println("Errou");
        }
    }

    // Exercicio 23
    public static void exercicio23() {
        String hi = "Hello world";
        System.out.println(new StringBuilder(hi).reverse().toString());
    }

    // Exercicio 24
    @SuppressWarnings("deprecation")
    public static void exercicio24() {

        Date dataInicial = new Date(2022, 01, 01);
        Date dataFinal = new Date(2023, 01, 01);

        long numeroDeDias = (dataFinal.getTime() - dataInicial.getTime()) / (24 * 60 * 60 * 1000);

        System.out.println("O número de dias entre as duas datas é " + numeroDeDias);
    }

    // Exercicio 25
    public static void exercicio25() {
        int altura = 5;

        for (int i = 1; i <= altura; i++) {

            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

import java.util.Scanner;
import javax.swing.JOptionPane;

class quickstart {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("o numero para o antecessor e sucessor: ");
        double num = entrada.nextInt();

        entrada.close();

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("o numero para o antecessor e sucessor: ");
        double num1 = entrada2.nextInt();

        entrada2.close();

        Scanner entrada3 = new Scanner(System.in);
        System.out.println("o numero para o antecessor e sucessor: ");
        double num2 = entrada3.nextInt();

        entrada3.close();

        System.out.println("o numero antecessor é: " + (num1 + num + num2) / 3);

    }
}

class xuxa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("insira um numero ");
        int num = entrada.nextInt();

        entrada.close();

        if (num >= 0) {
            System.out.println(num + " patinhos foram passear ");
            System.out.println("Além das montanhas");
            System.out.println("Para brincar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quáMas só n-1 patinhos voltaram de lá.");
            System.out.println("Que se repete até nenhum patinho voltar de lá.");
            System.out.println("Ao final, todos os patinhos voltam:");
            System.out.println("A mamãe patinha foi procurar");
            System.out.println("Na beira do mar");
            System.out.println("Além das montanhas");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá");
            System.out.println("E os n patinhos voltaram de lá.");
        } else {
            System.out.println("não é um numero inteiro");
        }
    }
}

class pi {
    public static void main(String[] args) {
        String pi = "3.1415";
        double numPi = Double.parseDouble(pi);
        float numPiFloat = Float.parseFloat(pi);

        System.out.println(numPi);
        System.out.println(numPiFloat);
    }
}

class exercise1 {
    public static void main(String[] args) {
        int nota1 = 2, nota2 = 4, nota3 = 5, nota4 = 3;
        System.out.println((nota1 + nota2 + nota3 + nota4) / 4);
    }
}

class exercise2 {
    public static void main(String[] args) {
        char let1 = 'H', let2 = 'E', let3 = 'N', let4 = 'R', let5 = 'I';
        String nomeCompleto = "" + let1 + let2 + let3 + let4 + let5;

        System.out.println(nomeCompleto);
    }
}

class exercise3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("insira um nome: ");
        String nome = entrada.nextLine();

        entrada.close();

        System.out.println("Insira um sobrenome");
        String nome1 = entrada.nextLine();

        nome1.close();

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("insira um parâmetro: ");
        double B = entrada2.nextDouble();

        System.out.println("Insira um parâmetro");
        double A = entrada2.nextDouble();

        entrada2.close();

        String conca = "" + nome + " " + nome1;
        double conca1 = A + B;

        System.out.println(conca);
        System.out.println(conca1);
    }
}

class desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("insira um numero: ");
        int numero = entrada.nextInt();

        entrada.close();

        System.out.println("O seu sucessor é " + (numero + 1));
        System.out.println("O seu antecessorr é " + (numero - 1));
    }
}

class desafio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("insira um valor: ");
        double numero = entrada.nextDouble();

        entrada.close();

        double valor = numero * 0.15;

        System.out.println("O valor com reajuste e " + (numero + valor));
    }
}

class desafio3 {
    public static void main(String[] args) {
        Scanner preco = new Scanner(System.in);
        System.out.println("Digite o preço");
        double numero = preco.nextDouble();

        preco.close();

        Scanner nome = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome1 = nome.nextLine();

        nome.close();

        double valor = numero * 0.85;
        System.out.println(nome1);
        System.out.println("o valor é " + (valor + numero));
    }
}

class desafio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor");
        double numero = entrada.nextDouble();

        System.out.println("Digite o valor");
        double numero2 = entrada.nextDouble();

        entrada.close();

        System.out.println("a soma é " + (numero + numero2));
        System.out.println("a subtração é " + (numero - numero2));
        System.out.println("a multiplicação é " + (numero * numero2));
        System.out.println("a divisão é " + (numero / numero2));
    }
}

class desafio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius21");
        double C = entrada.nextDouble();

        entrada.close();

        double F = C * 1.8 + 32, K = C + 273.15, Re = C * 0.8, Ra = C * 1.8 + 32 + 459.67;

        System.out.println("Celsius em Fahrenheit é " + F + "\n" + "Celsius em Kelvin é " + K + "\n"
                + "Celsius em Réaumur é " + Re + "\n" + "Celsius em Rankine é " + Ra);

    }
}

class cavalo {
    public static void main(String[] args) {
        Scanner massa = new Scanner(System.in);
        System.out.println("escreva um número de KG");
        double m = massa.nextDouble();

        System.out.println("escreva uma altura");
        double h = massa.nextDouble();

        System.out.println("escreva um tempo");
        double t = massa.nextDouble();

        massa.close();

        double cavalos = (m * h / t) / 745.6999;

        System.out.println("levaria " + cavalos + " cavalos para levantar essa massa");
    }
}

class idades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade em anos");
        double A = entrada.nextDouble();

        System.out.println("Digite sua idade em meses");
        double B = entrada.nextDouble();

        System.out.println("Digite sua idade em dias");
        double dias = entrada.nextDouble();

        entrada.close();

        double anos = A * 365;
        double mes = B * 30;

        System.out.println("sua idade em dias é " + (anos + mes + dias));
    }
}

class triangle {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva uma altura para o triangulo");
        double A = entrada.nextDouble();

        System.out.println("Escreva uma base para o triangulo");
        double B = entrada.nextDouble();

        entrada.close();

        double retangle = A * B;

        System.out.println("a área do retângulo é: " + retangle);

    }
}

class pscina {
    public static void main(String[] args) {
        double comprimento, profundidade, largura, preco;

        Scanner entrada = new Scanner(System.in);
        System.out.println("escreva o comprimento");
        comprimento = entrada.nextDouble();

        System.out.println("escreva o profundidade");
        profundidade = entrada.nextDouble();

        System.out.println("escreva o largura");
        largura = entrada.nextDouble();

        entrada.close();

        preco = 100 * (largura * profundidade * comprimento);

        System.out.println("o preço ficaria " + preco);
    }
}

class calculadora {
    public static void main(String[] args) {
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("escreva um número");
        double num1 = entrada2.nextDouble();

        System.out.println("escreva um número");
        double num2 = entrada2.nextDouble();

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite 1 para soma, 2 para subtração, 3 para multiplicação ou 4 para divisão");
        int escolha = entrada.nextInt();

        switch (escolha <= 4) {
            case 1:
                System.out.println("A soma é: " + (num1 + num2));
            case 2:
                System.out.println("A subtração é: " + (num1 - num2));
            case 3:
                System.out.println("A multiplicação é: " + (num1 * num2));
            case 4:
                System.out.println("A divisão é: " + (num1 / num2));
            default:
                System.out.println("escolha invalida");
        }

    }
}
// Douglas

class Douglas {
    public static void main(String[] args) {
        System.out.println("Ola");
        System.out.println("Douglas");
    }
}

class Douglas2 {
    public static void main(String[] args) {
        int numero = 70;
        int numero2 = 50;
        System.out.println(numero + numero2);

    }
}

class Douglas3 {
    public static void main(String[] args) {
        double numero = 20;
        double numero2 = 25;
        System.out.println(numero / numero2);
    }
}

class Douglas4 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva um número");
        double numero = entrada.nextDouble();

        if (numero >= 0 && numero == 0) {
            System.out.println("o número é positivo ou igual a zero");
        } else {
            System.out.println("o número é negativo");
        }
    }
}

class exercicio12mais1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva um número para ver se ele é par ou impar");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("o número é par");
        } else {
            System.out.println("o número é impar");
        }
    }
}

class exercicio14 {
    public static void main(String[] args) {
        int fatorial = 1;

        for (int n = 1; n <= 10; n++) {
            fatorial *= n;
            System.out.println(fatorial + " ");
        }
    }
}

class exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva um número para ver se ele é primo");
        int numero = entrada.nextInt();
        entrada.close();

        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}

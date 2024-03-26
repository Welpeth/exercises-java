import java.util.Scanner;

import javax.swing.*;

public class MainFrame extends JFrame {
    public static void initialize() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("escreva um número: ");
        double num1 = entrada.nextDouble();

        System.out.println("escreva um número: ");
        double num2 = entrada.nextDouble();

        entrada.close();

        JOptionPane.showMessageDialog(null, "o numero é: " + (num1 + num2));
    }
}

class pwpwp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("escreva um número");
        double numero = entrada.nextDouble();
        entrada.close();

        if (numero % 2 == 0) {
            System.out.println("o número é par");
        } else {
            System.out.println("o número é impar");
        }

    }
}

class exercise1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        double num = entrada.nextDouble();
        entrada.close();

        int resultadoFatorial = 1;

        for (double i = 1; i < num; i++) {
            resultadoFatorial *= i;
            System.out.println(resultadoFatorial);
        }
    }
}
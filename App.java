import javax.swing.JOptionPane;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("escreva um número: ");
        double num1 = entrada.nextDouble();

        System.out.println("escreva um número: ");
        double num2 = entrada.nextDouble();

        entrada.close();

        JOptionPane.showMessageDialog(null, "o numero é: " + (num1 + num2));

    }
}

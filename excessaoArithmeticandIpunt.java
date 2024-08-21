import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Primeiro numero: ");
            double numero1 = scanner.nextDouble();
            
            System.out.print("Segundo numero: ");
            double numero2 = scanner.nextDouble();
            
            double resultado = dividir(numero1, numero2);
            System.out.println("Resultado: " + resultado);
            
        } catch (InputMismatchException e) {
            System.out.println("Digite um número válido.");
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero, errado.");
        } finally {
            scanner.close();
        }
    }

    private static double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        return num1 / num2;
    }
}

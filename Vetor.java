import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

public class Vetor{
    private int[] vetor;
    private int contador;

    public Vetor() {
        vetor = new int[10]; 
        contador = 0; 
    }

    public void preencherVetor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite até 10 numeros (digite 0 para parar):");

        while (contador < 10) {
            try {
                int valor = scanner.nextInt();
                if (valor == 0) {
                    vetor[contador] = valor;
                    contador++ ;
                    break;
                }
                vetor[contador] = valor;
                contador++;
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("10 valores inseridos, fim.");
                break;
            } catch(InputMismatchException e) {
                System.out.println("Errado, insira um numero.");
                scanner.next();
            }
        }
    }

    public void mostrarVetor() {
        System.out.println("Vetor: ");
        for (int i = 0; i < contador; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Vetor Vetor = new Vetor();
        Vetor.preencherVetor();
        Vetor.mostrarVetor();
    }
}

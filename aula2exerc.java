import java.util.Scanner;
import java.util.*;

class Paciente{
    private String nome;
    
    public Paciente(String nome){
        this.nome = nome;
    }
}

public class Main{
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Nome: ");
    String nome = scanner.nextLine();
    System.out.println("Peso: ");
    Double peso = scanner.nextDouble();
    System.out.println("Altura: ");
    Double altura = scanner.nextDouble();
    
    Double calcularIMC = peso/(altura * altura);
    
    if(calcularIMC < 20){
        System.out.println("\nAbaixo do peso\n");
        System.out.println("IMC: " + calcularIMC);
    }else if(calcularIMC <25){
        System.out.println("\nPeso normal\n");
        System.out.println("IMC: " + calcularIMC);
    }else if(calcularIMC < 30){
        System.out.println("\nExcesso de peso\n");
        System.out.println("IMC: " + calcularIMC);
    }else if(calcularIMC < 35){
        System.out.println("\nObesidade\n");
        System.out.println("IMC: " + calcularIMC);
    }else if(calcularIMC >= 35){
        System.out.println("\nObesidade Morbida\n");
        System.out.println("IMC: " + calcularIMC);
    }else{
        System.out.println("\nFez coisa errada camarada\n");
    }
    
    //System.out.println(calcularIMC);
    
    
    
	}
}

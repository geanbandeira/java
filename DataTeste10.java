package br.edu.ifsp.exercicio.data;

public class DataTeste10 {
  public static void main(String[] args) {
	Data10 data10 = new Data10(28,2,1900);
    System.out.println(data10.getDia());
    System.out.println(data10.getMes());
    System.out.println(data10.getAno());
    System.out.println(data10.anoBissexto());
    
  }
}

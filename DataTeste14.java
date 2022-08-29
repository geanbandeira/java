package br.edu.ifsp.exercicio.data;

public class DataTeste14 {
  public static void main(String[] args) {
	Data13 data13 = new Data13(28,2,1900);
    System.out.println(data13.getDia());
    System.out.println(data13.getMes());
    System.out.println(data13.getAno());
	Data13 data13a = new Data13();
    System.out.println(data13a.getDia());
    System.out.println(data13a.getMes());
    System.out.println(data13a.getAno());
    System.out.println(data13.equals(data13a));
	Data13 data14 = new Data13(28,2,1900);
    System.out.println(data14.getDia());
    System.out.println(data14.getMes());
    System.out.println(data14.getAno());
    System.out.println(data13.equals(data14));
    
  }
}

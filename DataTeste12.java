package br.edu.ifsp.exercicio.data;

public class DataTeste12 {
  public static void main(String[] args) {
	Data12 data12a = new Data12(28,2,1900);
    System.out.println(data12a.getDia());
    System.out.println(data12a.getMes());
    System.out.println(data12a.getAno());
	Data12 data12b = new Data12();
    System.out.println(data12b.getDia());
    System.out.println(data12b.getMes());
    System.out.println(data12b.getAno());

  }
}

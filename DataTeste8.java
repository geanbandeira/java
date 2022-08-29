package br.edu.ifsp.exercicio.data;

public class DataTeste8 {
  public static void main(String[] args) {
	Data8 data8a = new Data8(28,2,1900);
    System.out.println(data8a.dia);
    System.out.println(data8a.mes);
    System.out.println(data8a.ano);
    System.out.println(data8a.anoBissexto());
  }
}

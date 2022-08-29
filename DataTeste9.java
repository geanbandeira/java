package br.edu.ifsp.exercicio.data;

public class DataTeste9 {
  public static void main(String[] args) {
	Data9 data9a = new Data9(28,2,1900);
	data9a.dia = 40;
    System.out.println(data9a.dia);
    System.out.println(data9a.mes);
    System.out.println(data9a.ano);
    System.out.println(data9a.anoBissexto());
  }
}

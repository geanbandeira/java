package br.edu.ifsp.exercicio.data;

public class DataTeste7 {
  public static void main(String[] args) {
	Data7 data7a = new Data7(25,2,1900);
    System.out.println(data7a.dia);
    System.out.println(data7a.mes);
    System.out.println(data7a.ano);
    System.out.println(data7a.anoBissexto());
    
	Data7 data7b = new Data7(30,11,2008);
    System.out.println(data7b.dia);
    System.out.println(data7b.mes);
    System.out.println(data7b.ano);
    System.out.println(data7b.anoBissexto());
    
	Data7 data7c = new Data7(28,2,2013);
    System.out.println(data7c.dia);
    System.out.println(data7c.mes);
    System.out.println(data7c.ano);
    System.out.println(data7c.anoBissexto());
    
    
    
	
  }
}

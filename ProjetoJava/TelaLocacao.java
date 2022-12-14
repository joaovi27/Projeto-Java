import java.util.Scanner;

public class TelaLocacao {
  private Locacao locacao;

  //Construtor.
  
  public TelaLocacao(Locacao a) {
    setLocacao(a);
  }

  public void setLocacao(Locacao a){
    if (a == null) {
      throw new RuntimeException("Erro: Locacao null.");
    }
    else {
      this.locacao = a;
    }
  }

  public Locacao getLocacao() {
    return locacao;
  }
  

public void imprimeLocacao() {
    System.out.println (" \n=======LOCACAO=======");
    System.out.println(" Cpf Cliente: " + locacao.cliente.getCpf());
    System.out.println(" Quadra: " + locacao.quadra.getEsporte());
    System.out.println (" Cod Locacao: " + locacao.getCod ());
    System.out.println (" Valor: " + locacao.getvalorTotal ());
    System.out.println (" Status: " + locacao.getStatus ());
    System.out.println (" Data: " + locacao.getData ());
    System.out.println (" \n------------------------");
    
 for (Item itt:locacao.getItens ())
      {
	System.out.println (" Item Locado");
	System.out.println (" Item: " + itt.getNome ());
	System.out.println (" ID: " + itt.getId ());
	System.out.println (" ValorHora: " + itt.getvalorHora ());
	System.out.println (" \n------------------------");
      }
      
     
      
      
}
}
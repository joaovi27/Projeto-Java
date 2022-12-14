import java.util.Scanner;

public class TelaGerente {
  private Gerente gerente;

  //Construtor.
  
  public TelaGerente(Gerente a) {
    setGerente(a);
  }

  public void setGerente(Gerente a){
    if (a == null) {
      throw new RuntimeException("Erro: Gerente null.");
    }
    else {
      this.gerente = a;
    }
  }

  public Gerente getGerente() {
    return gerente;
  }
  

public void imprime() {
    System.out.println ("===GERENTE===");
    System.out.println("Nome: " + gerente.getNome());
    System.out.println("ID: " + gerente.getId());
    System.out.println("Cpf: " + gerente.getCpf());
    System.out.println("Cnpj: " + gerente.getCnpj());
    System.out.println ("\n------------------------");

  }
}
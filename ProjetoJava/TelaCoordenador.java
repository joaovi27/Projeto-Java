import java.util.Scanner;

public class TelaCoordenador {
  private Coordenador coordenador;

  //Construtor.
  
  public TelaCoordenador(Coordenador a) {
    setCoordenador(a);
  }

  public void setCoordenador(Coordenador a){
    if (a == null) {
      throw new RuntimeException("Erro: Coordenador null.");
    }
    else {
      this.coordenador = a;
    }
  }

  public Coordenador getCoordenador() {
    return coordenador;
  }
  

public void imprime() {
    System.out.println ("===COORDENADOR===");
    System.out.println("Nome: " + coordenador.getNome());
    System.out.println("Cpf: " + coordenador.getCpf());
    System.out.println("ID: " + coordenador.getId());
    System.out.println ("\n------------------------");

  }
}
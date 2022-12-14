import java.util.Scanner;

public class TelaCliente
{
  private Cliente cliente;

  //Construtor.

  public TelaCliente (Cliente a)
  {
    setCliente (a);
  }

  public void setCliente (Cliente a)
  {
    if (a == null)
      {
	throw new RuntimeException ("Erro: cliente null.");
      }
    else
      {
	this.cliente = a;
      }
  }

  public Cliente getCliente ()
  {
    return cliente;
  }


  public void imprimeCliente ()
  {
    System.out.println (" \n=======CLIENTE=======");
    System.out.println (" Nome: " + cliente.getNome ());
    System.out.println (" Cpf: " + cliente.getCpf ());
    System.out.println (" ID: " + cliente.getId ());
    System.out.println (" Email: " + cliente.getEmail ());
    System.out.println (" Telefone: " + cliente.getTelefone ());
    System.out.println (" ------------------------");
  }
  
  
   public void imprimeClienteLoc ()  {
   
   imprimeCliente();

  for (Locacao loc:cliente.getLocacoesDoCliente ())
  
      {
	System.out.println (" \n===Locacao Cliente ===");
	System.out.println (" ID Cliente: " + loc.cliente.getId ());
	System.out.println (" Cod locacao: " + loc.getCod ());
	System.out.println (" Quadra: " + loc.quadra.getEsporte ());
	System.out.println (" Valor Total: " + loc.getvalorTotal ());
      }
  }
}

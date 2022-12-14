import java.util.Scanner;

public class TelaQuadra
{
  private Quadra quadra;

  //Construtor.

  public TelaQuadra (Quadra a)
  {
    setQuadra (a);
  }

  public void setQuadra (Quadra a)
  {
    if (a == null)
      {
	throw new RuntimeException ("Erro: Quadra null.");
      }
    else
      {
	this.quadra = a;
      }
  }

  public Quadra getQuadra ()
  {
    return quadra;
  }

  public void imprime ()
  {
    System.out.println ("===QUADRA===");
    System.out.println ("Coordenador: " + quadra.coordenador.getNome());
    System.out.println ("Quadra: " + quadra.getEsporte ());
    System.out.println ("ID: " + quadra.getId ());
    System.out.println ("Valor Hora: " + quadra.getvalorHora ());
    System.out.println ("\n------------------------");
  for (Item it:quadra.getItens ())
				//imprime itens da quadra, caso tenham;
      {
	System.out.println ("===Item quadra===");
	System.out.println ("Item: " + it.getNome ());
	System.out.println ("ID: " + it.getId ());
	System.out.println ("ValorHora: " + it.getvalorHora ());
	System.out.println ("\n------------------------");
      }
  }
}

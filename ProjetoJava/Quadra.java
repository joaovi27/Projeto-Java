import java.util.ArrayList;
import java.util.List;

public class Quadra
{
  public String esporte;
  private int id;
  private float valorhora;
  public Coordenador coordenador;
  private List < Item > itensdaQuadra = new ArrayList < Item > ();
  private List < Locacao > locacoesDaQuadra = new ArrayList < Locacao >();


  //Construtor 
  public Quadra (String esporte, int id, float valorHora,
		 Coordenador coordenador)
  {
    this.esporte = esporte;
    this.id = id;
    this.valorhora = valorHora;
    setCoordenador (coordenador);
  }

  public void adicionaItem (Item item)
  {
    this.itensdaQuadra.add (item);
  }

  public List < Item > getItens ()
  {
    return this.itensdaQuadra;
  }

  public void adicionaLocacaoNaQuadra(Locacao loc)
  {
      this.locacoesDaQuadra.add (loc);
  }
  public List < Locacao > getLocacoesDaQuadra()
  {
      return this.locacoesDaQuadra;
  }


  public String getEsporte ()
  {
    return this.esporte;
  }
  public void setEsporte (String esporte)
  {
    this.esporte = esporte;
  }

  public int getId ()
  {
    return this.id;
  }
  public void setId (int id)
  {
    this.id = id;
  }
  public float getvalorHora ()
  {
    return this.valorhora;
  }
  public void setvalorHora (float valorhora)
  {
    this.valorhora = valorhora;
  }

  public Coordenador getCoordenador ()
  {
    return coordenador;
  }
  public void setCoordenador (Coordenador coordenador)
  {
    if (coordenador == null)
      {
	throw new RuntimeException ("Erro: Coordenador nulo");
      }
    else
      {
	this.coordenador = coordenador;
      }
  }
}

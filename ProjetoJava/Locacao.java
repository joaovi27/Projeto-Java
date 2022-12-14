import java.util.List;

import java.util.ArrayList;

public class Locacao
{
  private int cod;
  private float valorTotal;
  private String status;
  private String data;
  public Quadra quadra;
  public Cliente cliente;
  public List < Item > itensLocados = new ArrayList < Item > ();


// Construtor
  public Locacao (int cod, float valorTotal, String status, String data,
		  Quadra quadra, Cliente cliente)
  {
    this.cod = cod;
    this.valorTotal = valorTotal;
    this.status = status;
    this.data = data;
    setQuadra (quadra);
    setCliente (cliente);
  }

  public void addItem (Item item)
  {
    this.itensLocados.add (item);
  }

  public List < Item > getItens ()
  {
    return this.itensLocados;
  }



  public int getCod ()
  {
    return this.cod;
  }
  public void setCod (int cod)
  {
    this.cod = cod;
  }

  public float getvalorTotal ()
  {
    return this.valorTotal;
  }
  public void setvalorTotal (float valortotal)
  {
    this.valorTotal = valortotal;
  }

  public String getStatus ()
  {
    return this.status;
  }
  public void setvalorTotal (String status)
  {
    this.status = status;
  }

  public String getData ()
  {
    return this.data;
  }
  public void setData (String data)
  {
    this.data = data;
  }

  public Cliente getCliente ()
  {
    return cliente;
  }
  public void setCliente (Cliente cliente)
  {
    if (cliente == null)
      {
	throw new RuntimeException ("Erro: Cliente nulo");
      }
    else
      {
	this.cliente = cliente;
      }
  }

  public Quadra getQuadra ()
  {
    return quadra;
  }
  public void setQuadra (Quadra quadra)
  {
    if (quadra == null)
      {
	throw new RuntimeException ("Erro: Quadra nula");
      }
    else
      {
	this.quadra = quadra;
      }
  }
}

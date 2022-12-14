import java.util.ArrayList;
public class Item
{
  private String nome;
  private int id;
  private float valorhora;

  //Construtor 
  public Item (String nome, int id, float valorhora)
  {
    this.nome = nome;
    this.id = id;
    this.valorhora = valorhora;
  }

  public String getNome ()
  {
    return this.nome;
  }
  public void setNome (String nome)
  {
    this.nome = nome;
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

}

import java.util.ArrayList;
import java.util.List;

public class Cliente
{
  private int id;
  private int cpf;
  private String email;
  private int telefone;
  private String nome;
  private List < Locacao > locacoesDoCliente = new ArrayList < Locacao > ();

  public Cliente (String nome, int cpf, int id, String email, int telefone)
  {
    this.nome = nome;
    this.id = id;
    this.cpf = cpf;
    this.email = email;
    this.telefone = telefone;
  }


  public void adicionaLocacaoDoCliente (Locacao loc)
  {
    this.locacoesDoCliente.add (loc);
  }

  public List < Locacao > getLocacoesDoCliente ()
  {
    return this.locacoesDoCliente;
  }

  public String getNome ()
  {
    return nome;
  }
  public void setNome (String nome)
  {

    this.nome = nome;
  }

  public int getId ()
  {
    return id;
  }

  public void setId (int id)
  {
    this.id = id;
  }


  public int getCpf ()
  {
    return cpf;
  }

  public void setCpf (int cpf)
  {
    this.cpf = cpf;
  }

  public String getEmail ()
  {
    return email;
  }

  public void setEmail (String email)
  {
    this.email = email;
  }

  public int getTelefone ()
  {
    return telefone;
  }
  public void setTelefone (int telefone)
  {
    this.telefone = telefone;
  }


}

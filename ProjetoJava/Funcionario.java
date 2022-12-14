public class Funcionario
{
  public String nome;
  public int cpf;


  public Funcionario (String nome, int cpf)
  {
    this.nome = nome;
    this.cpf = cpf;
  }

  public String getNome ()
  {
    return nome;
  }
  public int getCpf ()
  {
    return cpf;
  }

}

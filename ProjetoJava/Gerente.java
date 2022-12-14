public class Gerente extends Coordenador
{				//herda atributos e metodos de Coordenador
  private int cnpj;

  //Construtor 
  public Gerente (String nome, int id, int cnpj, int cpf)
  {
    super (nome, cpf, id);
    this.nome = nome;
    this.id = id;
    this.cnpj = cnpj;
    this.cpf = cpf;
  }


  public int getCnpj ()
  {
    return this.cnpj;
  }
  public void setCnpj (int cnpj)
  {
    this.cnpj = cnpj;
  }




}

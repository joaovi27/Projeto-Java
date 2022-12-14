import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario
{				//herda atributos de Funcionario

  public int id;
  private List < Quadra > quadrasGerenciadas = new ArrayList < Quadra > ();

// Construtor
  public Coordenador (String nome, int id, int cpf)
  {
    super (nome, cpf);
    this.nome = nome;
    this.id = id;
    this.cpf = cpf;

  }

  public void adicionaQuadrasGerenciadas (Quadra quadra)
  {
    this.quadrasGerenciadas.add (quadra);
  }

  public List < Quadra > getQuadras ()
  {
    return this.quadrasGerenciadas;
  }

  public int getId ()
  {
    return this.id;
  }
  public void setId (int id)
  {
    this.id = id;
  }

}

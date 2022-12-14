import java.util.ArrayList;
public class Main
{
  public static void main (String[]args)
  {

//Instanciamento de telas para gerentes;
    TelaGerente telag1;
    TelaGerente telag2;

//Instanciamento de gerente;
    Gerente gerente1 = new Gerente ("Pyerre", 100, 20202, 3434343);
      telag1 = new TelaGerente (gerente1);

    //imprime dados do gerente;
      telag1.imprime ();

    Gerente gerente2 = new Gerente ("Angela", 200, 10211, 22909);
      telag2 = new TelaGerente (gerente2);

    //imprime dados do gerente;
      telag2.imprime ();

/*================================================================*/

//Instanciamento de telas coordenador;
    TelaCoordenador telacoord1;
    TelaCoordenador telacoord2;

    Coordenador coordA = new Coordenador ("Ana", 3, 244323929);
      telacoord1 = new TelaCoordenador (coordA);

    //exibe dados coordenador;
      telacoord1.imprime ();

    Coordenador coordB = new Coordenador ("Fabio", 4, 244323926);
      telacoord2 = new TelaCoordenador (coordB);

    //exibe dados coordenador;
      telacoord2.imprime ();


/*================================================================*/

//Instanciamento de telas item;
    TelaItem telaitem1;
    TelaItem telaitem2;
    TelaItem telaitem3;
    TelaItem telaitem4;
    TelaItem telaitem5;


    Item i21 = new Item ("i21 - Coletes", 1, 10f);
      telaitem1 = new TelaItem (i21);
      telaitem1.imprime ();	//exibe informacoes;

    Item i22 = new Item ("i22 - Bola", 2, 15f);
      telaitem2 = new TelaItem (i22);
      telaitem2.imprime ();

    Item i31 = new Item ("i31 - Arbitro", 3, 50f);
      telaitem3 = new TelaItem (i31);
      telaitem3.imprime ();

    Item i32 = new Item ("i32 - Uniforme", 4, 3f);
      telaitem4 = new TelaItem (i32);
      telaitem4.imprime ();

    Item i33 = new Item ("i33 - Calcados", 5, 3f);
      telaitem5 = new TelaItem (i33);
      telaitem5.imprime ();

/*================================================================*/

//Instanciamento de telas quadra;
    TelaQuadra telaquad1;
    TelaQuadra telaquad2;
    TelaQuadra telaquad3;

    Quadra quadra1 = new Quadra ("Futebol", 1, 35, coordA);
      telaquad1 = new TelaQuadra (quadra1);

      coordA.adicionaQuadrasGerenciadas (quadra1);	// Add coordenador da quadra;

      telaquad1.imprime ();	//exibe informacoes quadra;

    Quadra quadra2 = new Quadra ("Volei ", 2, 40, coordA);
      telaquad2 = new TelaQuadra (quadra2);

      coordA.adicionaQuadrasGerenciadas (quadra2);	// Add coordenador da quadra;

    //Add item a quadra;
      quadra2.adicionaItem (i21);
      quadra2.adicionaItem (i22);

    //impressao dos dados;
      telaquad2.imprime ();

    Quadra quadra3 = new Quadra ("Basquete ", 3, 50, coordB);
      telaquad3 = new TelaQuadra (quadra3);

      coordB.adicionaQuadrasGerenciadas (quadra3);	// Add coordenador da quadra;

    //Add item a quadra;
      quadra3.adicionaItem (i31);
      quadra3.adicionaItem (i32);
      quadra3.adicionaItem (i33);

    //impressao dos dados;
      telaquad3.imprime ();


/*================================================================*/

//Esquema para exibir quadras com respectivos coordenadores; 
    for (Quadra quadra:coordA.getQuadras ())
      {
	System.out.println ("===COORDENADOR-QUADRA===");
	System.out.println (" Coordenador: " + quadra.coordenador.getNome ());
	System.out.println (" Quadra: " + quadra.getEsporte ());
	System.out.println (" ID: " + quadra.getId ());
	System.out.println ("\n------------------------");
      }

    for (Quadra quadra:coordB.getQuadras ())
      {
	System.out.println ("===COORDENADOR-QUADRA===");
	System.out.println (" Coordenador: " + quadra.coordenador.getNome ());
	System.out.println (" Quadra: " + quadra.getEsporte ());
	System.out.println (" ID: " + quadra.getId ());
	System.out.println ("\n------------------------");
      }

/*================================================================*/

//Instanciamento de tela cliente;
    TelaCliente tela1;
    TelaCliente tela2;
    TelaCliente tela3;


    Cliente cli1 = new Cliente ("Joao", 22113344, 1, "joao@gmail", 518787329);
    tela1 = new TelaCliente (cli1);
   

    Cliente cli2 = new Cliente ("Roque", 22113322, 2, "roque@gmail", 517873233);
    tela2 = new TelaCliente (cli2);
  

    Cliente cli3 = new Cliente ("Jean", 22113311, 3, "jean@gmail", 518873000);
    tela3 = new TelaCliente (cli3);
 

/*================================================================*/
//Instanciamento de tela para locacoes;

    TelaLocacao telaloc1;
    TelaLocacao telaloc2;
    TelaLocacao telaloc3;
    TelaLocacao telaloc4;
    TelaLocacao telaloc5;
    TelaLocacao telaloc6;
    TelaLocacao telaloc7;



    Locacao loc1 = new Locacao (1, 300, "Aprovada", "10/10/22", quadra1, cli1);  //Instanciamento de locacao;
    telaloc1 = new TelaLocacao (loc1);  //Associacao de tela a locacao;
    
    quadra1.adicionaLocacaoNaQuadra (loc1); // add quadra em loc;
    cli1.adicionaLocacaoDoCliente (loc1); // add loc a cliente;
    
    
    tela1.imprimeCliente (); // imprime informacoes do cliente;

    
//Locacao 1 usara telaLocacao;
    
    
//-----------------------------

    Locacao loc2 = new Locacao (2, 200, "Aprovada", "12/10/22", quadra1, cli2);
    telaloc2 = new TelaLocacao (loc2);
   
    quadra1.adicionaLocacaoNaQuadra (loc2);
    cli2.adicionaLocacaoDoCliente (loc2);
    tela2.imprimeCliente ();
 

//Locacao 2 usara telaCliente / imprimeCliente() que contem somente informacoes de cadastro;

//-----------------------------

    Locacao loc3 = new Locacao (3, 100, "Aprovada", "13/10/22", quadra2, cli1);
    telaloc3 = new TelaLocacao (loc3);
    
    quadra2.adicionaLocacaoNaQuadra (loc3);
    cli1.adicionaLocacaoDoCliente (loc3);
    tela1.imprimeCliente (); // imprime informacoes do cliente;

//Locacao 3 usara telaCliente /imprimeClienteLoc () que contem informacoes de cadastro e suas locs em seguida;

//-----------------------------

    Locacao loc4 = new Locacao (4, 400, "Aprovada", "14/10/22", quadra2, cli1);
    telaloc4 = new TelaLocacao (loc4);
    
    loc4.addItem (i21); // add item a locacao;
    cli1.adicionaLocacaoDoCliente (loc4);
    quadra2.adicionaLocacaoNaQuadra (loc4);
     
     tela1.imprimeClienteLoc (); // imprime informacoes do cliente;

//Locacao 4 usara telaCliente / imprimeCliente () com infomacoes de cadastro somente;

//-----------------------------

    Locacao loc5 = new Locacao (5, 250, "Aprovada", "15/10/22", quadra2, cli2);
    telaloc5 = new TelaLocacao (loc5);
   
    loc5.addItem (i21);
    loc5.addItem (i22);
    quadra2.adicionaLocacaoNaQuadra (loc5);
    cli2.adicionaLocacaoDoCliente (loc5);
    tela2.imprimeClienteLoc ();

//Locacao 5 usara telaCliente / imprimeCliente () com informacoes de cadastro somente

//-----------------------------

    Locacao loc6 = new Locacao (6, 230, "Aprovada", "18/10/22", quadra3, cli2);
    telaloc6 = new TelaLocacao (loc6);
   
    loc6.addItem (i31);
    loc6.addItem (i32);
    quadra3.adicionaLocacaoNaQuadra (loc6);
    cli2.adicionaLocacaoDoCliente (loc6);
    
    telaloc6.imprimeLocacao ();
   
//Locacao 6 usara telaLocacao () / imprimeLocacao() com informacoes de cadastro cliente e suas locacoes

//-----------------------------

    Locacao loc7 = new Locacao (7, 230, "Aprovada", "18/10/22", quadra3, cli3);
    telaloc7 = new TelaLocacao (loc7);
    
    loc7.addItem (i31);
    loc7.addItem (i32);
    loc7.addItem (i33);
    
    quadra3.adicionaLocacaoNaQuadra (loc7);
    cli3.adicionaLocacaoDoCliente (loc7);
    
    telaloc7.imprimeLocacao (); //Imprime informacoes de locacao

//Locacao 7 usara telaLocacao () / imprimeLocacao() com informacoes de cadastro cliente e suas locacoes

  }
}

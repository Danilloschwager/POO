package Desafio;

public class Ninja {
    //Metodos
    String Missao;
    String nome;
    String aldeia;
    String NivelDificuldade;
    String StatusMissao;
    int idade;

    //Exibir info
    public void MostrarInfo(){
        System.out.println("Meu nome é " + nome + " Tenho " + idade + " anos sou da " + aldeia + ".");
        System.out.println("Minha missao foi " + Missao + ",essa missao foi nivel " + NivelDificuldade + ",e o Status dela é " + StatusMissao + ".");
    }
}

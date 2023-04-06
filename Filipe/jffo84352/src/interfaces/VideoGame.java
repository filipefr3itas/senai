
package interfaces;

public class VideoGame {
    
    private Jogo jogo;
    
    public void ligar (){
        System.out.println("\nLigando console...");
    }
    
    public void jogar (Jogo jogo){
        this.jogo = jogo;
        jogo.jogar();
         }
 
    public void fechar (){
        this.jogo.fechar();
    }
    
    public void desligar (){
        System.out.println("\nDesligando o console...\n");
    }
    
    public void novojogo (){
        System.out.println("Iniciando um novo jogo!\n");
    }
}

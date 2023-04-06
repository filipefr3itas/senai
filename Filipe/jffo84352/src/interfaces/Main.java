
package interfaces;


public class Main {

    public static void main(String[] args) {
       
        VideoGame console = new VideoGame();
      
        
        console.ligar();
        console.jogar(new PingPong());
        console.fechar();
        
        console.novojogo();
        
        console.jogar(new Rpg());
        console.fechar();
        
        console.novojogo();
        
        console.jogar(new CriminalCase());
        console.fechar();
      
        
        console.novojogo();
        
        console.jogar(new MarioKart());
        console.fechar();
        console.desligar();
    }
    
}

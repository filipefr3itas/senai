
package interfaces;


public class PingPong implements Jogo {

    @Override
    public void jogar() {
        System.out.println("\nIniciando jogo de Ping-Pong\n");
        System.out.println("Jogue uma bolinha...\n");
      
    }

    @Override
    public void fechar() {
        System.out.println("Fechando o jogo de Ping-Pong...\n");  
       
    }
    
    
    
    
}

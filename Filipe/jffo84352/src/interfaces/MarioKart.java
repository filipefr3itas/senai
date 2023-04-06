
package interfaces;


public class MarioKart implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Entrando na partida...\n");
        System.out.println("Escolha a sua pista!\n");
        System.out.println("Agora escolha seu carro...\n");
        System.out.println("3, 2, 1! GO!");
    }
    
    @Override
    public void fechar() {
        System.out.println("Partida encerrada...");
        
    }
    
    
    
}

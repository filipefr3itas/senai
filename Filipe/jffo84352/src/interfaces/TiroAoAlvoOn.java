
package interfaces;


public class TiroAoAlvoOn implements Jogo {

    @Override
    public void jogar() {
        System.out.println("\nIniciando o jogo.\n");    
        System.out.println("Carregando o servidor...\n");
        System.out.println("Preparando a partida\n");
        System.out.println("Acertando o alvo.\n");
    }
    

    @Override
    public void fechar() {
        System.out.println("Fechando a partida...\n");
        System.out.println("Fechando a conexão com servidor...\n");
    
    }
    
}

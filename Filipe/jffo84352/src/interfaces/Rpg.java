
package interfaces;


public class Rpg implements Jogo {

    @Override
    public void jogar() {
        System.out.println("Conectando o servidor...\n");
        System.out.println("Escolha o seu mundo: \n");
        System.out.println("Entrando no personagem...\n");
    }

    @Override
    public void fechar() {

        System.out.println("Saindo do mundo...\n");
    }
    
    
    
}

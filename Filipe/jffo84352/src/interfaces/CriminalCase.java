
package interfaces;


public class CriminalCase implements Jogo {

    @Override
    public void jogar() {
        System.out.println("Escolha seu personagem: ");
        System.out.println("\nQual crime desvendar? \n");
        System.out.println("Entrando da cena... \n");
    }

    @Override
    public void fechar() {
        System.out.println("Saindo da cena...");
    }
    
    
}

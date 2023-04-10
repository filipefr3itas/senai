
package exerciciointerface;

public class Lexmark implements Impressora {

    @Override
    public void imprimir() {
        System.out.println("Impressora Lexmark atualizada...");
        System.out.println("Iniciando impressão!");
    }
    
}

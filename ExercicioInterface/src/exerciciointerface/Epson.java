
package exerciciointerface;

public class Epson implements Impressora {

    @Override
    public void imprimir() {
        System.out.println("Impressora Epson atualizada...");
        System.out.println("Iniciando impressão!");
    }
    
    
}

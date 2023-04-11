
package exerciciointerface;


public class Hp implements Impressora {

    @Override
    public void imprimir() {
        System.out.println("Impressora HP atualizada...");
        System.out.println("Iniciando impressão!");
    }
    
}

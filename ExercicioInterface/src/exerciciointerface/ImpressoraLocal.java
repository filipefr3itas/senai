
package exerciciointerface;

public class ImpressoraLocal {
    
    private Impressora impressora;
      public void ligar (Impressora impressora){
        this.impressora = impressora;
        System.out.println("Ligando a impressora " + impressora.getClass().getSimpleName()+ "...");
    }
    
    public void imprimir () {
        this.impressora.imprimir();
    }
    
    public void desligar (){
        System.out.println("Desligando a impressora "  + impressora.getClass().getSimpleName()+ "...");
    }
    
}

 /*
    public void ligar (){
        System.out.println("Ligando a impressora...");
    }
    
    public void imprimir ( Impressora impressora){
        this.impressora = impressora;
        impressora.imprimir();
    }
    
    public void desligar (){
        System.out.println("Desligando a impressora...");
    }*/
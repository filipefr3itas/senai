
package exerciciointerface;


public class main {

    public static void main(String[] args) {
        
        ImpressoraLocal imp1 = new ImpressoraLocal();
        
        imp1.ligar(new Epson());
        imp1.imprimir();
        imp1.desligar();
      
    }
    
}


  
        
        
        /*
        imp1.ligar();
        imp1.imprimir(new Hp());
        imp1.desligar();
        
        System.out.println("\n"); 
        
        imp1.ligar();
        imp1.imprimir(new Lexmark());
        imp1.desligar();
        
        System.out.println("\n"); 
       
        imp1.ligar();
        imp1.imprimir(new Epson());
        imp1.desligar();
        */
               

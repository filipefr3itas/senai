
package sobrecarga;

public class Main {

    
    public static void main(String[] args) {
        Sobrecarga sobrecarga1 = new Sobrecarga();
        
        System.out.println(sobrecarga1.somar("Filipe", "doc"));
        System.out.println(sobrecarga1.somar("Filipe", "10-04-2023", "doc")); 
              
        
    }
    
}

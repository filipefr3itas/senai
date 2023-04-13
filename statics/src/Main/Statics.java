
package Main;

import java.time.LocalDate;
import java.time.Month;

public class Statics {


    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Filipe", LocalDate.of(2002, Month.MARCH, 12), 1500);
        
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getDataNascimento());
        System.out.println(pessoa.getSalario());
        
    }
    
}

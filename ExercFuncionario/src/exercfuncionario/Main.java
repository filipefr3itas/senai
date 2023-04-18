
package exercfuncionario;

import java.time.LocalDate;
import java.time.Month;

public class Main {

   
    public static void main(String[] args) {
        
        Diretor diretor = new Diretor("José", "8598", "16083", Genero.MASCULINO, 2500, LocalDate.of(2022, Month.MARCH, 12));
        Motoboy motoboy = new Motoboy("PQZ065", "Joseane", "9898", "88788", Genero.FEMININO, 1330, LocalDate.of(2023, Month.JANUARY, 15));
        Gerente gerente = new Gerente("Carlos", "9898", "5587", Genero.MASCULINO, 1900, LocalDate.of(2022, Month.JANUARY, 12));
        
        System.out.println(diretor.toString());
        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());
    }
    
}

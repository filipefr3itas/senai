
package ExercicioData;


import java.time.LocalDate;
import java.time.Month;


public class Avaliacao {

    
    public static void main(String[] args) {
      
        Advogado adv1 = new Advogado("0065", "0065", "0065", "0065", 1500, Genero.FEMININO, EstadoCivil.SEPARADO, LocalDate.of(2002, Month.MARCH, 12), "Joana", 01, "71985", "joana@km.com", new Endereco("Rua A", "00", "Não", "44545", "Salvador", UnidadeFederativa.BAHIA));
        Cliente cli1 = new Cliente("0065", Genero.FEMININO, EstadoCivil.SOLTEIRO, LocalDate.of(1998, Month.MARCH, 30), "Jessica", 56, "7198", "jess@km.com",new Endereco("Rua A", "00", "Não", "44545", "Salvador", UnidadeFederativa.BAHIA));
        PrestacaoServico prest1 = new PrestacaoServico(LocalDate.of(2023, Month.JANUARY, 15), LocalDate.of(2023, Month.MARCH, 25), "0065", "65968947", "João", 05, "9898", "kd@ks.com", new Endereco("Rua A", "00", "Não", "44545", "Salvador", UnidadeFederativa.BAHIA));
        Fornecedor forn1 = new Fornecedor("Maçã", "0065", "06587", "Carlos", 6898, "719889", "lkb@sen.com", new Endereco("Rua A", "00", "Não", "44545", "Salvador", UnidadeFederativa.BAHIA));
                
                
        System.out.println(adv1.toString());
        System.out.println(cli1.toString());
        System.out.println(prest1.toString());
        System.out.println(forn1.toString());
        
    }
    
}
 /* Engenheiro eng1 = new Engenheiro("0069", "0069", "00069", "0069", 2500, Genero.MASCULINO, "Pedro", 02, "71989", "pedro@km.com", new Endereco("Rua B", "01", "Não", "54848", "Fortaleza", UnidadeFederativa.CEARÁ));
        Medico med1 = new Medico("0067", "0067", "0067", "0067", 2300, Genero.FEMININO, "Icaro", 03, "719879", "icaro@km.com", new Endereco("Rua C", "02", "Não", "Amazonas", "548488", UnidadeFederativa.ACRE));
        Cliente cli1 = new Cliente("00989", Genero.FEMININO, "Jessica", 04, "71879898", "jes@km.com", new Endereco("Rua D", "03", "Não", "Salvador", "7899898", UnidadeFederativa.DISTRITO_FEDERAL));
        Fornecedor forn1 = new Fornecedor(
        PrestacaoServico prest1 = new PrestacaoServico */ 
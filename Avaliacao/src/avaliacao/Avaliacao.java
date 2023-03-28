
package avaliacao;

import com.sun.security.ntlm.Client;


public class Avaliacao {

    
    public static void main(String[] args) {
        Advogado adv1 = new Advogado("0065", "0065", "0065", "0065", 1500, Genero.FEMININO, "Joana", 01, "71985", "joana@km.com", new Endereco("Rua A", "00", "Não", "44545", "Salvador", UnidadeFederativa.BAHIA));
        Engenheiro eng1 = new Engenheiro("0069", "0069", "00069", "0069", 2500, Genero.MASCULINO, "Pedro", 02, "71989", "pedro@km.com", new Endereco("Rua B", "01", "Não", "54848", "Fortaleza", UnidadeFederativa.CEARÁ));
        Medico med1 = new Medico("0067", "0067", "0067", "0067", 2300, Genero.FEMININO, "Icaro", 03, "719879", "icaro@km.com", new Endereco("Rua C", "02", "Não", "Amazonas", "548488", UnidadeFederativa.ACRE));
        Cliente cli1 = new Cliente("00989", Genero.FEMININO, "Jessica", 04, "71879898", "jes@km.com", new Endereco("Rua D", "03", "Não", "Salvador", "7899898", UnidadeFederativa.DISTRITO_FEDERAL));
        PJuridica pj1 = new PJuridica("0065", "98989", "Vitor", 05, "7198989", "ic@km.com", new Endereco("Rua E", "04", "Não", "Rio", "41310", UnidadeFederativa.RIO_DE_JANEIRO));
       
        
        System.out.println(adv1.toString());
        System.out.println(eng1.toString());
        System.out.println(med1.toString());
        System.out.println(cli1.toString());
        System.out.println(pj1.toString());
    }
    
}


package ExercicioData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class PrestacaoServico extends PJuridica{
    protected LocalDate contratoInicio;
    protected LocalDate contratoFim;
    DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public PrestacaoServico() {
    }

    @Override
    public String toString() {
        return  "\nPRESTADOR DE SERVIÇOS\n" + "\nNome: " + super.nome + "\nCNPJ: " + super.cnpj +
                "\nId: " + super.id 
                + "\nTelefone: " + super.telefone +
                "\nEmail: " + super.email  + 
                "\nInscrição Estadual: " + super.inscricaoEstadual +
                "\nÍnicio do Contrato: " + getContratoInicio() +
                "\nFim do Contrato: " + getContratoFim()+
                "\nENDEREÇO\n" 
                + "Logradouro: " + this.endereco.getLogradouro()
                + "\nCidade: " + this.endereco.getCidade() 
                + "\nUF: " + this.endereco.getUf().sigla + 
                "\nNúmero: " + this.endereco.getNumero() 
                + "\nComplemento: " + this.endereco.getComplemento() +
                "\nCEP:" + this.endereco.getCep() ; 
    }
    
    

    public PrestacaoServico(LocalDate contratoInicio, LocalDate contratoFim, String cnpj, String inscricaoEstadual, String nome, int id, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, nome, id, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    public String getContratoInicio () {
        return contratoInicio.format(formatar);
    }

    public void setContratoInicio(LocalDate contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public String getContratoFim() {
        return contratoFim.format(formatar);
    }

    public void setContratoFim(LocalDate contratoFim) {
        this.contratoFim = contratoFim;
    }
    
    
    
    
}


package exercfuncionario;

import java.time.LocalDate;


public class Motoboy extends Funcionario{
    
    protected String placaDaMoto;
    
    @Override
    public double getSalarioFinal() {
       return getSalarioBase(); 
    }

    public Motoboy() {
    }
    
     @Override
    public String toString() {
        return "MOTOBOY\n" + "Placa da moto: " + placaDaMoto + "\nNome: " + super.getNome() + "\nCPF: " +super.getCpf() + "\nRG: " +super.getRg() + "\nGenero: " + super.getGenero().texto
                + "\nData de Admissão: " + this.getDataAdmissao() + "\nSalário: " + Util.formatarBrl(getSalarioFinal());
    }

    public Motoboy(String placaDaMoto, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salarioBase, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }
   
    
    
    
}
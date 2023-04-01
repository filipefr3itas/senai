
package ExercicioData;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class PFisica extends Pessoa{
   protected Genero genero;
   protected EstadoCivil estcivil;
   LocalDate dataNasc;

    public PFisica() {
    }

    public PFisica(Genero genero, EstadoCivil estcivil, LocalDate dataNasc, String nome, int id, String telefone, String email, Endereco endereco) {
        super(nome, id, telefone, email, endereco);
        this.genero = genero;
        this.estcivil = estcivil;
        this.dataNasc = dataNasc;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public EstadoCivil getEstcivil() {
        return estcivil;
    }

    public void setEstcivil(EstadoCivil estcivil) {
        this.estcivil = estcivil;
    }
    
    public int getIdade (){
        return Period.between(this.dataNasc, LocalDate.now()).getYears();
    }

    public String getDataNasc() {
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataNasc.format(formatar);
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    
}
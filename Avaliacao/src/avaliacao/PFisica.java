
package avaliacao;

public abstract class PFisica extends Pessoa{
   protected int idade;
   protected Genero genero;

    public PFisica() {
    }

    public PFisica(Genero genero, String nome, int id, String telefone, String email, Endereco endereco) {
        super(nome, id, telefone, email, endereco);
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
   
   
    
}

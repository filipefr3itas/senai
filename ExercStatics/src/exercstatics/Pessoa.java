
package exercstatics;


public abstract class Pessoa {
    private int id;
    private String nome;
    private Genero genero;
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, Genero genero, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
}

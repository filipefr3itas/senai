
package avaliacao;

public abstract class Funcionario extends PFisica{
    protected String cpf;
    protected String rg;
    protected String matricula;
    protected double salario;
    protected Setor setor;
    
    public Funcionario() {
    }

    public Funcionario(String cpf, String rg, String matricula, double salario, Setor setor, Genero genero, String nome, int id, String telefone, String email, Endereco endereco) {
        super(genero, nome, id, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.salario = salario;
        this.setor = setor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() { 
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    
    
}
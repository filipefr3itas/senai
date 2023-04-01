
package ExercicioData;

public class Fornecedor extends PJuridica{
    protected String produto;

    public Fornecedor() {
    }

    public Fornecedor(String produto, String cnpj, String inscricaoEstadual, String nome, int id, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, nome, id, telefone, email, endereco);
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nFORNECEDOR\n" + "\nNome: " + super.nome + "\nCNPJ: " + super.cnpj +
                "\nId: " + super.id 
                + "\nTelefone: " + super.telefone +
                "\nEmail: " + super.email  + 
                "\nInscrição Estadual: " + super.inscricaoEstadual +
                "\nProduto: " + produto +
                "\nENDEREÇO\n" 
                + "Logradouro: " + this.endereco.getLogradouro()
                + "\nCidade: " + this.endereco.getCidade() 
                + "\nUF: " + this.endereco.getUf().sigla + 
                "\nNúmero: " + this.endereco.getNumero() 
                + "\nComplemento: " + this.endereco.getComplemento() +
                "\nCEP:" + this.endereco.getCep() ; 
   
    }
    
    

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
     
    
    
    
}

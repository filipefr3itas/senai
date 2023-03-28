
package avaliacao;


public class Cliente extends PFisica {
    protected String protocoloAtendimento;

    public Cliente() {
    }

    public Cliente(String protocoloAtendimento, Genero genero, String nome, int id, String telefone, String email, Endereco endereco) {
        super(genero, nome, id, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }
    
    @Override
    public String toString() {
        return  "\nCLIENTE:\n" + "\nNome: " + super.nome +  
                "\nId: " + super.id
                + "\nTelefone: " + super.telefone +
                "\nProtocolo de Atendimento: " + protocoloAtendimento +
                "\nEmail: " + super.email +
                "\nIdade: " + super.idade + 
                "\nGenêro: " + super.genero + 
                "\nENDEREÇO\n" 
                + "Logradouro: " + this.endereco.getLogradouro()
                + "\nCidade: " + this.endereco.getCidade() 
                + "\nUF: " + this.endereco.getUf().sigla + 
                "\nNúmero: " + this.endereco.getNumero() 
                + "\nComplemento: " + this.endereco.getComplemento() +
                "\nCEP:" + this.endereco.getCep() ; 
    }
       

    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(String protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
    
    
    
}

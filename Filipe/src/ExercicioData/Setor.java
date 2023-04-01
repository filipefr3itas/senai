package ExercicioData;


public enum Setor {
    ENGENHARIA ("ENG"),
    SAÚDE ("SAU"),
    JURÍDICO ("JUR"); 
    
    protected String nome; 

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
}

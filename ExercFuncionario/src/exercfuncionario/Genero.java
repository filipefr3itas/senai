
package exercfuncionario;


public enum Genero {
    FEMININO("Feminino")  ,
    MASCULINO ("Masculino") ;

    
    protected String texto;

    private Genero( String texto) {
        
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
    


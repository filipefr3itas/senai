
package ExercicioData;

public enum EstadoCivil {
    SOLTEIRO ("Solteiro"),
    CASADO ("Casado"),
    SEPARADO ("Separado"),
    DIVORCIADO ("Divorciado"),
    VIÚVO ("Viúvo"); 
    
    protected String texto;

    private EstadoCivil(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
}

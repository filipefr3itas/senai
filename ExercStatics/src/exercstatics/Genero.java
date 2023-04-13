
package exercstatics;


public enum Genero {
    FEMININO('F',"Feminino")  ,
    MASCULINO ('M', "Masculino") ;

    protected char sigla;
    protected String texto;

    private Genero(char sigla, String texto) {
        this.sigla = sigla;
        this.texto = texto;
    }

    public char getSigla() {
        return sigla;
    }

    public String getTexto() {
        return texto;
    }
}
      
  
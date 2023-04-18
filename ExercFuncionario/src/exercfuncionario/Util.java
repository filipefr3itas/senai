
package exercfuncionario;


import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Util {
    public static String formatarData (LocalDate data ){
            DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return formatar.format(data);
            }
   public static String formatarBrl (double valor){
       NumberFormat formatar = NumberFormat.getCurrencyInstance();
       return formatar.format(valor);
   }
    
   public static String formatarPercentual1 (Bonificacao bonificacao){
      double resultado = bonificacao.valor * 100;
      return resultado + "%";
       
   }
   
   public static String formatarPercentual2 (final double PARTICIPACAO_LUCRO){
      double resultado = PARTICIPACAO_LUCRO * 100;
      return resultado + "%";
   }
           
           
}

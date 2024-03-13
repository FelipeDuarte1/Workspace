package src.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
    //metodos da classe

    //Static só executa algo, mas não armazena valores, tamém pode chamar esses metodos sem instanciar o objeto 
    public static String converterDateParaDataEHora(Date data){

        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY HH:mm");

        return formatador.format(data);
    }
    public static String converterDateParaData(Date data){

        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");

        return formatador.format(data);
    }
    public static String converterDateParaHora(Date data){

        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm:ss");

        return formatador.format(data);
    }
    
    
    
   
}

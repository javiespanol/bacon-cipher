import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Parser {
    
    public Map<String, String> leerFichero(String fichero, Boolean decisor){
        
        Map<String, String> letras = new HashMap<String,String>();

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File (fichero);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
   
            String linea;
            while((linea=br.readLine())!=null){
                if(decisor){
                    letras.put(linea.substring(1,6),linea.substring(0,1)); //descifrado
                }else{
                    letras.put(linea.substring(0,1),linea.substring(1,6)); //cifrado
                }
            }
         }
         catch(Exception e){
            e.printStackTrace();
         }

         return letras;
        
    }
}

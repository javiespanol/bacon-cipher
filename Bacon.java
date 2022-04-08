import java.util.ArrayList;
import java.util.Map;

public class Bacon {


    public String descifrar(String msg){

        String binario="";
        String resultado="";
        ArrayList<String> trozos = new ArrayList<String>();
        Parser miPar = new Parser();
        Map<String, String> letras = miPar.leerFichero("diccionario.txt",true);

        for (int i = 0; i < msg.length(); i++) {
            if(!Character.isLetter(msg.charAt(i)))
                msg=msg.replace(Character.toString(msg.charAt(i)), "");
        }

        System.out.println(msg);

        for (int i = 0; i < msg.length(); i++) {
            if(Character.isUpperCase(msg.charAt(i))){
                binario=binario+"1";
            }else{
                binario=binario+"0";
            }
        }

        int longitud=binario.length();
        for(int i=0; i<longitud; i=i+5){
            trozos.add(binario.substring(i,Math.min(longitud,i+5)));
        }

        for(int i=0; i<trozos.size();i++){
            resultado=resultado+letras.get(trozos.get(i));
        }

        return resultado;

    }

    public String cifrar(String msg){

        String resultado = "";
        String binario = "";
        Parser miPar = new Parser();
        Map<String, String> letras = miPar.leerFichero("diccionario.txt",false);

        for (int i = 0; i < msg.length(); i++) {
            binario=binario+letras.get(msg.substring(i,i+1));
        }

        for (int i = 0; i < binario.length(); i++) {
            if(binario.substring(i,i+1).equals("0")){
                resultado=resultado+"a";
            }else{
                resultado=resultado+"A";
            }
        }

        return resultado;

    }
}

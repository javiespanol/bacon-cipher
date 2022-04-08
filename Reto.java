public class Reto {
    public static void main(String[] args) {

        Bacon bacon = new Bacon();

        if(args.length<2){
            System.out.println("Lea el fichero readme.txt");
            System.exit(-1);
        }

        if(args[0].equals("-D")){
            System.out.println(bacon.descifrar(args[1]));
        }else if(args[0].equals("-C")){
            System.out.println(bacon.cifrar(args[1]));
        }
        return;
    }
}
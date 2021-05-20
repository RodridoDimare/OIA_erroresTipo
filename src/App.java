import java.io.*;

public class App {
    public static void main(String[] args) {
        File f = null;
        FileReader fr = null;
        BufferedReader br =null;
        String cadenaOrdenada = null;
        String cadenaDesordenada = null;
        int catindadMovimientos = 0;
        try{
            f = new File( "archivo.txt" );
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String lineaArchivo;
            if((lineaArchivo=br.readLine())!=null){
                cadenaOrdenada = lineaArchivo;
            }
            if((lineaArchivo=br.readLine())!=null){
                cadenaDesordenada = lineaArchivo;
            }
            Errores error = new Errores();
            catindadMovimientos= Errores.procesador(cadenaOrdenada,cadenaDesordenada);
            System.out.println(catindadMovimientos);
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Errores {
    public static int procesador(String texto, String prueba){
        int cont = 0;
        int j = 0;
        boolean flag;
        String inicio;
        String medio;
        String fin;
        String aux;
        for (int i = 0; i < texto.length(); i++) {
            flag=false;
            j=i;
            while(j<prueba.length() && flag!= true){
                if(prueba.charAt(j) == texto.charAt(i)){
                    if(i == 0) {
                        cont += j;
                        inicio = String.valueOf(prueba.charAt(j));
                        medio = prueba.substring(0,j);
                        fin = prueba.substring(j+1,prueba.length());
                        prueba = inicio + medio + fin;
                    }else{
                        cont += Math.abs(j-i);
                        inicio = prueba.substring(0,i);
                        aux = prueba.substring(i,j);
                        medio = String.valueOf(prueba.charAt(j));
                        inicio = inicio + medio + aux;
                        fin = prueba.substring(j+1,prueba.length());
                        prueba = inicio + fin;
                    }
                    System.out.println(prueba);
                    flag =true;
                }
                j++;
            }
        }
        return cont;
    }
}

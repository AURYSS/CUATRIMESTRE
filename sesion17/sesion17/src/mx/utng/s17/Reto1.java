package mx.utng.s17;

import java.io.File;

public class Reto1{
    public static void main(String[] args){
        File directorioInicial = new File("/home/tux/Descargas");

        muestraContenidoDirectorio(directorioInicial);

    }
    private static void muestraContenidoDirectorio(File directorio){
        //poner la marca de inicio y el nombre del primer directorio
        colocaEspacios(directorio.getParent(), 'D');
        System.out.println(directorio.getName());

        //crear un arreglo de subdirectorios
        File[] subdirectorios = directorio.listaFiles();
        
        //recorrer la lista de archivos y verificamos que sean A o D 
        for (File file : subdirectorios){
            //verificar si es archivo
            if (file.isFile()){
                colocaEspacios(file.getParent(), 'A'));
                System.out.println(archivo.getName());
        }else if(archivo.isDirectory()){
            muestraContenidoDirectorio(archivo);
        }


    }
    private static void colocaEspacios(String padre, char simbolo){
        //colocar la marca de inicio de linea [A] - Archivo [D] - Directorio
        System.out.println("["+simbolo+"]");

        //colocar serie de guiones de acuerdo a la profundidad del directorio
        for (int i=0 < padre.length(); i++){
            System.out.println("-")
        }

    }
}
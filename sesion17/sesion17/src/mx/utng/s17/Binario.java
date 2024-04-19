package mx.utng.s17
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io,FileNotFoundException;

public class Binario {
    public staticvoid main(String[] args) throw FileNotFoundException, IOException{
        //declaremos instancia de BufferedInputStream
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("aurora 2.jpg"))
        //declaremos instancia de BufferedOutputStream
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("aurora 2.jpg"))
        //definimos el buffer de escritura de datos 
        byte[] buffer = new byte[1024];
        //iniciar la copia del archivo 
        int bytesleidos = 0;
        while ((bytesleidos = bis.read(buffer))>0){
            bos.write(buffe, 0,bytesleidos);

        }
    }
}
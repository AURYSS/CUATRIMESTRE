import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/*
 * @author: CECILIA AURORA ROBELO HERNÁNDEZ 
 * @date: 16/02/2024
 * @grupo: GDS0624
/ */
/
public class CrearArchivoPoema {
    public static void main(String[] args) {
        String cielosDeBytes = "Bajo cielos de bytes y en el lenguaje del amor,";
        String codigoJavaAbrazos = "En el código Java de tus abrazos, mi mejor error.";
        String dosVariablesOjos = "Tus ojos, dos variables que me hacen soñar,";
        String loopsDePasion = "Entre loops de pasión, mi corazón va a programar.";

        // Nombre del archivo
        String nombreArchivo = "poema_14_febrero.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            // Escribir el poema en el archivo
            writer.println(cielosDeBytes);
            writer.println(codigoJavaAbrazos);
            writer.println(dosVariablesOjos);
            writer.println(loopsDePasion);

            System.out.println("Poema guardado en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
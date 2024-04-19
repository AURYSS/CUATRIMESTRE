public class NumerosPares{
    public static void main(String[] args){
        //utilizando el modulo poner todos los numeros
        //pares que hay en un rango dado por el usuario
        //inicio, fin, i
        //ciclo for o while o do while, if 
        import java.util.Scanner;

public class NumerosParesEnRango {
    public static void main(String[] args) {
        // Obtener el rango del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de inicio: ");
        int inicio = scanner.nextInt();
        System.out.print("Ingrese el número de fin: ");
        int fin = scanner.nextInt();

        // Imprimir números pares en el rango utilizando un bucle for
        System.out.println("Números pares en el rango:");
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

    }
}
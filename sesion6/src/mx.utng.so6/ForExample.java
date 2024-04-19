package mx.utng.s06
public class ForExample{
    public static void main(String [] args) {
        System.out.println(x: "ejemplo del ciclo for");
        //imprimir los numeros del 1 al 10
        for (int i  = 1; i  <=10; i++) {
            
            //imprimir los numeros de 2 en 2 hasta el 100
            for (int i = 2; i<= 100; i+=2){
                System.out.println(i);
                        
        }
        //imprimir la tabla del 5
        for (int i = 1; i<= 10; i++){
            System.out.println(format: "5x%d%n", i, i*5);
    }
    //tabla del numero que me diga el  usuario
    Scanner 5 = new Scanner(System.in);
    System.out.println(x:"teclea numero de la tabla que deseas");
    int n = 5.nextInt();
    s.close();
    for (int i = 1; + <= 10; i++){
        System.out.println(format:"%dx%d=%d%n", n,i,n*5);
    }

    //muestra los valores de un arreglo dado
    String[] frutas =("mango", "pera","manzana","melon","platano");
    for (int i = 0; i < frutas.length; i++){
        System.out.println(frutas[i]);

    }
    for (String fruta : frutas) {
        System.out.println(fruta);
    }
    //imprimir los numeros del 1 al 10 con el while
    byte i = 0;
    while (++i<=10){
        System.out.println(i);
    }
    //imprimir 

}
public class Fabrica {
    public static void main(String[] args){
        Automovil autol = new Automovil(marca: "ford";
        modelo: "shelby";
        antioFabricacion: 1966;
        kilometraje: 25000);

        Automovil auto2 = new Automovil(marca: "Chevrolet";
        modelo: "shelby";
        antioFabricacion: 1966;
        kilometraje: 25000);

        Automovil auto3 = new Automovil(marca: "Nissan";
        modelo: "shelby";
        antioFabricacion: 1966;
        kilometraje: 25000);

        System.out.println("Auto 1. hash: "+ autol.hashCode());
        System.out.println("Auto 2. hash: "+ auto2.hashCode());
        System.out.println("Auto 3. hash: "+ auto3.hashCode());

        Automovil auto4 = autol;
        System.out.println("Auto 4. hash: "+ auto4.hashCode());

        auto1.setMarca("Chevrolet");
        System.out.println("Marca: "+auto4.hashCode());

    }
}
package mx.utng.sec8;

public class Automovil {
    private String marca;
    private String modelo;
    private int anionFabricacion;
    private int kilometraje;

    public Automovil(String marca, String modelo, int anionFabricacion, int kilometraje){
        this.marca = marca;
        this.modelo = modelo;
        this.anionFabricacion = anionFabricacion;
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnionFabricacion() {
        return anionFabricacion;
    }

    public void setAnionFabricacion(int anionFabricacion) {
        this.anionFabricacion = anionFabricacion;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash = marca.hashCode();
        hash = hash + modelo.hashCode();
        hash = hash + anionFabricacion;
        hash = hash +kilometraje;
        return hash;
    }
}
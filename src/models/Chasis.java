package models;

public class Chasis {

    private String tipo;
    private String dimensiones;
    private int peso;

    public Chasis(String tipo, String dimensiones, int peso){
        this.tipo = tipo;
        this.dimensiones = dimensiones;
        this.peso = peso;
    }

    public void mostrarDatosChasis(){
        System.out.println("Datos del chasis: ");
        System.out.println("Tipo: " + tipo);
        System.out.println("Dimensiones: " + dimensiones);
        System.out.println("Peso: " + peso);
    }

}

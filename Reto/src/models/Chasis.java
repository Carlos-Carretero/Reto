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
    public Chasis(){}

    public String getTipo(){
        return tipo;
    }
    public String getDimensiones(){
        return dimensiones;
    }
    public int getPeso(){
        return peso;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setDimensiones(String dimensiones){
        this.tipo = dimensiones;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }

    public void mostrarDatosChasis(){
        System.out.println("Datos del chasis: ");
        System.out.println("Tipo: " + tipo);
        System.out.println("Dimensiones: " + dimensiones);
        System.out.println("Peso: " + peso);
    }

}

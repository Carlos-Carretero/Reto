package models;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int año;
    private int identificador;

    public Vehiculo(){}

    public Vehiculo(int identificador, String marca, String modelo, int año){
        this.identificador = identificador;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void displayInfo(){
        System.out.println("Info del vehículo: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAño(){
        return año;
    }
    public int getIdentificador(){
        return identificador;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAño(int año){
        this.año = año;
    }
    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }
}

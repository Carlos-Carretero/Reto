package models;

public class Motor {

    private String tipo;
    private int cilindrada;
    private int potencia;

    public Motor(String tipo, int cilindrada, int potencia){
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    public void mostrarDatos(){
        System.out.println("Datos del motor: ");
        System.out.println("Tipo: " + tipo);
        System.out.println("Cilindraje: " + cilindrada);
        System.out.println("Potencia: " + potencia);
    }

}

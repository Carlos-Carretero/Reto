package models;

public class Neumatico {

    private String llanta;
    private String tamaño;
    private String presion;

    public Neumatico(String llanta, String tamaño, String presion){

        this.llanta = llanta;
        this.tamaño = tamaño;
        this.presion = presion;

    }

    public void mostrarDatosNeumatico(){
        System.out.println("Datos del Neumático: ");
        System.out.println("Llanta: " + llanta);
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Presion: " + presion);
    }

}

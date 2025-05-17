package models;

public class Sensor {

    private String velocidad;
    private String temperatura;
    private String presion;

    public Sensor(String velocidad, String temperatura, String presion){

        this.velocidad = velocidad;
        this.temperatura = temperatura;
        this.presion = presion;

    }

    public void mostrarDatosSensor(){

        System.out.println("Datos: ");
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Presion: " + presion);
    }

}

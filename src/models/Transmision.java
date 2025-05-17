package models;

public class Transmision {

    private String tipo;
    private String marchas;
    private String traccion;

    public Transmision(String tipo, String marchas, String traccion){
        this.tipo = tipo;
        this.marchas = marchas;
        this.traccion = traccion;
    }

    public void mostrarDatosTransmision(){
        System.out.println("datos: ");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marchas: " + marchas);
        System.out.println("Traccion: " + traccion);
    }

}

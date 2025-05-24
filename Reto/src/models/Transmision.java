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

    public Transmision(){}

    public void mostrarDatosTransmision(){
        System.out.println("datos: ");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marchas: " + marchas);
        System.out.println("Traccion: " + traccion);
    }

    public String getTipo(){
        return tipo;
    }
    public String getMarchas(){
        return marchas;
    }
    public String getTraccion(){
        return traccion;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setMarchas(String marchas){
        this.marchas = marchas;
    }
    public void setTraccion(String traccion){
        this.traccion = traccion;
    }


}

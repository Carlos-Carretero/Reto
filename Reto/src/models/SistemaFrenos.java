package models;

public class SistemaFrenos {

    private String tipo;
    private String discos;
    private String abs;
    private String estado;

    public SistemaFrenos(String tipo, String discos, String abs, String estado){
        this.tipo = tipo;
        this.discos = discos;
        this.abs = abs;
        this.estado = estado;
    }
    public SistemaFrenos(){}

    public void mostrarDatosSistemaFrenos(){
        System.out.println("Datos del Sistema de frenos: ");
        System.out.println("Tipo: " + tipo);
        System.out.println("Discos:"  + discos);
        System.out.println("ABS: " + abs);
        System.out.println("Estado: " + estado);
    }

    public String getTipo(){
        return tipo;
    }
    public String getDiscos(){
        return discos;
    }
    public String getAbs(){
        return abs;
    }
    public String getEstado(){
        return estado;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setDiscos(String discos){
        this.discos = discos;
    }
    public void setAbs(String abs){
        this.abs = abs;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }


}

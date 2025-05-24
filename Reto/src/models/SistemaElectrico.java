package models;

public class SistemaElectrico {

    private String bateria;
    private String luces;
    private String sensores;

    public SistemaElectrico(String bateria, String luces, String sensores){
        this.bateria = bateria;
        this.luces = luces;
        this.sensores = sensores;
    }

    public SistemaElectrico(){}

    public void mostrarDatosSistema(){
        System.out.println("Datos del Sistema: ");
        System.out.println("Bateria: " + bateria);
        System.out.println("Luces: " + luces);
        System.out.println("Sensores: " + sensores);
    }

    public String getBateria(){
        return bateria;
    }
    public String getLuces(){
        return luces;
    }
    public String getSensores(){
        return sensores;
    }

    public void setBateria(String bateria){
        this.bateria = bateria;
    }
    public void setLuces(String luces){
        this.luces = luces;
    }
    public void setSensores(String sensores){
        this.sensores = sensores;
    }

}

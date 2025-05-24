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
    public Neumatico(){};

    public String getLlanta(){
        return llanta;
    }
    public String getTamaño(){
        return tamaño;
    }
    public String GetPresion(){
        return presion;
    }

    public void setLlanta(String llanta){
        this.llanta = llanta;
    }
    public void setTamaño(String Tamaño){
        this.tamaño = tamaño;
    }
    public void setPresion(String presion){
        this.presion = presion;
    }

    public void mostrarDatosNeumatico(){
        System.out.println("Datos del Neumático: ");
        System.out.println("Llanta: " + llanta);
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Presion: " + presion);
    }

}

package models;

public class Mantenimiento {

    private String historial;
    private String mantenimientos;

    public Mantenimiento(String historial, String mantenimientos){
        this.historial = historial;
        this.mantenimientos = mantenimientos;
    }

    public void mostrarDatosMantenimiento(){

        System.out.println("Datos de mantenimiento: ");
        System.out.println("Hsitorial: " + historial);
        System.out.println("Mantenimientos: " + mantenimientos);

    }
    public Mantenimiento(){}

    public String getHistorial(){
        return historial;
    }
    public String getMantenimientos(){
        return mantenimientos;
    }

    public void setHistorial(String historial){
        this.historial = historial;
    }
    public void setMantenimientos(String mantenimientos){
        this.mantenimientos = mantenimientos;
    }

}

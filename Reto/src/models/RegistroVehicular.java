package models;

public class RegistroVehicular {

    private String matricula;
    private String propietario;
    private String fecha;

    public RegistroVehicular(String matricula, String propietario, String fecha){
        this.matricula = matricula;
        this.propietario = propietario;
        this.fecha = fecha;
    }
    public RegistroVehicular(){}

    public String getMatricula(){
        return matricula;
    }
    public String getPropietario(){
        return propietario;
    }
    public String getFecha(){
        return fecha;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public void mostrarDatosRegistro(){
        System.out.println("Datos del motor: ");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Propietario: " + propietario);
        System.out.println("Fecha: " + fecha);
    }
    


}

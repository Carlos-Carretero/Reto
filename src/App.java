import models.Chasis;
import models.Mantenimiento;
import models.Motor;
import models.Neumatico;
import models.RegistroVehicular;
import models.Sensor;
import models.SistemaElectrico;
import models.SistemaFrenos;
import models.Transmision;
import models.Vehiculo;

public class App {
    public static void main(String[] args) throws Exception {
        

        Vehiculo miVehiculo = new Vehiculo(10101010, "Toyota", "carolla", 2022);

        miVehiculo.displayInfo();

        System.out.println("-----------");

        Motor miMotor = new Motor("Gasolina", 4100, 100 );

        miMotor.mostrarDatos();

        System.out.println("-----------");

        Transmision miTransmision = new Transmision("manual", "corta", "FWD");

        miTransmision.mostrarDatosTransmision();

        System.out.println("-----------");

        Chasis miChasis = new Chasis("bastidor", "3300 mm x 5870 mm", 6000);

        miChasis.mostrarDatosChasis();

        System.out.println("-----------");

        Neumatico miNeumatico = new Neumatico("A/T", "155mm (5,0 pulgadas)", "30-36 psi");

        miNeumatico.mostrarDatosNeumatico();

        System.out.println("-----------");

        SistemaElectrico miSistemaElectrico = new SistemaElectrico("plomo", "DRL", "Flujo de aire");

        miSistemaElectrico.mostrarDatosSistema();

        System.out.println("-----------");

        SistemaFrenos miSistemaFrenos = new SistemaFrenos("disco", "sólidos", "4 canales", "Activo");

        miSistemaFrenos.mostrarDatosSistemaFrenos();

        System.out.println("-----------");

        RegistroVehicular miRegistroVehicular = new RegistroVehicular("10293121", "Carlos", "2020-01-01");

        miRegistroVehicular.mostrarDatosRegistro();

        System.out.println("-----------");
        
        Mantenimiento miMantenimiento = new Mantenimiento("2020-01-01 / 2022-02-04", "2");

        miMantenimiento.mostrarDatosMantenimiento();

        System.out.println("-----------");

        Sensor miSensor = new Sensor("80km/h", "30 Grados C", "25 PSI");

        miSensor.mostrarDatosSensor();






    }
}

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
        


        Vehiculo miVehiculo = new Vehiculo(01, "Toyota", "carolla", 2022);
        Vehiculo myVehiculo = new Vehiculo();
        Vehiculo meinFahrzeug = new  Vehiculo();
        Vehiculo meuVeiculo = new Vehiculo();

        myVehiculo.setIdentificador(02);
        myVehiculo.setMarca("Mercedes");
        myVehiculo.setModelo("verde");
        myVehiculo.setAño(2020);

        meinFahrzeug.setIdentificador(03);
        meinFahrzeug.setMarca("Toyota");
        meinFahrzeug.setModelo("Carolla");
        meinFahrzeug.setAño(2017);

        meuVeiculo.setIdentificador(04);
        meuVeiculo.setMarca("limoncito");
        meuVeiculo.setModelo("verde");
        meuVeiculo.setAño(2002);

        System.out.println("-----🙂 Vehiculo 2 🙂");
        System.out.println("Identificador" + myVehiculo.getIdentificador());
        System.out.println("Marca" + myVehiculo.getMarca());
        System.out.println("Modelo: " + myVehiculo.getModelo());
        System.out.println("Año: " + myVehiculo.getAño());
        System.out.println("-----🙂 Vehiculo 2 🙂");

        System.out.println("-----🙂 Vehiculo 3 🙂");
        System.out.println("Identificador" + meinFahrzeug.getIdentificador());
        System.out.println("Marca" + meinFahrzeug.getMarca());
        System.out.println("Modelo: " + meinFahrzeug.getModelo());
        System.out.println("Año: " + meinFahrzeug.getAño());
        System.out.println("-----🙂 Vehiculo 3 🙂");

        System.out.println("-----🙂 Vehiculo 4 🙂");
        System.out.println("Identificador" + meuVeiculo.getIdentificador());
        System.out.println("Marca" + meuVeiculo.getMarca());
        System.out.println("Modelo: " + meuVeiculo.getModelo());
        System.out.println("Año: " + meuVeiculo.getAño());
        System.out.println("-----🙂 Vehiculo 4 🙂");

        miVehiculo.displayInfo();
        System.out.println("-----------");




        Motor miMotor = new Motor("Gasolina", 4100, 100 );
        Motor myMotor = new Motor();
        Motor meuMotor = new Motor();
        Motor meinMotor = new Motor();

        myMotor.setCilindrada(4100);
        myMotor.setPotencia(2000);
        myMotor.setTipo("Gasolina");

        meuMotor.setCilindrada(4200);
        meuMotor.setPotencia(2500);
        meuMotor.setTipo("Gasolina");

        meinMotor.setCilindrada(4500);
        meinMotor.setPotencia(2800);
        meinMotor.setTipo("Eléctrico");
        
        System.out.println("-----🙂 Motor 2 🙂");
        System.out.println("Tipo: " + myMotor.getTipo());
        System.out.println("Potencia: " + myMotor.getPotencia());
        System.out.println("Dimensiones: " + myMotor.getCilindrada());
        System.out.println("-----🙂 Motor 2 🙂");

        System.out.println("-----🙂 Motor 3 🙂");
        System.out.println("Tipo: " + meuMotor.getTipo());
        System.out.println("Potencia: " + meuMotor.getPotencia());
        System.out.println("Dimensiones: " + meuMotor.getCilindrada());
        System.out.println("-----🙂 Motor 3 🙂");

        System.out.println("-----🙂 Motor 4 🙂");
        System.out.println("Tipo: " + meinMotor.getTipo());
        System.out.println("Potencia: " + meinMotor.getPotencia());
        System.out.println("Dimensiones: " + meinMotor.getCilindrada());
        System.out.println("-----🙂 Motor 4 🙂");

        miMotor.mostrarDatos();
        System.out.println("-----------");



        
        Transmision miTransmision = new Transmision("manual", "corta", "FWD");
        Transmision myTransmision = new Transmision();
        Transmision meuTransmision = new Transmision();
        Transmision meinTransmision = new Transmision();

        myTransmision.setTipo("Manual");
        myTransmision.setMarchas("Media");
        myTransmision.setTraccion("FWD");

        meuTransmision.setTipo("Manual");
        meuTransmision.setMarchas("Larga");
        meuTransmision.setTraccion("FWD");

        meinTransmision.setTipo("Eléctrico");
        meinTransmision.setMarchas("Media");
        meinTransmision.setTraccion("FWD");

        miTransmision.mostrarDatosTransmision();
        System.out.println("-----🙂 Transmision 2 🙂");
        System.out.println("Tipo: " + myTransmision.getTipo());
        System.out.println("Marchas" + myTransmision.getMarchas());
        System.out.println("traccion: " + myTransmision.getTraccion());
        System.out.println("-----🙂 Transmision 2 🙂");

        System.out.println("-----🙂 Transmision 3 🙂");
        System.out.println("Tipo: " + meuTransmision.getTipo());
        System.out.println("Marchas" + meuTransmision.getMarchas());
        System.out.println("traccion: " + meuTransmision.getTraccion());
        System.out.println("-----🙂 Transmision 3 🙂");

        System.out.println("-----🙂 Transmision 4 🙂");
        System.out.println("Tipo: " + meinTransmision.getTipo());
        System.out.println("Marchas" + meinTransmision.getMarchas());
        System.out.println("traccion: " + meinTransmision.getTraccion());
        System.out.println("-----🙂 Transmision 4 🙂");

        System.out.println("-----------");





        Chasis miChasis = new Chasis("bastidor", "3300 mm x 5870 mm", 6000);
        Chasis myChasis = new Chasis();
        Chasis meuChasis = new Chasis();
        Chasis meinChasis = new Chasis();

        myChasis.setTipo("de escalera");
        myChasis.setDimensiones("3500 mm x 4000 mm");
        myChasis.setPeso(7000);

        meuChasis.setTipo("De escalera");
        meuChasis.setDimensiones("3400 mm x 4500 mm");
        meuChasis.setPeso(7500);

        meinChasis.setTipo("De escalera");
        meinChasis.setDimensiones("3700 mm x 4700 mm");
        meinChasis.setPeso(8000);


        System.out.println("-----🙂 Chasis 2 🙂----");
        System.out.println("Dimensiones: " + myChasis.getDimensiones());
        System.out.println("Tipo: " + myChasis.getTipo());
        System.out.println("Peso: " + myChasis.getPeso());
        System.out.println("-----🙂 Chasis 2 🙂----");

        System.out.println("-----🙂 Chasis 3 🙂----");
        System.out.println("Dimensiones: " + meuChasis.getDimensiones());
        System.out.println("Tipo: " + meuChasis.getTipo());
        System.out.println("Peso: " + meuChasis.getPeso());
        System.out.println("-----🙂 Chasis 3 🙂----");

        System.out.println("-----🙂 Chasis 4 🙂----");
        System.out.println("Dimensiones: " + meinChasis.getDimensiones());
        System.out.println("Tipo: " + meinChasis.getTipo());
        System.out.println("Peso: " + meinChasis.getPeso());
        System.out.println("-----🙂 Chasis 4 🙂----");

        miChasis.mostrarDatosChasis();
        System.out.println("-----------");





        Neumatico miNeumatico = new Neumatico("A/T", "155mm (5,0 pulgadas)", "30-36 psi");
        Neumatico myNeumatico = new Neumatico();
        Neumatico meuNeumatico = new Neumatico();
        Neumatico meinNeumatico = new Neumatico();

        myNeumatico.setLlanta("A/T");
        myNeumatico.setPresion("30-50 psi");
        myNeumatico.setTamaño("170 mm");

        meuNeumatico.setLlanta("A/T");
        meuNeumatico.setPresion("30-70 psi");
        meuNeumatico.setTamaño("190 mm");

        meinNeumatico.setLlanta("A/T");
        meinNeumatico.setPresion("40-80 psi");
        meuNeumatico.setTamaño("200 mm");
        
        System.out.println("-----🙂 Neumatico 2 🙂----");
        System.out.println("Llanta: "+ myNeumatico.getLlanta());
        System.out.println("Presion: "+ myNeumatico.GetPresion());
        System.out.println("presion: "+ myNeumatico.GetPresion());
        System.out.println("-----🙂 Neumatico 2 🙂----");

        System.out.println("-----🙂 Neumatico 3 🙂----");
        System.out.println("Llanta: "+ meuNeumatico.getLlanta());
        System.out.println("Presion: "+ meuNeumatico.GetPresion());
        System.out.println("presion: "+ meuNeumatico.GetPresion());
        System.out.println("-----🙂 Neumatico 3 🙂----");

        System.out.println("-----🙂 Neumatico 4 🙂----");
        System.out.println("Llanta: "+ meinNeumatico.getLlanta());
        System.out.println("Presion: "+ meinNeumatico.GetPresion());
        System.out.println("presion: "+ meinNeumatico.GetPresion());
        System.out.println("-----🙂 Neumatico 4 🙂----");
        miNeumatico.mostrarDatosNeumatico();

        System.out.println("-----------");



        
        SistemaElectrico miSistemaElectrico = new SistemaElectrico("plomo", "DRL", "Flujo de aire");
        SistemaElectrico mySistemaElectrico = new SistemaElectrico();
        SistemaElectrico meuSistemaElectrico = new SistemaElectrico();
        SistemaElectrico meinSistemaElectrico = new SistemaElectrico();

        mySistemaElectrico.setBateria("plomo");
        mySistemaElectrico.setLuces("Cruce");
        mySistemaElectrico.setSensores("Flujo de aire");

        meuSistemaElectrico.setBateria("Plomo");
        meuSistemaElectrico.setLuces("Cruce");
        meuSistemaElectrico.setSensores("Flujo de aire");

        meinSistemaElectrico.setBateria("Plomo");
        meinSistemaElectrico.setLuces("Cruce");
        meinSistemaElectrico.setSensores("Flujo de aire");

        System.out.println("-----🙂 Sistema eléctrico 2 🙂----");
        System.out.println("Batería: " + mySistemaElectrico.getBateria());
        System.out.println("Luces: " + mySistemaElectrico.getLuces());
        System.out.println("Sensores: " + mySistemaElectrico.getSensores());
        System.out.println("-----🙂 Sistema eléctrico 2 🙂----");

        System.out.println("-----🙂 Sistema eléctrico 3 🙂----");
        System.out.println("Batería: " + meuSistemaElectrico.getBateria());
        System.out.println("Luces: " + meuSistemaElectrico.getLuces());
        System.out.println("Sensores: " + meuSistemaElectrico.getSensores());
        System.out.println("-----🙂 Sistema eléctrico 3 🙂----");

        System.out.println("-----🙂 Sistema eléctrico 4 🙂----");
        System.out.println("Batería: " + meinSistemaElectrico.getBateria());
        System.out.println("Luces: " + meinSistemaElectrico.getLuces());
        System.out.println("Sensores: " + meinSistemaElectrico.getSensores());
        System.out.println("-----🙂 Sistema eléctrico 4 🙂----");

        miSistemaElectrico.mostrarDatosSistema();
        System.out.println("-----------");



        
        SistemaFrenos miSistemaFrenos = new SistemaFrenos("disco", "sólidos", "4 canales", "Activo");
        SistemaFrenos mySistemaFrenos = new SistemaFrenos();
        SistemaFrenos meuSistemaFrenos = new SistemaFrenos();
        SistemaFrenos meinSistemaFrenos = new SistemaFrenos();

        mySistemaFrenos.setTipo("Disco");
        mySistemaFrenos.setDiscos("Sólidos");
        mySistemaFrenos.setAbs("5 canales");
        mySistemaFrenos.setEstado("Activo");

        meuSistemaFrenos.setTipo("Disco");
        meuSistemaFrenos.setDiscos("sólidos");
        meuSistemaFrenos.setAbs("8 Canales");
        meuSistemaFrenos.setEstado("Activo");

        meinSistemaFrenos.setTipo("Disco");
        meinSistemaFrenos.setDiscos("Sólidos");
        meinSistemaFrenos.setAbs("10 Canales");
        meinSistemaFrenos.setEstado("Activo");

        System.out.println("-----🙂 Sistema frenos 2 🙂----");
        System.out.println("Tipo: " + mySistemaFrenos.getTipo());
        System.out.println("Discos: " + mySistemaFrenos.getDiscos());
        System.out.println("Abs: " + mySistemaFrenos.getAbs());
        System.out.println("Estado: " + mySistemaFrenos.getEstado());
        System.out.println("-----🙂 Sistema frenos 2 🙂----");

        System.out.println("-----🙂 Sistema frenos 3 🙂----");
        System.out.println("Tipo: " + meuSistemaFrenos.getTipo());
        System.out.println("Discos: " + meuSistemaFrenos.getDiscos());
        System.out.println("Abs: " + meuSistemaFrenos.getAbs());
        System.out.println("Estado: " + meuSistemaFrenos.getEstado());
        System.out.println("-----🙂 Sistema frenos 3 🙂----");

        System.out.println("-----🙂 Sistema frenos 4 🙂----");
        System.out.println("Tipo: " + meinSistemaFrenos.getTipo());
        System.out.println("Discos: " + meinSistemaFrenos.getDiscos());
        System.out.println("Abs: " + meinSistemaFrenos.getAbs());
        System.out.println("Estado: " + meinSistemaFrenos.getEstado());
        System.out.println("-----🙂 Sistema frenos 4 🙂----");

        miSistemaFrenos.mostrarDatosSistemaFrenos();
        System.out.println("-----------");





        RegistroVehicular miRegistroVehicular = new RegistroVehicular("10293121", "Carlos", "2020-01-01");
        RegistroVehicular myRegistroVehicular = new RegistroVehicular();
        RegistroVehicular meuRegistroVehicular = new RegistroVehicular();
        RegistroVehicular meinRegistroVehicular = new RegistroVehicular();

        myRegistroVehicular.setFecha("2021-02-25");
        myRegistroVehicular.setPropietario("Joshua");
        myRegistroVehicular.setMatricula("g4y-001");

        meuRegistroVehicular.setFecha("2020-04-21");
        meuRegistroVehicular.setPropietario("Marcela");
        meuRegistroVehicular.setMatricula("L3S-002");

        meinRegistroVehicular.setFecha("2024-05-05");
        meinRegistroVehicular.setPropietario("Majo");
        meinRegistroVehicular.setMatricula("H3T-003");

        System.out.println("-----🙂 Registro vehicular 2 🙂----");
        System.out.println("Matricula: " + myRegistroVehicular.getMatricula());
        System.out.println("Propietario: " + myRegistroVehicular.getPropietario());
        System.out.println("Fecha: " + myRegistroVehicular.getFecha());
        System.out.println("-----🙂 Registro vehicular 2 🙂----");

        System.out.println("-----🙂 Registro vehicular 3 🙂----");
        System.out.println("Matricula: " + meuRegistroVehicular.getMatricula());
        System.out.println("Propietario: " + meuRegistroVehicular.getPropietario());
        System.out.println("Fecha: " + meuRegistroVehicular.getFecha());
        System.out.println("-----🙂 Registro vehicular 3 🙂----");

        System.out.println("-----🙂 Registro vehicular 4 🙂----");
        System.out.println("Matricula: " + meinRegistroVehicular.getMatricula());
        System.out.println("Propietario: " + meinRegistroVehicular.getPropietario());
        System.out.println("Fecha: " + meinRegistroVehicular.getFecha());
        System.out.println("-----🙂 Registro vehicular 4 🙂----");

        miRegistroVehicular.mostrarDatosRegistro();
        System.out.println("-----------");




        
        Mantenimiento miMantenimiento = new Mantenimiento("2020-01-01 / 2022-02-04", "2");
        Mantenimiento myMantenimiento = new Mantenimiento();
        Mantenimiento meuMantenimiento = new Mantenimiento();
        Mantenimiento meinMantenimiento = new Mantenimiento();

        myMantenimiento.setHistorial("10-02-2015");
        myMantenimiento.setMantenimientos("1");

        meuMantenimiento.setHistorial("10-12-2022");
        meuMantenimiento.setMantenimientos("1");

        meinMantenimiento.setHistorial("10-01-2021");
        meinMantenimiento.setMantenimientos("1");

        System.out.println("-----🙂 Mantenimientos 2 🙂----");
        System.out.println("Historial: " + myMantenimiento.getHistorial());
        System.out.println("Mantenimientos:" + myMantenimiento.getMantenimientos());
        System.out.println("-----🙂 Mantenimientos 2 🙂----");

        System.out.println("-----🙂 Mantenimientos 3 🙂----");
        System.out.println("Historial: " + meuMantenimiento.getHistorial());
        System.out.println("Mantenimientos:" + meuMantenimiento.getMantenimientos());
        System.out.println("-----🙂 Mantenimientos 3 🙂----");

        System.out.println("-----🙂 Mantenimientos 4 🙂----");
        System.out.println("Historial: " + meinMantenimiento.getHistorial());
        System.out.println("Mantenimientos:" + meinMantenimiento.getMantenimientos());
        System.out.println("-----🙂 Mantenimientos 4 🙂----");

        miMantenimiento.mostrarDatosMantenimiento();
        System.out.println("-----------");





        Sensor miSensor = new Sensor("80km/h", "30 Grados C", "25 PSI");
        Sensor mySensor = new Sensor();
        Sensor meuSensor = new Sensor();
        Sensor  meinSensor = new Sensor();

        mySensor.setPresion("28 PSI");
        mySensor.setTemperatura("35 Grados C");
        mySensor.setVelocidad("70 km/h");

        meuSensor.setPresion("25 PSI");
        meuSensor.setTemperatura("40 Grados C");
        meuSensor.setVelocidad("100 km/h");

        meinSensor.setPresion("50 PSI");
        meinSensor.setTemperatura("50 Grados C");
        meinSensor.setVelocidad("150 km/h");

        System.out.println("-----🙂 Sensor 2 🙂----");
        System.out.println("Velocidad: " + mySensor.getVelocidad());
        System.out.println("Temperatura: " + mySensor.getTemperatura());
        System.out.println("Presion: " + mySensor.getPresion());
        System.out.println("-----🙂 Sensor 2 🙂----");

        System.out.println("-----🙂 Sensor 3 🙂----");
        System.out.println("Velocidad: " + meuSensor.getVelocidad());
        System.out.println("Temperatura: " + meuSensor.getTemperatura());
        System.out.println("Presion: " + meuSensor.getPresion());
        System.out.println("-----🙂 Sensor 3 🙂----");

        System.out.println("-----🙂 Sensor 4 🙂----");
        System.out.println("Velocidad: " + meinSensor.getVelocidad());
        System.out.println("Temperatura: " + meinSensor.getTemperatura());
        System.out.println("Presion: " + meinSensor.getPresion());
        System.out.println("-----🙂 Sensor 4 🙂----");

        miSensor.mostrarDatosSensor();






    }
}

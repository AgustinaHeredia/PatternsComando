package Parking;

public class AcelerarComando implements Command {

	 private Vehiculo vehiculo;
	 
	 public AcelerarComando(Vehiculo vehiculo) {
	        this.vehiculo = vehiculo;
	    }

	    @Override
	    public void ejecutar() {
	        vehiculo.acelerar();
	    }
}

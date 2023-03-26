package Parking;

public class FrenarComando implements Command {

	 private Vehiculo vehiculo;
	 
	 public FrenarComando(Vehiculo vehiculo) {
	        this.vehiculo = vehiculo;
	    }

	    @Override
	    public void ejecutar() {
	        vehiculo.frenar();
	    }

}

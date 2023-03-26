package Parking;

public class Bicicleta extends Vehiculo{

	 @Override
	    public void arrancar() {
	        System.out.println("La bicicleta está arrancando...");
	    }

	    @Override
	    public void acelerar() {
	        System.out.println("La bicicleta está acelerando...");
	    }

	    @Override
	    public void frenar() {
	        System.out.println("La bicicleta está frenando...");
	    }
}

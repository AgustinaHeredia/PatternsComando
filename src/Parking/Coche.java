package Parking;

public class Coche extends Vehiculo {

	 @Override
	    public void arrancar() {
	        System.out.println("El coche está arrancando...");
	    }

	    @Override
	    public void acelerar() {
	        System.out.println("El coche está acelerando...");
	    }

	    @Override
	    public void frenar() {
	        System.out.println("El coche está frenando...");
	    }
}

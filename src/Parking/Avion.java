package Parking;

public class Avion extends Vehiculo{

	@Override
    public void arrancar() {
        System.out.println("El avión está arrancando...");
    }

    @Override
    public void acelerar() {
        System.out.println("El avión está acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("El avión está frenando...");
    }
}

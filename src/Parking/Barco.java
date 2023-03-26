package Parking;

public class Barco extends Vehiculo {

	@Override
    public void arrancar() {
        System.out.println("El barco está arrancando...");
    }

    @Override
    public void acelerar() {
        System.out.println("El barco está acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("El barco está frenando...");
    }
}

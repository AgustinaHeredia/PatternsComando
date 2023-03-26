package Parking;

public class ArrancarComando implements Command {
    private Vehiculo vehiculo;

    public ArrancarComando(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void ejecutar() {
        vehiculo.arrancar();
    }

}

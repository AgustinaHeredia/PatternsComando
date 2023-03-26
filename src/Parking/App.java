package Parking;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        Vehiculo vehiculo = null;
        String tipoVehiculo = "";
        Command comando = null;
        String tipoComando = "";

        while (vehiculo == null) {
            System.out.println("Seleccione el tipo de vehículo que desea utilizar (coche, bicicleta, avión o barco):");
            tipoVehiculo = input.nextLine().toLowerCase();
            switch (tipoVehiculo) {
                case "coche":
                    vehiculo = new Coche();
                    break;
                case "bicicleta":
                    vehiculo = new Bicicleta();
                    break;
                case "avión":
                    vehiculo = new Avion();
                    break;
                case "barco":
                    vehiculo = new Barco();
                    break;
                default:
                    System.out.println("Tipo de vehículo no válido.");
                    break;
            }
        }

        while (comando == null) {
            System.out.println("Seleccione el tipo de comando que desea ejecutar (arrancar, acelerar o frenar):");
            tipoComando = input.nextLine().toLowerCase();
            switch (tipoComando) {
                case "arrancar":
                    comando = new ArrancarComando(vehiculo);
                    break;
                case "acelerar":
                    comando = new AcelerarComando(vehiculo);
                    break;
                case "frenar":
                    comando = new FrenarComando(vehiculo);
                    break;
                default:
                    System.out.println("Tipo de comando no válido.");
                    break;
            }
        }

        comando.ejecutar();
    }

}



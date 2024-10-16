// Juan Sebastian hernandez Silva ///

//juan.hernandez-si@uniminuto.edu.co//
public class Main {
    public static void main(String[] args) {

        Vehiculo coche = new coche("Toyota");

        coche.mostrarMarca();
        coche.conducir();     //
        coche.frenar();       //


        Vehiculo moto = new Motocicleta("Harley-Davidson");

        moto.mostrarMarca(); //
        moto.conducir();     //
        moto.frenar();
    }
}

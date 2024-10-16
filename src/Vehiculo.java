// Clase abstracta
abstract class Vehiculo {

    String marca;
    String modelo;


    Vehiculo(String marca) {
        this.marca = marca;
    }





    abstract void conducir();


    void frenar() {
        System.out.println("El vehículo está frenando.");
    }


    void mostrarMarca() {
        System.out.println("Marca del vehículo: " + this.marca);
    }
}





class Motocicleta extends Vehiculo {

    Motocicleta(String marca) {
        super(marca);
    }

    @Override
    void conducir() {
        System.out.println("Conduciendo la motocicleta de la marca " + marca);

    }}
public class Carro  implements Vehiculos{
    @Override
    public void arrancar() {
        System.out.println("Arrancando...");
    }

    @Override
    public void frenar() {
        System.out.println("Deteniendo..");
    }
}

 class coche extends Vehiculo {
     coche(String marca) {
         super(marca);
     }


     @Override
     void conducir() {
         System.out.println("Conduciendo el coche de la marca " + marca);
     }
 }


package taller;

public class Zoologico {

    public void ejecutarPruebasGenericidad() {
      Jaguar Pedro=new Jaguar(10,10,"duro", false);
      Jaula<Animal> jaulaNueva=new Jaula<Animal>();
      jaulaNueva.asignarAnimal(Pedro);
      
      //TODO: Cree las jaulas y siga los pasos de la guía      
    }
  
    public static String compararAnimales(Jaula<Animal> anim1, Jaula<Animal> anim2) {

      Jaula<Animal> jaulaNueva=new Jaula<Animal>();
        //TODO: Modifique el método para hacer las pruebas
        Animal mayor = null;

        return "El animal más viejo entre " + null + "y " + null + "es " + mayor;
    }

    public void imprimirResultado() {

        ejecutarPruebasGenericidad();
        
        //TODO: Modifique el resultado para que muestre el String resultante del metodo compararAnimales
        System.out.println("Se van a comparar animales");
        String compararAnimales = "";
        System.out.println(compararAnimales);

    }

}

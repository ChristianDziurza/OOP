package petshop;

public class SomAnimal {
    public static void main(String[] args){
        Animal animal, dog, cat, preg;

        animal = new Animal();
        animal.emitirSom();

        dog = new Cachorro();
        dog.emitirSom();

        cat = new Gato();
        cat.emitirSom();

        preg = new Preguiça();
        preg.emitirSom();
    }
}

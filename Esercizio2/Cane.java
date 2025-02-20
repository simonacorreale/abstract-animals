package Esercizio1.src;
public class Cane implements  Animale {

    @Override
    public void verso() {
        System.out.println("Bau Bau!");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia carne");
    }
    
}

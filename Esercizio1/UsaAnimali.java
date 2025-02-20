package Esercizio1;
public class UsaAnimali {
    public static void main(String[] args) {

        Animale Cane = new Cane();
        Animale Delfino = new Delfino();
        Animale Passerotto = new Passerotto();

        System.out.println("Animale Cane\n");
        Cane.dormi();
        Cane.verso();
        Cane.mangia();
        System.out.println("---\n");

        System.out.println("Animale Delfino\n");
        Delfino.dormi();
        Delfino.verso();
        Delfino.mangia();
        System.out.println("---\n");

        System.out.println("Animale Passerotto\n");
        Passerotto.dormi();
        Passerotto.verso();
        Passerotto.mangia();
        System.out.println("---\n");
    
    }
}

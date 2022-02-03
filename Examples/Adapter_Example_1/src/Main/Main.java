package Main;

interface Bird {
    public void fly();

    public void talk();
}

class Sparrow implements Bird {

    public void fly() {
        System.out.println("Prr Prrr Prrrr");
    }

    public void talk() {
        System.out.println("Chirp chrip");
    }
}

interface Toy {
    public void squeak();
}

class ToyDuck implements Toy {
    public void squeak() {
        System.out.println("Squeakyyy!");
    }
}

class adapter implements Toy {
    // You need to implement the interface your
    // client expects to use.
    Bird bird;

    public adapter(Bird bird) {
        // we need reference to the object we
        // are adapting
        this.bird = bird;
    }

    @Override
    public void squeak() {
        // translate the methods appropriately
        bird.talk();
    }
}

public class Main {

    public static void main(String[] args) {
        Sparrow sp = new Sparrow();
        System.out.println("Sparrow ....");
        sp.fly();
        sp.talk();
        System.out.println("Toy ....");
        Toy t = new ToyDuck();
        t.squeak();
        System.out.println("Adapter ....");
        Toy ada = new adapter(sp);
        ada.squeak();
    }
}

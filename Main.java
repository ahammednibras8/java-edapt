public class Main {
    public static void main(String[] args) {
        Animal Donkey = new Animal();

        Donkey.sound();

        Donkey = new Donkey();
        
        Donkey.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Donkey extends Animal {
    void sound() {
        System.out.println("Donkey makes sounds");
    }
}
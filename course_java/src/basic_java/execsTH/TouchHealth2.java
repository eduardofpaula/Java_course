package basic_java.execsTH;

public class TouchHealth2 {
    public static void main(String[] args) {
        Mamifero m = new Gato(); // objeto gato se referenciando por uma variavel m do tipo Mamifero
        Animal a = m; // atribui objeto m(`Gato`) se referenciando por uma variavel a do tipo Animal(permitido pq
        // Animal é um mamifero
        System.out.println(a.getTipo());
        Golfinho g = (Golfinho) a; // erro classCastExceptiopn
    }
}

class Animal {
    public String getTipo() {
        return "Animal";
    }
}

class Mamifero extends Animal {
    @Override
    public String getTipo() {
        return "Mamifero";
    }
}

class Gato extends Mamifero {
    @Override
    public String getTipo() {
        return "Gato";
    }
}

class Golfinho extends Mamifero {
    @Override
    public String getTipo() {
        return "Golfinho";
    }
}


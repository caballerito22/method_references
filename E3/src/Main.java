record Impresora(String color) {
    void imprimir(String a) {
        System.out.println(color + a);
    }
}

interface Accio {
    void ferAccio(String a);
}

class MyStringList {
    String[] elements;

    MyStringList(String ...elements) {
        this.elements = elements;
    }

    void perCada(Accio accio) {
        for (String element : elements) accio.ferAccio(element);
    }
}



public class Main {
    public static void main(String[] args) {

        MyStringList myStringList = new MyStringList("Hola", "Adeu", "Que tal");

        Impresora impresoraBlau = new Impresora("\033[34m");
        Impresora impresoraGroc = new Impresora("\033[33m");

        // imprimeix la llista en blau
        // imprimeix la llista en groc
    }
}
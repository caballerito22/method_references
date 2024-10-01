record Estudiant (String nom, Integer edat, Boolean matriculat) {
    // implementa els mètodes
}

interface Comparador<T> {
    boolean comparar(T a, T b);
}

class MyFixedSizeArrayList<T> {
    T[] elements;

    MyFixedSizeArrayList(T ...elements) {
        this.elements = elements;
    }

    void ordenar(Comparador<T> comparador) {
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = 0; j < elements.length - 1 - i; j++) {
                if (comparador.comparar(elements[j+1], elements[j])) {
                    T temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
    }

    void mostrar() {
        for (T element : elements) System.out.println(element);
    }
}

public class Main {
    public static void main(String[] args) {

        var estudiants = new MyFixedSizeArrayList<>(
                new Estudiant("Annia", 43, true),
                new Estudiant("Lluis", 65, false),
                new Estudiant("Manel", 21, true),
                new Estudiant("Tania", 30, false),
                new Estudiant("Ramon", 18, true),
                new Estudiant("Carla", 80, false),
                new Estudiant("Joana", 73, false),
                new Estudiant("Patri", 65, true),
                new Estudiant("Vanne", 10, false)
        );

        System.out.println("\nORDENATS PER NOM");
        // ordena
        // mostra

        System.out.println("\nORDENATS PER EDAT");
        // ordena
        // mostra

        System.out.println("\nORDENATS PER MATRICULAT");
        // ordena
        // mostra
    }
}
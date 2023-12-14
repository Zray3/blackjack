package es.ieslavereda;

public class Main {
    public static void main(String[] args) {
        for (Palo palo:Palo.values()) {
            for (Numero numero:Numero.values())
            System.out.println(numero+""+palo);
        }

    }
}

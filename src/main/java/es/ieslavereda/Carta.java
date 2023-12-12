package es.ieslavereda;

public class Carta {
    private Numero numero;
    private Palo palo;

    public Carta(Numero numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Numero getNumero() {
        return numero;
    }

    public Palo getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return numero.toString()+""+palo.toString();
    }
}

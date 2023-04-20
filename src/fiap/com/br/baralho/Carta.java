package fiap.com.br.baralho;

public class Carta {
    private int valor;
    private Naipe naipe;

    public Carta (int valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public int getValor() {
        return valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    @Override
    public String toString() {
        return valor + " " + naipe;
    }
}



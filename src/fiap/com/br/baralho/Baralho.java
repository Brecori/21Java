package fiap.com.br.baralho;

import java.util.Random;

public class Baralho {

    private Carta[] monte;
    private int topo;

    public Baralho() {
        this.monte = new Carta[52];
        this.topo = 51;

        int i = 0;

        for (int v = 1; v <=13; v++) {
            this.monte[i++] = new Carta(v, Naipe.OUROS);
            this.monte[i++] = new Carta(v, Naipe.ESPADAS);
            this.monte[i++] = new Carta(v, Naipe.COPAS);
            this.monte[i++] = new Carta(v, Naipe.PAUS);
        }

    }

    public Carta comprarCarta() {
        return monte[topo--];
    }

    public void embaralha() {
        Random r = new Random();

        for (int k = 0; k < 275; k++) {
            int i = r.nextInt(0, 52);
            int j = r.nextInt(0, 52);
            Carta aux = this.monte[i];
            monte[i] = monte[j];
            monte[j] = aux;
        }
    }

}

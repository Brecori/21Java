package fiap.com.br.baralho;

import javax.swing.*;

public class JogadorCPU {
    private Carta[] mao;
    private int topo = 0;
    private int pontos;

    public JogadorCPU() {
        this.pontos = 0;
        this.mao = new Carta[12];
    }

    public void addCarta(Carta c) {
        mao[topo] = c;
        topo++;
        if (c.getValor() >= 10) {
            pontos = pontos+10;
        }
        else {
            pontos = pontos + c.getValor();
        }
    }

    public boolean querCarta() {
        if (this.pontos < 17) {
            return true;
        }
        else {
            return false;
        }
    }


    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < topo; i++) {
            sb.append(mao[i].toString());
            sb.append(" ");
        }
        sb.append("\n");
        sb.append("Pontos: " + pontos);
        return sb.toString();
    }
}

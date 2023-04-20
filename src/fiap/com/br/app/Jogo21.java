package fiap.com.br.app;

import fiap.com.br.baralho.Baralho;
import fiap.com.br.baralho.JogadorCPU;
import fiap.com.br.baralho.JogadorHumano;

public class Jogo21 {
    public static void main(String[] args) {
        Baralho b = new Baralho();
        b.embaralha();

        JogadorHumano human = new JogadorHumano();
        human.addCarta(b.comprarCarta());
        human.addCarta(b.comprarCarta());

        JogadorCPU cpu = new JogadorCPU();
        cpu.addCarta(b.comprarCarta());
        cpu.addCarta(b.comprarCarta());

        while (human.querCarta()) {
            human.addCarta(b.comprarCarta());
        }

        while (cpu.querCarta()) {
            cpu.addCarta(b.comprarCarta());
        }

        System.out.println(human.toString());
        System.out.println(cpu.toString());
    }
}

package fiap.com.br.app;

import fiap.com.br.baralho.Baralho;
import fiap.com.br.baralho.Carta;
import fiap.com.br.baralho.Naipe;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class Teste {
    public static void main(String[] args) {
        Carta zap = new Carta(2, Naipe.PAUS);

        Carta sete = new Carta(7, Naipe.OUROS);

        FontUIResource fr = new FontUIResource(new Font("Console 0", Font.PLAIN, 100));
        UIManager.put("OptionPane.messageFont", fr);

//        JOptionPane.showMessageDialog(null, sete);
//        JOptionPane.showMessageDialog(null,zap);
//        JOptionPane.showMessageDialog(null,"\uD83C\uDCDE");

        Baralho b = new Baralho();
//        for (int i = 0; i< 52; i++) {
//            Carta c = b.comprarCarta();
//            System.out.println(c);
//        }

        b.embaralha();
        for (int i = 0; i< 52; i++) {
            Carta c = b.comprarCarta();
            System.out.println(c);
        }



    }
}

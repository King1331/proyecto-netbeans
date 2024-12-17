/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eamen2_carreraauto_kimberly_p3;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author Ideapad 330S
 */
public class Proceso extends Thread {

    private JLabel posicion, ganador;
    private JProgressBar barra;
    private String carro;
    private String Tipoc;
    private int TiempoTrans;
    private int i;

    public Proceso(JLabel posicion, JLabel ganador, JProgressBar barra, String carro, String Tipo, int TiempoTrans, int i) {
        this.posicion = posicion;
        this.ganador = ganador;
        this.barra = barra;
        this.carro = carro;
        this.Tipoc = Tipo;
        this.TiempoTrans = TiempoTrans;
        this.i = i;
    }

 

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            barra.setValue(i);
            Tiempoo();

            Imagenes();
            ganador.setText("Ganador " + Tipoc);

        }

    }

    private void Tiempoo() {
        try {
            int Tiempo = new Random().nextInt(15);
            TiempoTrans += Tiempo;
            posicion.setText("" + TiempoTrans);
            Thread.sleep(10);
            barra.repaint();
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    private void Imagenes() {

        if (carro.equals("Pirelli")) {
            Tipoc = "PIRELLI";
            ganador.setIcon(new ImageIcon("src/Imagenes/Pirelli.jpg"));
            
        }
        if (carro.equals("Mercedez")) {
            Tipoc = "MERCEDEZ";
            ganador.setIcon(new ImageIcon("src/Imagenes/Mercedez.jpg"));

        }
        if (carro.equals("Ferrari")) {
            Tipoc = "FERRARI";
            ganador.setIcon(new ImageIcon("src/Imagenes/Ferrari.jpg"));

        }
        if (carro.equals("Toyota")) {
            Tipoc = "TOYOTA";
            ganador.setIcon(new ImageIcon("src/Imagenes/Toyota.jpg"));

        }
        if (carro.equals("Audi")) {
            Tipoc = "AUDI";
            ganador.setIcon(new ImageIcon("src/Imagenes/Audi.jpg"));

        }
        if (carro.equals("Isuzu")) {
            Tipoc = "ISUZU";
            ganador.setIcon(new ImageIcon("src/Imagenes/Isuzu.jpg"));

        }
    }

}

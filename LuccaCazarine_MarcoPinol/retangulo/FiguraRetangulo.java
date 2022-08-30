package retangulo;

import java.awt.*;

import reta.FiguraRetas;
import reta.RetaGr;

public class FiguraRetangulo {
    public static void desenharRetangulo(Graphics g, int x1, int y1, int x2, int y2, String nome, int esp, Color cor) {
        RetanguloGr r = new RetanguloGr(x1, y1, x2, y2, cor, nome, esp);
        FiguraRetas.desenharReta(g, (int) r.getP1().getX(), (int) r.getP1().getY(), (int) r.getP2().getX(),
                (int) r.getP1().getY(), nome, esp,
                cor);
        FiguraRetas.desenharReta(g, (int) r.getP1().getX(), (int) r.getP1().getY(), (int) r.getP1().getX(),
                (int) r.getP2().getY(), nome, esp,
                cor);
        FiguraRetas.desenharReta(g, (int) r.getP2().getX(), (int) r.getP1().getY(), (int) r.getP2().getX(),
                (int) r.getP2().getY(), nome, esp,
                cor);
        FiguraRetas.desenharReta(g, (int) r.getP1().getX(), (int) r.getP2().getY(), (int) r.getP2().getX(),
                (int) r.getP2().getY(), nome, esp,
                cor);
    }

    // public static void desenharRetangulo(Graphics g, int qtde, int esp){

    // for(int i=0; i < qtde; i++) {
    // int x1 = (int) (Math.random() * 801);
    // int y1 = (int) (Math.random() * 801);
    // int x2 = (int) (Math.random() * 801);
    // int y2 = (int) (Math.random() * 801);

    // // Cor (R, G e B) aleatorio
    // Color cor = new Color((int) (Math.random() * 256),
    // (int) (Math.random() * 256),
    // (int) (Math.random() * 256));
    // RetanguloGr r = new RetanguloGr(x1, y1, x2, y2, cor, "", esp);
    // r.desenharRetangulo(g);
    // }
    // }
}

package PoligonoFechado;
import java.awt.Graphics;
import java.util.List;
import Poligono.FiguraLinhaPoligonal;
import java.awt.Color;
import ponto.Ponto;
import reta.FiguraRetas;

public class FiguraPoligonoFechado extends FiguraLinhaPoligonal { 

    public static void desenharLinhaPoligonal(Graphics g, List<Ponto> pontosPoligonais, String nome, int esp,
            Color cor) {
        for (int i = 0; i < pontosPoligonais.size() - 1; i++) {
            FiguraRetas.desenharReta(g, (int) pontosPoligonais.get(i).getX(), (int) pontosPoligonais.get(i).getY(),
                    (int) pontosPoligonais.get(i + 1).getX(), (int) pontosPoligonais.get(i + 1).getY(),
                    nome, esp, cor);
        }
         FiguraRetas.desenharReta(g, (int) pontosPoligonais.get(0).getX(), (int)
         pontosPoligonais.get(0).getY(),
         (int) pontosPoligonais.get(pontosPoligonais.size() - 1).getX(),
         (int) pontosPoligonais.get(pontosPoligonais.size() - 1).getY(),
         nome, esp, cor);
        pontosPoligonais.clear();
    }
}

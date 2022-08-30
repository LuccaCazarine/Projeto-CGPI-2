package retangulo;

import ponto.PontoGr;
import java.awt.Color;
import java.awt.Graphics;

public class RetanguloGr extends Retangulo {
    Color corRetangulo = Color.BLACK; // cor da reta
    String nomeRetangulo = ""; // nome da reta
    Color corNomeRetangulo = Color.BLACK;
    int espRetangulo = 1;

    // Construtores

    public RetanguloGr(int x1, int y1, int x2, int y2, Color cor, String nome, int esp) {
        super(x1, y1, x2, y2);
        setCorRetangulo(cor);
        setNomeRetangulo(nome);
        setEspRetangulo(esp);
    }

    public RetanguloGr(int x1, int y1, int x2, int y2, Color cor) {
        super(x1, y1, x2, y2);
        setCorRetangulo(cor);
        setNomeRetangulo("");
    }

    public RetanguloGr(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
        setCorRetangulo(Color.black);
        setNomeRetangulo("");
    }

    public RetanguloGr(PontoGr p1, PontoGr p2, PontoGr p3, PontoGr p4) {
        super(p1, p2, p3, p4);
        setCorRetangulo(Color.black);
        setNomeRetangulo("");
    }

    public RetanguloGr(PontoGr p1, PontoGr p2, PontoGr p3, PontoGr p4, Color cor) {
        super(p1, p2, p3, p4);
        setCorRetangulo(cor);
        setNomeRetangulo("");
    }

    public RetanguloGr(PontoGr p1, PontoGr p2, PontoGr p3, PontoGr p4, Color cor, String str) {
        super(p1, p2, p3, p4);
        setCorRetangulo(cor);
        setNomeRetangulo(str);
    }

    // setters
    public void setCorRetangulo(Color cor) {
        this.corRetangulo = cor;
    }

    public void setNomeRetangulo(String str) {
        this.nomeRetangulo = str;
    }

    public void setEspRetangulo(int esp) {
        this.espRetangulo = esp;
    }

    public void setCorNomeRetangulo(Color corNomeRetangulo) {
        this.corNomeRetangulo = corNomeRetangulo;
    }

    // getters
    public Color getCorRetangulo() {
        return corRetangulo;
    }

    public String getNomeRetangulo() {
        return nomeRetangulo;
    }

    public Color getCorNomeRetangulo() {
        return corNomeRetangulo;
    }

    public int getEspRetangulo() {
        return (this.espRetangulo);
    }

    public void desenharRetangulo(Graphics g) {

        double m = calcularM();
        double b = calcularB();

        PontoGr ponto;
        double x, y;

        double pIni;
        double pFim;

        g.setColor(getCorNomeRetangulo());
        g.drawString(getNomeRetangulo(), (int) getP1().getX() + getEspRetangulo(), (int) getP1().getY());

        if (p1.getX() == p2.getX()) { // reta vertical
            // Caso 1: y1 < y2
            if (p1.getY() < p2.getY()) {
                pIni = p1.getY();
                pFim = p2.getY();
            } else { // Caso 2: y1 > y2
                pIni = p2.getY();
                pFim = p1.getY();
            }
            // percorre de y1 ate y2.
            // x e´ calculado pela equacao: x = (y - b) / m
            for (y = pIni; y <= pFim; ++y) { // percorre de y1 ate y2
                // x1 e x2 são iguais
                x = p1.getX(); // ou x = p2.getX()

                // Define ponto grafico
                ponto = new PontoGr((int) x, (int) y, getCorRetangulo(), getEspRetangulo());

                // Desenha ponto grafico
                ponto.desenharPonto(g);
            }
        } else {
            double deltaX = Math.abs(p1.getX() - p2.getX());
            double deltaY = Math.abs(p1.getY() - p2.getY());

            if (deltaX > deltaY) { // percorre pelo x
                // Caso 1: x1 < x2
                if (p1.getX() < p2.getX()) {
                    pIni = p1.getX();
                    pFim = p2.getX();
                } else { // Caso 2: x1 > x2
                    pIni = p2.getX();
                    pFim = p1.getX();
                }

                // percorre de x1 ate x2.
                // y e´ calculado pela equacao: y = mx + b
                for (x = pIni; x <= pFim; ++x) {
                    // Calculo de y pela equacao da reta
                    y = (m * x + b);

                    // Define ponto grafico
                    ponto = new PontoGr((int) x, (int) y, getCorRetangulo(), getEspRetangulo());

                    // Desenha ponto grafico
                    ponto.desenharPonto(g);
                }
            } else { // deltaY > deltaX, percorre pelo y
                // Caso 1: y1 < y2
                if (p1.getY() < p2.getY()) {
                    pIni = p1.getY();
                    pFim = p2.getY();
                } else { // Caso 2: y1 > y2
                    pIni = p2.getY();
                    pFim = p1.getY();
                }
                // percorre de y1 ate y2.
                // x e´ calculado pela equacao: x = (y - b) / m
                for (y = pIni; y <= pFim; ++y) { // percorre de y1 ate y2
                    // Calculo de x pela equacao da reta
                    x = ((y - b) / m);

                    // Define ponto grafico
                    ponto = new PontoGr((int) x, (int) y, getCorRetangulo(), getEspRetangulo());

                    // Desenha ponto grafico
                    ponto.desenharPonto(g);
                }
            }
        }
    }
}

import ponto.Ponto;
/**
 * Implementa circulo matematico.
 * 
 */
public class Circulo {
    // centro do circulo
    private Ponto centro;
    private double raio; // raio do circulo

     /**
     * Contrutor da classe circulo
     * @param centro Ponto centro do circulo
     * @param raio double raio do circulo
     */
    public Circulo(Ponto centro, double raio) {
    	setCentro(centro);
    	setRaio(raio);
    }
    
    /**
     * Contrutor da classe circulo
     * @param x double coordenada x do centro do circulo
     * @param y double coordenada y do centro do circulo
     * @param raio double raio do circulo
     */
    public Circulo(double x, double y, double raio) {
    	setCentro(new Ponto(x, y));
    	setRaio(raio);
    }
    
	/**
	 * @return the centro
	 */
	public Ponto getCentro() {
		return centro;
	}

	/**
	 * @param centro the centro to set
	 */
	public void setCentro(Ponto centro) {
		this.centro = centro;
	}

	/**
	 * @return the raio
	 */
	public double getRaio() {
		return raio;
	}

	/**
	 * @param raio the raio to set
	 */
	public void setRaio(double raio) {
		this.raio = raio;
	}
}

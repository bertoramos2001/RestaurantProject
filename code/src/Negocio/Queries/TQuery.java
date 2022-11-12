/**
 * 
 */
package Negocio.Queries;

public class TQuery {
	
	private Float minimo;
	
	private Float maximo;
	
	public TQuery(float minimo, float maximo) {
		this.minimo = minimo;
		this.maximo = maximo;
	}
	
	public Float getMinimo() {
		return minimo;
	}

	public Float getMaximo() {
		return maximo;
	}

	public void setMinimo(float minimo) {
		this.minimo = minimo;
	}

	public void setMaximo(float maximo) {
		this.maximo = maximo;
	}

}
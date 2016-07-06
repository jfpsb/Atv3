package figuras;

public class FiguraGeometrica {
	protected int numLados;
	protected String nome;
	protected float dimensoes[];
	
	protected float calcularPerimetro(){
		float perimetro = 0;
		
		for(int i = 0; i < dimensoes.length; i++){
			perimetro += dimensoes[i];
		}
		
		return perimetro;
	}
	
	protected float calcularArea() { return 0; };
	
	protected void mostrarDimensoes(){
		for(int i = 0; i < dimensoes.length; i++){
			System.out.println("Dimensão " + (i + 1) + ": " + dimensoes[i]);
		}
	}

	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float[] getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(float[] dimensoes) {
		this.dimensoes = dimensoes;
	}
}

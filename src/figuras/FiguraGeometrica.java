package figuras;

import input.Ler;

public class FiguraGeometrica {
	protected int numLados;
	protected String nome;
	protected float dimensoes[];
	
	public float calcularPerimetro(){
		float perimetro = 0;
		
		for(int i = 0; i < dimensoes.length; i++){
			perimetro += dimensoes[i];
		}
		
		return perimetro;
	}
	
	public float calcularArea() { return 0; };
	
	protected void mostrarDimensoes(){
		for(int i = 0; i < dimensoes.length; i++){
			System.out.println("Dimensão " + (i + 1) + ": " + dimensoes[i]);
		}
	}
	
	/** Vai testar se o lado digitado é negativo ou igual a zero. 
	 * @param lado Lado digitado pelo usuário
	 * @return Retorna um lado válido digitado
	 * */
	protected float IsLadoNegativo(float lado){
		float value;
		
		value = lado;
		
		while(value <= 0){
			System.err.println("O valor não pode ser negativo nem igual a zero. Tente novamente: ");
			value = Ler.lerFloat();
		}
		
		return value;
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

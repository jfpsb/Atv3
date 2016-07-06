package figuras;

public class Triangulo extends FiguraGeometrica {
	public Triangulo(String nome){
		numLados = 3;
		dimensoes = new float[numLados];
		this.nome = nome;
	}
	
	@Override
	protected float calcularArea() { 
		float s = calcularPerimetro() / 2;
		float area = 0;
		
		area = (float) Math.sqrt(s * (s - dimensoes[0]) * (s - dimensoes[1]) * (s - dimensoes[2]));		
		
		return area;
	}	
}

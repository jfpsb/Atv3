package figuras;

public class Quadrilatero extends FiguraGeometrica {
	public Quadrilatero(String nome){
		numLados = 4;
		dimensoes = new float[numLados];
		this.nome = nome;
	}
	
	@Override
	public float calcularArea() { 
		return dimensoes[0] * dimensoes[1];
	}
}

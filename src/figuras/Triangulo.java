package figuras;

public class Triangulo extends FiguraGeometrica {
	public Triangulo(String nome){
		numLados = 3;
		dimensoes = new float[numLados];
		this.nome = nome;
	}
	
	@Override
	public float calcularArea() { 
		float s = calcularPerimetro() / 2; //semiperimetro
		
		float area = 0;
		float aux = 1; //Guarda multiplicacao de semiperimetro menos lados 
		
		for(int i = 0; i < dimensoes.length; i++){
			aux *= (s - dimensoes[i]);
		}
		
		area = (float) Math.sqrt(s * aux);
		
		return area;
	}	
}

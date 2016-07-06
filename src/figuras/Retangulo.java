package figuras;

import input.Ler;

public class Retangulo extends Quadrilatero {

	public Retangulo(String nome) {
		super(nome);
	}
	
	public void setDimensoesRetangulo(){
		float dim[] = new float[numLados];
		
		float base, altura;
		
		System.out.println("Digite o valor da base do retângulo: ");
		base = Ler.lerFloat();
		
		base = IsLadoNegativo(base);
		
		System.out.println("Digite o valor da altura do retângulo: ");
		altura = Ler.lerFloat();
		
		altura = IsLadoNegativo(altura);
		
		dim[0] = base;
		dim[1] = altura;
		dim[2] = base;
		dim[3] = altura;
		
		setDimensoes(dim);
	}
}

package figuras;

import input.Ler;

public class Quadrado extends Quadrilatero {

	public Quadrado(String nome) {
		super(nome);
	}
	
	public void setDimensoesQuadrado(){
		float dim[] = new float[numLados];
		
		float lado;
		
		System.out.println("Digite o valor dos lados do quadrado: ");
		lado = Ler.lerFloat();
		
		lado = IsLadoNegativo(lado);
		
		dim[0] = lado;
		dim[1] = lado;
		dim[2] = lado;
		dim[3] = lado;
		
		setDimensoes(dim);
	}
}

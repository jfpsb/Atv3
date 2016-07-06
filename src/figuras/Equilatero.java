package figuras;

import input.Ler;

public class Equilatero extends Triangulo {

	public Equilatero(String nome) {
		super(nome);
	}
	
	public void setDimensoesEquilatero() {
		float dim[] = new float[numLados];
		
		float lado;
		
		System.out.println("Digite o tamanho dos três lados do triângulo equilátero: ");
		lado = Ler.lerFloat();
		
		lado = IsLadoNegativo(lado);
		
		dim[0] = lado;
		dim[1] = lado;
		dim[2] = lado;
		
		setDimensoes(dim);
	}
}

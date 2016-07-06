package figuras;

import input.Ler;

public class Equilatero extends Triangulo {

	public Equilatero(String nome) {
		super(nome);
		
		float lado;
		
		System.out.println("Digite o tamanho dos três lados do triângulo equilátero: ");
		lado = Ler.lerFloat();
		
		dimensoes[0] = lado;
		dimensoes[1] = lado;
		dimensoes[2] = lado;
	}

}

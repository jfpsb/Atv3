package figuras;

import input.Ler;

public class Equilatero extends Triangulo {

	public Equilatero(String nome) {
		super(nome);
		
		float lado;
		
		System.out.println("Digite o tamanho dos tr�s lados do tri�ngulo equil�tero: ");
		lado = Ler.lerFloat();
		
		dimensoes[0] = lado;
		dimensoes[1] = lado;
		dimensoes[2] = lado;
	}

}

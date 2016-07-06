package figuras;

import input.Ler;

public class Quadrado extends Quadrilatero {

	public Quadrado(String nome) {
		super(nome);
		
		float lado;
		
		System.out.println("Digite o valor dos lados do quadrado: ");
		lado = Ler.lerFloat();
		
		dimensoes[0] = lado;
		dimensoes[1] = lado;
		dimensoes[2] = lado;
		dimensoes[3] = lado;
	}
	
	@Override
	protected float calcularArea() { 
		return dimensoes[0] * dimensoes[1];
	}
}

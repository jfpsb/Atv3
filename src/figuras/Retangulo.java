package figuras;

import input.Ler;

public class Retangulo extends Quadrilatero {

	public Retangulo(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
		
		float base, altura;
		
		System.out.println("Digite o valor da base do retângulo: ");
		base = Ler.lerFloat();
		
		System.out.println("Digite o valor da altura do retângulo: ");
		altura = Ler.lerFloat();
		
		dimensoes[0] = base;
		dimensoes[1] = altura;
		dimensoes[2] = base;
		dimensoes[3] = altura;
	}
	
	@Override
	protected float calcularArea() { 
		return dimensoes[0] * dimensoes[1];
	}
}

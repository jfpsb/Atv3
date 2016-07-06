package figuras;

import input.Ler;

public class Isosceles extends Triangulo {

	public Isosceles(String nome) {
		super(nome);
		
		float base, lados;
		
		System.out.println("Digite o valor da base do tri�ngulo is�sceles: ");
		base = Ler.lerFloat();
		
		System.out.println("Digite o valor dos dois lados iguais do tri�ngulo is�sceles: ");
		lados = Ler.lerFloat();
		
		dimensoes[0] = base;
		dimensoes[1] = lados;
		dimensoes[2] = lados;
	}
}

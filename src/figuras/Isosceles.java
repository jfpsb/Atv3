package figuras;

import input.Ler;

public class Isosceles extends Triangulo {

	public Isosceles(String nome) {
		super(nome);
	}
	
	public void setDimensoesIsosceles(){
		float dim[] = new float[numLados];
		
		float base, lados;
		float ladosSomados;
		
		System.out.println("Digite o valor da base do triângulo isósceles: ");
		base = Ler.lerFloat();
		
		base = IsLadoNegativo(base);
		
		System.out.println("Digite o valor dos lados do triângulo isósceles: ");
		lados = Ler.lerFloat();
		
		lados = IsLadoNegativo(lados);
		
		ladosSomados = lados*2;
		
		while(ladosSomados <= base){
			System.err.println("A soma dos dois lados informados deve ser maior que o valor da base. Tente novamente: ");
			lados = Ler.lerFloat();
			ladosSomados = lados*2;
		}
		
		dim[0] = base;
		dim[1] = lados;
		dim[2] = lados;
		
		setDimensoes(dim);
	}
}

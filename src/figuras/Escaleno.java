package figuras;

import input.Ler;

public class Escaleno extends Triangulo {

	public Escaleno(String nome) {
		super(nome);

		float lado, aux;
		Boolean repetido;

		for (int i = 0; i < numLados; i++) {
			System.out.printf("Digite o valor da dimensão %d do triângulo escaleno: ", i + 1);
			lado = Ler.lerFloat();
			
			repetido = false;
			
			for (float f : dimensoes) {
				if (lado == f) {
					repetido = true;
					break;
				}
			}

			if(repetido){				
				while(repetido){
					System.err.println("Um triângulo escaleno não possui lados iguais. Digite novamente: ");
					aux = Ler.lerFloat();
					
					if(aux != lado)
						repetido = false;
				}
			}
		}
	}

}

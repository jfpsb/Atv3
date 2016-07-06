package aplicacao;

import java.util.ArrayList;

import figuras.*;

public class Program {

	public static void main(String[] args) {
		ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();

		// Triangulos
		Equilatero equilatero1 = new Equilatero("Tri�ngulo Equil�tero");
		Isosceles isosceles1 = new Isosceles("Tri�ngulo Is�sceles");
		Escaleno escaleno1 = new Escaleno("Tri�ngulo Escaleno");

		// Quadrilateros
		Quadrado quadrado1 = new Quadrado("Quadrado");
		Retangulo retangulo1 = new Retangulo("Ret�ngulo");

		equilatero1.setDimensoesEquilatero();
		isosceles1.setDimensoesIsosceles();
		escaleno1.setDimensoesEscaleno();
		quadrado1.setDimensoesQuadrado();
		retangulo1.setDimensoesRetangulo();

		figuras.add(equilatero1);
		figuras.add(isosceles1);
		figuras.add(escaleno1);
		figuras.add(quadrado1);
		figuras.add(retangulo1);

		compararPerimetro(equilatero1, isosceles1);
		compararPerimetro(quadrado1, escaleno1);
		compararPerimetro(retangulo1, isosceles1);
		compararPerimetro(isosceles1, quadrado1);

		compararArea(equilatero1, isosceles1);
		compararArea(quadrado1, escaleno1);
		compararArea(retangulo1, isosceles1);
		compararArea(isosceles1, quadrado1);
	}

	private static void compararPerimetro(FiguraGeometrica figura1, FiguraGeometrica figura2) {
		System.out.println("Comparando per�metros de " + figura1.getNome() + " e " + figura2.getNome());

		float perimFigura1 = figura1.calcularPerimetro();
		float perimFigura2 = figura2.calcularPerimetro();
		
		float dimFigura1[] = figura1.getDimensoes();
		float dimFigura2[] = figura2.getDimensoes();

		if (perimFigura1 > perimFigura2) {
			System.out.println("O per�metro de " + figura1.getNome() + " � maior que o de " + figura2.getNome() + ".");
		} else if (perimFigura2 > perimFigura1) {
			System.out.println("O per�metro de " + figura2.getNome() + " � maior que o de " + figura1.getNome() + ".");
		} else {
			System.out.println("Os valores dos per�metros s�o iguais.");
		}

		System.out.println("Com o per�metro de " + figura1.getNome() + " sendo " + perimFigura1 + ".");
		printLados(dimFigura1);
		System.out.println("Com o per�metro de " + figura2.getNome() + " sendo " + perimFigura2 + ".");
		printLados(dimFigura2);
		
		System.out.println();
	}

	private static void compararArea(FiguraGeometrica figura1, FiguraGeometrica figura2) {
		System.out.println("Comparando �reas de " + figura1.getNome() + " e " + figura2.getNome());

		float areaFigura1 = figura1.calcularArea();
		float areaFigura2 = figura2.calcularArea();
		
		float dimFigura1[] = figura1.getDimensoes();
		float dimFigura2[] = figura2.getDimensoes();

		if (areaFigura1 > areaFigura2) {
			System.out.println("A �rea de " + figura1.getNome() + " � maior que a de " + figura2.getNome() + ".");
		} else if (areaFigura2 > areaFigura1) {
			System.out.println("A �rea de " + figura2.getNome() + " � maior que a de " + figura1.getNome() + ".");
		} else {
			System.out.println("Os valores das �reas s�o iguais.");
		}

		System.out.println("Com a �rea de " + figura1.getNome() + " sendo " + areaFigura1 + ".");
		printLados(dimFigura1);
		System.out.println("Com a �rea de " + figura2.getNome() + " sendo " + areaFigura2 + ".");
		printLados(dimFigura2);
		
		System.out.println();
	}
	
	private static void printLados(float dim[]){
		System.out.println("E lados sendo: ");
		for(int i = 0; i < dim.length; i++){
			System.out.printf("Lado %d: %.2f", i + 1, dim[i]);
			System.out.println();
		}
	}
}

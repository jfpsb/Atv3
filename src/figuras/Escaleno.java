package figuras;

import input.Ler;

public class Escaleno extends Triangulo {

	public Escaleno(String nome) {
		super(nome);
	}

	public void setDimensoesEscaleno() {
		float dim[] = new float[numLados];

		float base, lesq, ldir;
		float dif; // modulo da diferenca de dois lados do triangulo

		System.out.println("Digite o valor da base do triângulo escaleno: ");
		base = Ler.lerFloat();

		base = IsLadoNegativo(base);

		System.out.println("Digite o valor do lado esquerdo do triângulo escaleno: ");
		lesq = Ler.lerFloat();

		lesq = IsLadoNegativo(lesq);

		while (lesq == base) {
			System.err.printf("Em um triângulo escaleno nem um lado pode ser igual ao outro. "
					+ "Sua base já é %f.2. Digite novamente: ", base);
			lesq = Ler.lerFloat();
		}

		System.out.println("Digite o valor do lado direito do triângulo escaleno: ");
		ldir = Ler.lerFloat();

		ldir = IsLadoNegativo(ldir);

		dif = base - lesq;

		dif = (dif < 0 ? dif * (-1) : dif); // Atribui a dif o módulo da
											// diferença

		while (ldir == base || ldir == lesq || ldir <= dif || ldir >= (base + lesq)) {
			if (ldir == base || ldir == lesq) {
				System.err.printf("Em um triângulo escaleno nem um lado pode ser igual ao outro. "
						+ "Sua base já é %f.2 e seu lado esquerdo já é %f.2. Digite novamente: ", base, lesq);
			}

			if (ldir <= dif) {
				System.err.printf("Você digitou um lado muito pequeno. Ele deve ser maior que %.2f. Tente novamente: \n",
						dif);
			}

			if (ldir >= (base + lesq)) {
				System.err.printf("Você digitou um lado muito grande. Ele deve ser menor que %.2f. Tente novamente: \n",
						(base + lesq));
			}

			ldir = Ler.lerFloat();
		}

		dim[0] = base;
		dim[1] = lesq;
		dim[2] = ldir;

		setDimensoes(dim);
	}

}

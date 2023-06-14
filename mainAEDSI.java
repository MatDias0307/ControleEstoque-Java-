
//Programa para venda de m�scara lisa infantil/estampada infantil/lisa adulta/estampada adulta, com registro de vendas, estoque e lucro di�rio
//Nome do programador: Matheus Dias Soares
//Data de escrita: 27/06/2021
//Data da �ltima atualiza��o: 06/07/2021

import java.util.Scanner;

public class mainAEDSI {

	// m�todo para exibir as vendas di�rias, recebe como par�metro as quantidades
	// vendidas de cada produto

	public static void vendas(double pdt1, double pdt2, double pdt3, double pdt4) {
		System.out.print("\nVendas do dia: ");
		System.out.print("\n Produto 1: " + pdt1);
		System.out.print("\n Produto 2: " + pdt2);
		System.out.print("\n Produto 3: " + pdt3);
		System.out.print("\n Produto 3: " + pdt4);
		System.out.print("\n Total de vendas: " + (pdt1 + pdt2 + pdt3 + pdt4));
	}

	// m�todo para exibir o estoque, recebe como par�metro o estoque de cada produto
	// ap�s as vendas

	public static void estoque(double qtd1, double qtd2, double qtd3, double qtd4) {
		System.out.print("\n\nM�scaras em estoque");
		System.out.print("\n Produto 1: " + qtd1);
		System.out.print("\n Produto 2: " + qtd2);
		System.out.print("\n Produto 3: " + qtd3);
		System.out.print("\n Produto 3: " + qtd4);
	}

	// m�todo para calcular lucro do produto 1, recebe como par�metro o pre�o de
	// venda, quantidades vendidas e custo de produ��o do produto 1, respectivamente

	public static double lucroP1(double precoVenda1, int qtd1, double precoCusto1) {
		double lucro1;

		lucro1 = (precoVenda1 * qtd1) - (precoCusto1 * qtd1);

		return lucro1;
	}

	// m�todo para calcular lucro do produto 2, recebe como par�metro o pre�o de
	// venda, quantidades vendidas e custo de produ��o do produto 2, respectivamente

	public static double lucroP2(double precoVenda2, int qtd2, double precoCusto2) {
		double lucro2;

		lucro2 = (precoVenda2 * qtd2) - (precoCusto2 * qtd2);

		return lucro2;
	}

	// m�todo para calcular lucro do produto 3, recebe como par�metro o pre�o de
	// venda, quantidades vendidas e custo de produ��o do produto 3, respectivamente

	public static double lucroP3(double precoVenda3, int qtd3, double precoCusto3) {
		double lucro3;

		lucro3 = (precoVenda3 * qtd3) - (precoCusto3 * qtd3);

		return lucro3;
	}

	// m�todo para calcular lucro do produto 4, recebe como par�metro o pre�o de
	// venda, quantidades vendidas e custo de produ��o do produto 4, respectivamente

	public static double lucroP4(double precoVenda4, int qtd4, double precoCusto4) {
		double lucro4;

		lucro4 = (precoVenda4 * qtd4) - (precoCusto4 * qtd4);

		return lucro4;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[][] prod = new double[4][3];
		int j, op = 0, ctP1 = 0, ctP2 = 0, ctP3 = 0, ctP4 = 0, dia = 1;
		double lucroTotal = 0;
		int resp1 = 0;

		// preenchimento da matriz prod[4][3], onde as linhas correspondem aos 4
		// produtos e as colunas ao estoque, custo de produ��o e pre�o de venda,
		// respectivamente

		System.out.print(
				"Entre com a quantidade em estoque, custo de produ��o e pre�o de venda da m�scara lisa infantil, respectivamente: \n");
		for (j = 0; j < 3; j++) {
			System.out.printf(" Produto 1 - informa��o %d = ", j + 1);
			prod[0][j] = sc.nextDouble();
		}

		System.out.print(
				"\nEntre com a quantidade em estoque, custo de produ��o e pre�o de venda da m�scara estampada infantil, respectivamente: \n");
		for (j = 0; j < 3; j++) {
			System.out.printf(" Produto 2 - informa��o %d = ", j + 1);
			prod[1][j] = sc.nextDouble();
		}

		System.out.print(
				"\nEntre com a quantidade em estoque, custo de produ��o e pre�o de venda da m�scara lisa adulta, respectivamente: \n");
		for (j = 0; j < 3; j++) {
			System.out.printf(" Produto 3 - informa��o %d = ", j + 1);
			prod[2][j] = sc.nextDouble();
		}

		System.out.print(
				"\nEntre com a quantidade em estoque, custo de produ��o e pre�o de venda da m�scara estampada adulta, respectivamente: \n");
		for (j = 0; j < 3; j++) {
			System.out.printf(" Produto 4 - informa��o %d = ", j + 1);
			prod[3][j] = sc.nextDouble();
		}

		for (dia = 1; resp1 >= 0; dia++) {
			System.out.printf("\nDia %d", dia);

			// repeti��o para saber quando as vendas di�rias terminam

			while (op >= 0) {
				System.out.print(
						"\nQual dos produtos foi vendido? \n1 - m�scara lisa infantil \n2 - m�scara estampada infantil \n3 - m�scara lisa adulta \n4 - m�scara estampada adulta "
								+ "\n*Digite um n�mero negativo para encerrar o dia");
				System.out.print("\nProduto: ");
				op = sc.nextInt();

				// de acordo com o produto selecionado, o programa ir� verificar se h�
				// diponibilida no estoque, e assim, retirar uma unidade dele na matriz e
				// acrescentar uma unidade vendida no contador(ct1/2/3/4)

				switch (op) {
					case 1:
						if (prod[0][0] > 0) {
							prod[0][0]--;
							ctP1++;
						} else {
							System.out.print("Acabou o estoque do produto!!\n");
						}
						break;

					case 2:
						if (prod[1][0] > 0) {
							prod[1][0]--;
							ctP2++;
						} else {
							System.out.print("Acabou o estoque do produto!!\n");
						}

						break;

					case 3:
						if (prod[2][0] > 0) {
							prod[2][0]--;
							ctP3++;
						} else {
							System.out.print("Acabou o estoque do produto!!\n");
						}

						break;

					case 4:
						if (prod[3][0] > 0) {
							prod[3][0]--;
							ctP4++;
						} else {
							System.out.print("Acabou o estoque do produto!!\n");
						}
						break;
					default:
						System.out.print("Esse c�digo n�o corresponde a nenhum produto!!");
						break;
				}
			}

			// m�todos das vendas di�rias e estoque

			vendas(ctP1, ctP2, ctP3, ctP4);

			estoque(prod[0][0], prod[1][0], prod[2][0], prod[3][0]);

			// c�culo do lucro total di�rio a partir do lucro de cada produto utilizando
			// m�todos

			lucroTotal = lucroP1(prod[0][2], ctP1, prod[0][1]) + lucroP2(prod[1][2], ctP2, prod[1][1])
					+ lucroP3(prod[2][2], ctP3, prod[2][1]) + lucroP4(prod[3][2], ctP4, prod[3][1]);

			System.out.print("\n\nLucro do dia: " + lucroTotal);

			System.out.print("\nDeseja iniciar um novo dia? - sim(s) ou n�o(n): ");
			resp1 = sc.nextInt();

			dia++;
		}

		sc.close();

	}

}
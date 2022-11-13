/*
 * Programa para ler medidas retangulares de um terreno e o valor por metro quadrado
 * e calcular a area e o pre�o do terreno.
*/

package entities;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double largura;
		double comprimento;
		double metroQuadrado;
		
		System.out.println("---C�LCULO DE TERRENO---");
		System.out.print("Largura: ");
		largura = sc.nextDouble();
		System.out.print("Comprimento: ");
		comprimento = sc.nextDouble();
		System.out.print("Pre�o do metro quadrado em R$: ");
		metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double precoTerreno = metroQuadrado * area;
		
		System.out.println("Area do terreno �: " + area + " m�");
		System.out.printf("O pre�o do terreno �: R$ %.2f ", precoTerreno);
	}
}

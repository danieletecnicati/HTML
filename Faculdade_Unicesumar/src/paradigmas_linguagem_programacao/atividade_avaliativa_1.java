package paradigmas_linguagem_programacao;

import java.util.Scanner;

public class atividade_avaliativa_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[][] vetorAluno = new String[1][5];

		for (int i=0;i<1;i++) {	
			System.out.println("Digite o nome do aluno: ");
			vetorAluno[i][0] = sc.nextLine();  				//posição 0 é o nome do aluno
			System.out.println("Digite a primeira nota: ");
			vetorAluno[i][1] = sc.nextLine();
			System.out.println("Digite a segunda nota: ");
			vetorAluno[i][2] = sc.nextLine();
			System.out.println("Digite a terceira nota: ");
			vetorAluno[i][3] = sc.nextLine();
			System.out.println("Digite a quarta nota: ");
			vetorAluno[i][4] = sc.nextLine();
		}
		
		double media = 0.0;
		
		for (int i=0; i < vetorAluno.length; i++) {
			double soma = 0.0;
			for (int j = 1; j < 5; j++) {
				soma +=  Double.valueOf(vetorAluno[i][j]) ;
			}
			media = soma / (vetorAluno[i].length-1);
			
			System.out.println("Aluno(a) " + vetorAluno[i][0] + " tem média " + media);
		}
		
		sc.close();
	}
}
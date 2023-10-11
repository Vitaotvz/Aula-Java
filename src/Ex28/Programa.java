package Ex28;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Aluno[] alunos = new Aluno[5];
		
		for(int i = 0; i<=4; i++) {
			Aluno a = new Aluno();
			
			System.out.printf("Digite o RA do aluno: ");
			a.ra = ler.next();
			
			System.out.printf("Digite o nome do aluno: ");
			a.nome = ler.next();
				
				for (int x = 0; x <=5; x++) {
				System.out.printf("Digite a sigla/inicial da %d° matéria que ele está cursando no momento: ", x); 
				a.materias = ler.next();
				}
			
			System.out.printf("Aluno cursando no período da MANHÃ ou NOITE?");
			a.periodo = ler.next();
			
			alunos[i] = a;
		}
		
			System.out.printf("Lista de alunos no período noturno:\n");
			
			for (int i= 0; i<=4; i++) {
				if(alunos[i].periodo.equalsIgnoreCase("noite"));
					System.out.printf("Alunos: %s\n", alunos[i].nome);
					
			}
	}

}

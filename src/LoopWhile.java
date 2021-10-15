import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*
		 * Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar
		 * permanentemente a idade de cada um desses alunos, qual é a melhor forma de
		 * calcular essa média?
		 */

		Scanner leitor = new Scanner(System.in);

		int idade;
		double media = 0;
		int numeroAlunos = 1;
		int qtd;

		System.out.println("Quantos alunos tem na turma?");
		qtd = leitor.nextInt();

		while (numeroAlunos < qtd) {
			System.out.println("Digite a idade do aluno " + numeroAlunos);
			idade = leitor.nextInt();
			numeroAlunos = numeroAlunos + 1;
			media = media + idade;
		}

		media = media / numeroAlunos;

		System.out.println("A média é de " + media + " anos");

		leitor.close();
	}

}

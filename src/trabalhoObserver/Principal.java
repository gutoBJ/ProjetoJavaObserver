package trabalhoObserver;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		EditoraConcreta edit = new EditoraConcreta();
		
		int op = 0;
		
		int assunto = 0;
		
		while (op != 2) {
			System.out.println("Deseja cadastrar um assinante: ");
			System.out.println("1 - SIM");
			System.out.println("2 - NAO");
			op = sc.nextInt();
			sc.nextLine();
			if (op == 2) break;
			
			System.out.println("Informe o nome do assinante: ");
			String nome = sc.nextLine();
			
			System.out.println("Qual a assinatura desejada: ");
			System.out.println("1 - Esportes");
			System.out.println("2 -  Politica");
			System.out.println("3 - Financas");
			assunto = sc.nextInt();
			
			sc.nextLine();
			
			AssinanteConcreto assin = new AssinanteConcreto(nome, assunto);
			
			edit.assinarEditora(assin, assunto);
			
		}
		
		/*String tipo = "";
		
		if (assunto == 1) {
			tipo = "Esportes";
		} else if (assunto == 2) {
			tipo = "Politica";
		} else if (assunto == 3) {
			tipo = "Financas";
		} else {
			return;
		}*/
		
		System.out.println("Informe a mensagem de Esportes: ");
		String mensagem1 = sc.nextLine();
		
		edit.notificarAssinantes(mensagem1, 1);
		
		System.out.println("Informe a mensagem de Politica: ");
		String mensagem2 = sc.nextLine();
		
		edit.notificarAssinantes(mensagem2, 2);
		
		System.out.println("Informe a mensagem de Financas: ");
		String mensagem3 = sc.nextLine();
		
		edit.notificarAssinantes(mensagem3, 3);
		
		System.out.println("Programa finalizado");

	}

}

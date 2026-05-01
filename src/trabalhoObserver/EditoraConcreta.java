package trabalhoObserver;

import java.util.ArrayList;
import java.util.List;

public class EditoraConcreta implements Editora {
	
	private final List<Assinante> assinantesEsporte = new ArrayList<>();
	private final List<Assinante> assinantesPolitica = new ArrayList<>();
	private final List<Assinante> assinantesFinancas = new ArrayList<>();
	private String estado;
	
	public void assinarEditora(Assinante assinante, int assunto, String nome) {
		
		switch(assunto) {
			case 1:
				assinantesEsporte.add(assinante);
				break;
			case 2:
				assinantesPolitica.add(assinante);
				break;
			case 3:
				assinantesFinancas.add(assinante);
				break;
			default:
				System.out.println("Erro! Assunto inválido");
				break;
		}

		AssinanteConcreto assis = new AssinanteConcreto(nome, assunto);
		String mensagem = assis.getNome() + " efetuou assinatura da editora";
		notificarAssinantes(mensagem, assunto);

	}
	
	public void cancelarEditora(Assinante assinante, int assunto, String nome) {

		AssinanteConcreto assin = new AssinanteConcreto(nome, assunto);
		
		switch(assunto) {
			case 1:
				if (nome.equals(assin.getNome())) {
					assinantesEsporte.remove(assinante);
				}
				break;
			case 2:
				if (nome.equals(assin.getNome())) {
					assinantesPolitica.remove(assinante);
				}
				break;
			case 3:
				if (nome.equals(assin.getNome())) {
					assinantesFinancas.remove(assinante);
				}
				break;
			default:
				System.out.println("Erro! Assunto inválido");
				break;
		}

		String mensagem = "Assinante " + assin.getNome() + " cancelou assinatura";
		notificarAssinantes(mensagem, assunto);
	}
	
	public void notificarAssinantes(String mensagem, int assunto) {
		
			if (assunto == 1) {
				for (Assinante assinante : assinantesEsporte) {
					if (!assinantesEsporte.isEmpty()) {
						assinante.publicar(mensagem);
					} else {
						System.out.println("Nenhum assinante aqui!");
					}

				}
			}
			
			if (assunto == 2) {
				for (Assinante assinante : assinantesPolitica) {
					if (!assinantesPolitica.isEmpty()) {
						assinante.publicar(mensagem);
					} else {
						System.out.println("Nenhum assinante aqui!");
					}

				}
			}
			
			if (assunto == 3) {
				for (Assinante assinante : assinantesFinancas) {
					if (!assinantesFinancas.isEmpty()) {
						assinante.publicar(mensagem);
					} else {
						System.out.println("Nenhum assinante aqui!");
					}

				}
			}
		
	}
	
	/* public void setEstado(String estado) {
		this.estado = estado;
		notificarAssinantes("Estado atualizado para: " + this.estado);
	} */

}

package trabalhoObserver;

import java.util.ArrayList;
import java.util.List;

public class EditoraConcreta implements Editora {
	
	private final List<Assinante> assinantesEsporte = new ArrayList<>();
	private final List<Assinante> assinantesPolitica = new ArrayList<>();
	private final List<Assinante> assinantesFinancas = new ArrayList<>();
	private String estado;
	
	public void assinarEditora(Assinante assinante, int assunto) {
		
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
	}
	
	public void cancelarEditora(Assinante assinante, int assunto) {
		
		/* switch(assunto) {
			case 1:
				assinantesEsporte.remove(assinante);
				break;
			case 2:
				assinantesPolitica.remove(assinante);
				break;
			case 3:
				assinantesFinancas.remove(assinante);
				break;
			default:
				System.out.println("Erro! Assunto inválido");
				break;
		} */
		
		AssinanteConcreto assin = new AssinanteConcreto();
		String mensagem = "Assinante " + assin.getNome() + " cancelou assinatura";
		notificarAssinantes(mensagem, assunto);
	}
	
	public void notificarAssinantes(String mensagem, int assunto) {
		
			if (assunto == 1) {
				for (Assinante assinante : assinantesEsporte) {
					assinante.publicar(mensagem);
				}
			}
			
			if (assunto == 2) {
				for (Assinante assinante : assinantesPolitica) {
					assinante.publicar(mensagem);
				}
			}
			
			if (assunto == 3) {
				for (Assinante assinante : assinantesFinancas) {
					assinante.publicar(mensagem);
				}
			}
		
	}
	
	/* public void setEstado(String estado) {
		this.estado = estado;
		notificarAssinantes("Estado atualizado para: " + this.estado);
	} */

}

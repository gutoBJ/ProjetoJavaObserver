package trabalhoObserver;

public interface Editora {
	
	void assinarEditora(Assinante assinante, int assunto, String nome);
	void cancelarEditora(Assinante assinante, int assunto, String nome);
	void notificarAssinantes(String mensagem, int assunto);

}

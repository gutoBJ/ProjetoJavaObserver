package trabalhoObserver;

public class AssinanteConcreto implements Assinante {
	
	private String nome;
	private int assunto;
	
	public AssinanteConcreto(String nome, int assunto) {
		this.nome = nome;
		this.assunto = assunto;
	}
	
	public AssinanteConcreto() {
		
	}
	
	public void publicar(String mensagem) {
		System.out.println("Assinante: " + this.nome + " recebeu a mensagem: " + mensagem);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}

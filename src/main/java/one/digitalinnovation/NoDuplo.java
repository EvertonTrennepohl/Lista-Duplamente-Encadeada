package one.digitalinnovation;

public class NoDuplo<T> {
	
	private T conteudo;
	private NoDuplo<T> proximoNo;
	private NoDuplo<T> noPrevio;
	
	public NoDuplo(T conteudo) {
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public NoDuplo<T> getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(NoDuplo<T> noProximo) {
		this.proximoNo = noProximo;
	}

	public NoDuplo<T> getNoPrevio() {
		return noPrevio;
	}

	public void setNoPrevio(NoDuplo<T> noPrevio) {
		this.noPrevio = noPrevio;
	}

	@Override
	public String toString() {
		return "NoDuplo [conteudo=" + conteudo + "]";
	}
	
}

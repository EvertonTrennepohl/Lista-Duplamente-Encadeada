package one.digitalinnovation;

public class ListaDuplamenteEncadeada<T> {
	
	private NoDuplo<T> primeiroNo;
	private NoDuplo<T> ultimoNo;
	
	private int tamanhoLista;
	
	public ListaDuplamenteEncadeada() {
		this.primeiroNo = null;
		this.ultimoNo = null;
		this.tamanhoLista = 0;
	}
	
	public void add(T conteudo) {
		NoDuplo<T> novoNo = new NoDuplo<T>(conteudo);
		novoNo.setProximoNo(null);
		novoNo.setNoPrevio(ultimoNo);
		if(primeiroNo == null) {
			primeiroNo = novoNo;
		}
		if(ultimoNo != null) {
			ultimoNo.setProximoNo(novoNo);
		}
		ultimoNo = novoNo;
		tamanhoLista++;
	}
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	public void add(int index, T conteudo) {
		NoDuplo<T> noAuxiliar = getNo(index);
		NoDuplo<T> novoNo = new NoDuplo<T>(conteudo);
		novoNo.setProximoNo(noAuxiliar);
		
		if(novoNo.getProximoNo() != null) {
			novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
			novoNo.getProximoNo().setNoPrevio(novoNo);
		} else {
			novoNo.setNoPrevio(ultimoNo);
			ultimoNo = novoNo;
		}
		
		if(index == 0) {
			primeiroNo = novoNo;
		} else {
			novoNo.getNoPrevio().setProximoNo(novoNo);
		}
		tamanhoLista++;
	}
	
	public void remove(int index) {
		if(index == 0) {
			primeiroNo = primeiroNo.getProximoNo();
			if(primeiroNo != null) {
				primeiroNo.setNoPrevio(null);
			}
		} else {
			NoDuplo<T> noAuxiliar = getNo(index);
			noAuxiliar.getNoPrevio().setProximoNo(noAuxiliar.getProximoNo());
			if(noAuxiliar != ultimoNo) {
				noAuxiliar.getProximoNo().setNoPrevio(noAuxiliar.getNoPrevio());
			} else {
				ultimoNo = noAuxiliar;
			}
		}
		this.tamanhoLista--;
	}
	
	private NoDuplo<T> getNo(int index) {
		NoDuplo<T> noAuxiliar = primeiroNo;
		for(int i = 0; (i < index) && (noAuxiliar != null); i++) {
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		return noAuxiliar;
	}
	
	public int size() {
		return this.tamanhoLista;
	}

	@Override
	public String toString() {
		String strRetorno = "";
		NoDuplo<T> noAuxiliar = primeiroNo;
		for(int i = 0; i < size(); i++) {
			strRetorno += "{No[conteudo=" + noAuxiliar.getConteudo() + "]}-->";
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		strRetorno += "null";
		return strRetorno;
	}
	
	

}

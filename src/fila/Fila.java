package fila;


public class Fila {
	private Nodo inicioDaFila;

	public Fila() {
		this.inicioDaFila = null;
	} 

	public void inserirNodoNoFinal(int nodoValor) {
		Nodo novoNodo = new Nodo(nodoValor);
		if (inicioDaFila == null) {
			this.inicioDaFila = novoNodo;
		} else {
			Nodo auxiliarDeContagem = inicioDaFila;
			while (auxiliarDeContagem.getProximoDaFila() != null) {
				auxiliarDeContagem = auxiliarDeContagem.getProximoDaFila();

			}
			auxiliarDeContagem.setProximoDaFila(novoNodo);

		}
	}

	public void imprime() {
		if (inicioDaFila == null) {
			System.out.println("Lista vazia!");
		} else {
			Nodo aux = inicioDaFila;
			while (aux != null) { 
				System.out.println(aux.getValor());
				aux = aux.getProximoDaFila();

			}
		}
	}

	
	public void removerNodoDoInicio() {
		
		if (this.inicioDaFila == null) {
			System.out.println("A lista está vazia");
		} else {
			if (this.inicioDaFila.getProximoDaFila() == null) {
				this.inicioDaFila = null;

			} else {
				this.inicioDaFila = inicioDaFila.getProximoDaFila();
			}
		}
	}

}

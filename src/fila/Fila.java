package fila;


//Como inserir um nodo em uma fila vazia
public class Fila {
	private Nodo inicioDaFila;

	public Fila() {
		this.inicioDaFila = null;
	}	// fila sempre remove no inicio e insere no final

	public void inserirNodoNoFinal (int nodoValor) {
		Nodo novoNodo = new Nodo (nodoValor);
		if (inicioDaFila == null) {
		this.inicioDaFila = novoNodo;
		}
		else {
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
			while (aux != null) { // o aux ta em cima do 3, em cima do nodo, ao inves de ver o prox
				System.out.println(aux.getValor());
				aux = aux.getProximoDaFila();

			}
		}
	}

	// remover do inicio, pois na fila se remove o primeiro
	public void removeDoInicio() {
		Nodo aux = inicioDaFila;

		if (this.inicioDaFila == null) {
			System.out.println("Lista vazia");
		} else {//

			if (this.inicioDaFila.getProximoDaFila() == null) {// o proximo do inicio for nulo, quer dizer que temos que remover o
													// inicio, inicio==null
				this.inicioDaFila = null; // remove inicio
			} else {// caso o proximo do inicio não seja nulo , então o proximo do inicio vai ser o
					// 'novo' inicio, removendo então o inicio
				this.inicioDaFila = inicioDaFila.getProximoDaFila(); // Para apontar o inicio para o segundo nodo, automaticamente já
													// estamos removendo o primeiro nodo
			}
		}
	}

}

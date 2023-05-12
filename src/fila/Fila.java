package fila;


//Como inserir um nodo em uma fila vazia
public class Fila {
	private Nodo inicio;

	public Fila() {
		this.inicio = null;
	}
	// fila sempre remove no inicio e insere no final

	public void insereNoFinal(int valor) {
		Nodo novo = new Nodo(valor);
		// inserindo nodo em fila vazia
		if (inicio == null) {
			this.inicio = novo;
		} else { // caso ja tenha nodos na fila
			Nodo aux = inicio;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novo);
		}
	}

	public void imprime() {
		if (inicio == null) {
			System.out.println("Lista vazia!");
		} else {
			Nodo aux = inicio;
			while (aux != null) { // o aux ta em cima do 3, em cima do nodo, ao inves de ver o prox
				System.out.println(aux.getValor());
				aux = aux.getProximo();

			}
		}
	}

	// remover do inicio, pois na fila se remove o primeiro
	public void removeDoInicio() {
		Nodo aux = inicio;

		if (this.inicio == null) {
			System.out.println("Lista vazia");
		} else {//

			if (this.inicio.getProximo() == null) {// o proximo do inicio for nulo, quer dizer que temos que remover o
													// inicio, inicio==null
				this.inicio = null; // remove inicio
			} else {// caso o proximo do inicio não seja nulo , então o proximo do inicio vai ser o
					// 'novo' inicio, removendo então o inicio
				this.inicio = inicio.getProximo(); // Para apontar o inicio para o segundo nodo, automaticamente já
													// estamos removendo o primeiro nodo
			}
		}
	}

}

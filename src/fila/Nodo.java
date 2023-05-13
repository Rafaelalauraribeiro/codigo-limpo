package fila;

public class Nodo {
	private int valor;
	private Nodo proximo;
	
	public Nodo() {
		this.valor=0;
		this.proximo=null;
	}
	public Nodo( int valorNodo) {
		this.valor=valorNodo;
		this.proximo=null;
		
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Nodo getProximoDaFila() {
		return proximo;
	}
	public void setProximoDaFila(Nodo proximo) {
		this.proximo = proximo;
	}

}


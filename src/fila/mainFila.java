package fila;

public class mainFila {
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.inserirNodoNoFinal(1);
		fila.inserirNodoNoFinal(2);
		fila.inserirNodoNoFinal(3);
		fila.removerNodoDoInicio();
		fila.imprime();

		
		
	}
}

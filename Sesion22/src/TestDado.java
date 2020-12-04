
public class TestDado {

	public static void main(String[] args) {
		
		int [] vector = {0,0,0,0,0,0};			//ÍNDICE DEL VECTOR = CARA-1
												//VALOR DEL ELEMENTO = Nº DE CARAS
		
		for (int i=0;i<1000;i++) {				//REPETIR 1000 VECES
			int cara=Dado.lanza();				//NUEVO LANZAMIENTO
			System.out.println(cara);			//IMPRIMIR CARA
			
			vector[cara-1]=vector[cara-1]+1;				//AÑADIR EN VECTOR
		}
		
		System.out.println();			//SEPARADOR
		
		for (int i=0;i<vector.length;i++) {					//PARA TANTAS CARAS
			System.out.printf("Número de caras %d: ",i+1);			//OUTPUT
			System.out.println(vector[i]);			//OUTPUT
		}
	}

}

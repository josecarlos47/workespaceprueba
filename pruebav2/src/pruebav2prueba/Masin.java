package pruebav2prueba;

public class Masin {
public static void main(String[] args) {
	int i = 1;
	int contador = 0;
	int siete;
	
	int[] lista = {1,2,3,4,5,1,2,3,7,7,7,5,34,5};
	
	for (int j = 0; j < lista.length; j++) {
		if (lista[j]==7) {
			contador++;
		}
	}
	
	System.out.println("El contador de 7 es igual a "+contador);
	System.out.println(contador);
	
}
}

package ponyExpress;

public class PonyExpress {

	public static int caballos(int[] distancias) {
		int caballo = 1;
		int distanciaRecorrida = 0;
		distanciasValidas(distancias);
		for (int dist : distancias) {
			if (distanciaRecorrida + dist > 100) {
				caballo++;
				distanciaRecorrida = dist;
			} else {
				distanciaRecorrida += dist;
			}
		}

		return caballo;
	}

	// Este método lo hice para evitar que ingresen distancias incorrectas

	public static void distanciasValidas(int[] distancias) {
		for (int dist : distancias) {
			if (dist < 0 || dist > 100) {
				throw new Error("Las distancias ingresadas deben ser mayores que cero y menores o iguales que cien");
			}
		}

	}

}

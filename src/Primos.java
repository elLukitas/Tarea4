public class Primos {
    // Generar números primos de 1 a max
    public static int[] generarPrimos (int numeroMaximo) {

        if (numeroMaximo >= 2) {
            // Declaraciones
            int tamanoArray = numeroMaximo + 1; // Tamaño del array
            boolean[] esPrimo = new boolean[tamanoArray];
            // Inicializar el array
            extracted(tamanoArray, esPrimo);
            // ¿Cuántos primos hay?
            int cuenta = calculaTamano(tamanoArray, esPrimo);
            // Rellenar el vector de números primos
            return getPrimos(tamanoArray, esPrimo, cuenta);
        }
        else { // max < 2
            return new int[0];
            // Vector vacío
        }
    }

    private static int[] getPrimos(int tamanoArray, boolean[] esPrimo, int cuenta) {
        int j;
        int i;
        int[] primos = new int[cuenta];
        for (i=0, j=0; i< tamanoArray; i++) {
            if (esPrimo[i]) {
                primos[j++] = i;
            }
        }
        return primos;
    }

    private static int calculaTamano(int tamanoArray, boolean[] esPrimo) {
        int i;
        int cuenta = 0;
        for (i=0; i< tamanoArray; i++) {
            if (esPrimo[i]) {
                cuenta++;
            }
        }
        return cuenta;
    }

    private static void extracted(int tamanoArray, boolean[] esPrimo) {
        int j;
        int i;
        for (i=0; i< tamanoArray; i++) {
            esPrimo[i] = true;
        }
        // Eliminar el 0 y el 1, que no son primos
        esPrimo[0] = esPrimo[1] = false;
        // Criba
        for (i=2; i<Math.sqrt(tamanoArray)+1; i++) {
            if (esPrimo[i]) {
                // Eliminar los múltiplos de i
                for (j = 2 * i; j < tamanoArray; j += i) {
                    esPrimo[j] = false;
                }
            }
        }
    }
}
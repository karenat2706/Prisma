package actividades_ets.UT4.documentacion_de_codigo;
/**
 * Clase principal que demuestra la composición de un Cono con una base Circular
 * Crea 5 instancias de Cono con valores aleatorios y muestra sus atributos
 * comentario para git hub
 */
public class ProgramaComposicionCono {

    /**
     * @param datos El objeto a imprimir
     */
    private static void imprimir(Object datos) {
        System.out.println(datos);
    }

    /**
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        java.util.Random aleatorio = new java.util.Random();

        for (int i = 1; i <= 5; i++) {
            int radio = aleatorio.nextInt(9) + 1; // Radio entre 1 y 9
            Cono cono = new Cono(0, 0, radio, i, "Azul");
            cono.imprimir();
        }
    }
}

package actividades_ets.UT4.diseño_modular;

/**
 * Clase Prisma que representa un prisma de base triangular equilátera
 * comentario para git hub
 */
public class Prisma {
    private int base;
    private int altura;

    /**
     * Constructor que crea un prisma con las dimensiones especificadas
     * @param base Longitud de la base del triángulo equilátero (debe ser > 0)
     * @param altura Altura del prisma (debe ser > 0)
     */
    public Prisma(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Calcula la altura del triángulo equilátero de la base
     * @return Altura del triángulo usando la aproximación (√3/2)*base
     */
    public int alturaTriangulo() {
        return (1732 * base) / 2000;  // Aproximación de (√3/2)*base
    }

    /**
     * Calcula el área de la base triangular
     * @return Área de la base del prisma
     */
    public int areaBase() {
        return (base * alturaTriangulo()) / 2;
    }

    /**
     * Calcula el perímetro de la base triangular
     * @return Perímetro del triángulo equilátero
     */
    public int perimetro() {
        return 3 * base;
    }

    /**
     * Calcula el área lateral del prisma
     * @return Área lateral del prisma (perímetro * altura)
     */
    public int areaLateral() {
        return perimetro() * altura;
    }

    /**
     * Calcula el área total del prisma
     * @return Área total (2 * área base + área lateral)
     */
    public int areaTotal() {
        return 2 * areaBase() + areaLateral();
    }

    /**
     * Obtiene la longitud de la base del triángulo
     * @return Longitud de la base del triángulo
     */
    public int getBase() {
        return base;
    }

    /**
     * Obtiene la altura del prisma
     * @return Altura del prisma
     */
    public int getAltura() {
        return altura;
    }
}
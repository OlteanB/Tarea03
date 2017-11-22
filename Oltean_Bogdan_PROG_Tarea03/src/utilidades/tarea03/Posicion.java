package utilidades.tarea03;

/**
 * Clase que determina la posición del rey
 * 
 * @author bogdan
 */
public class Posicion {

    private int fila;
    private char columna;

    
    /**
     * Constructor por defecto
     */
    public Posicion() {
        fila = 1;
        columna = 'a';
    }
    
    /**
     * Costructor que recibe dos parametros y controla que los valores introducidos son correctos
     * @param fila
     * @param columna 
     */
    public Posicion(int fila, char columna) {
        this.fila = fila;
        this.columna = columna;
        if (fila > 0 && fila < 9) {
            this.fila = fila;
        } else {
            System.out.println("Fila no correcta");
            this.fila = 1;
        }
        if (columna >= 'a' && columna <= 'h') {
            this.columna = columna;
        } else {
            System.out.println("Columna no correcta");
            this.columna = 'a';
        }
        
    }
    
    /**
     * 
     * @return fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * Setter que recibe y controla los errores de la fila
     * @param fila 
     */
    public void setFila(int fila) {
        this.fila = fila;
        if (fila > 0 && fila < 9) {
            this.fila = fila;
        } else {
            System.out.println("Fila no correcta");
            this.fila = 1;
        }
    }

    /**
     * 
     * @return columa
     */
    public char getColumna() {
        return columna;
    }

    /**
     * Setter que recibe y controla los errores de la columna
     * @param columna 
     */
    public void setColumna(char columna) {
        this.columna = columna;
        if (columna >= 'a' && columna <= 'h') {
            this.columna = columna;
        } else {
            System.out.println("Columna no correcta");
            this.columna = 'a';
        }
    }

    /**
     * Metodo toString que devuelve la posición del rey por fila y columna
     * @return fila
     * @return columna
     */
    @Override
    public String toString() {
        return "Posicion [fila=" + fila + ", columna=" + columna + "]";
    }

}

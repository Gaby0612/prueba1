
package examen;

public class Dispositivo {
    private String nombre;
    private String codigo;
    private String marca;
    private int posicion;

    public Dispositivo(String nombre, String codigo, String marca) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.marca = marca;
    }

    /**
     * @return the nombre
     */
    protected String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the codigo
     */
    protected String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    protected void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the marca
     */
    protected String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    protected void setMarca(String marca) {
        this.marca = marca;
    }
    
     public Object[] toArray() {
        return new Object[]{getPosicion(), nombre, codigo,marca};
    
}

    /**
     * @return the posicion
     */
    protected int getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    protected void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}

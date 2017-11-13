
package examen;

public class Celular extends Dispositivo{
    private String modelo;
    private String color;

    public Celular(String modelo, String color, String nombre, String codigo, String marca) {
        super(nombre, codigo, marca);
        this.modelo = modelo;
        this.color = color;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    
}


package examen;

public class Lapto extends Dispositivo{
    private int modeloIntelCore;
    private String modeloPantalla;

    public Lapto(int modeloIntelCore, String modeloPantalla, String nombre, String codigo, String marca) {
        super(nombre, codigo, marca);
        this.modeloIntelCore = modeloIntelCore;
        this.modeloPantalla = modeloPantalla;
    }

    /**
     * @return the modeloIntelCore
     */
    public int getModeloIntelCore() {
        return modeloIntelCore;
    }

    /**
     * @param modeloIntelCore the modeloIntelCore to set
     */
    public void setModeloIntelCore(int modeloIntelCore) {
        this.modeloIntelCore = modeloIntelCore;
    }

    /**
     * @return the modeloPantalla
     */
    public String getModeloPantalla() {
        return modeloPantalla;
    }

    /**
     * @param modeloPantalla the modeloPantalla to set
     */
    public void setModeloPantalla(String modeloPantalla) {
        this.modeloPantalla = modeloPantalla;
    }
    
    
}

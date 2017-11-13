
package examen;

public class ComputadoraEscritorio extends Dispositivo{
    private int  tamanioRam;
    private int numAccesorios;

    public ComputadoraEscritorio(int tamanioRam, int numAccesorios, String nombre, String codigo, String marca) {
        super(nombre, codigo, marca);
        this.tamanioRam = tamanioRam;
        this.numAccesorios = numAccesorios;
    }

    /**
     * @return the tamanioRam
     */
    public int getTamanioRam() {
        return tamanioRam;
    }

    /**
     * @param tamanioRam the tamanioRam to set
     */
    public void setTamanioRam(int tamanioRam) {
        this.tamanioRam = tamanioRam;
    }

    /**
     * @return the numAccesorios
     */
    public int getNumAccesorios() {
        return numAccesorios;
    }

    /**
     * @param numAccesorios the numAccesorios to set
     */
    public void setNumAccesorios(int numAccesorios) {
        this.numAccesorios = numAccesorios;
    }
    
    
    
}

package exceociones;

public class Excepcion extends Exception {

    public Excepcion(String mensaje) {
        super(mensaje);
    }

    public static void rangohora(String dia, int hora) throws Exception, NumberFormatException {
        if (!((hora >= 9) && (hora <= 18))) {
            throw new Exception("Hora fuera de rango...se permite la hora entre 9am y 18pm");
        }
        if(dia.equals("lunes,martes,miecoles,jueves,viernes")){
            
        }
    }
    
}

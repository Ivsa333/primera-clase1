public class Televisor {
    private String nombreDueño;
    private int numeroCanalActivo;
    private boolean televisorEncendido;
    
    public Televisor(String nombreDelDueño, int queNumeroCanalActivo, boolean encenderTelevisor) {
        nombreDueño = nombreDelDueño;
        numeroCanalActivo = queNumeroCanalActivo;
        televisorEncendido = encenderTelevisor;
    }
    
    public String getNombreDueño() {
        return nombreDueño;
    }
    
    public int getNumeroCanalActivo() {
        return numeroCanalActivo;
    }
    
    public boolean getTelevisorEncendido() {
        return televisorEncendido;
    }
}
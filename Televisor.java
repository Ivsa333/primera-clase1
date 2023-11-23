public class Televisor {
    private String nombreDue�o;
    private int numeroCanalActivo;
    private boolean televisorEncendido;
    
    public Televisor(String nombreDelDue�o, int queNumeroCanalActivo, boolean encenderTelevisor) {
        nombreDue�o = nombreDelDue�o;
        numeroCanalActivo = queNumeroCanalActivo;
        televisorEncendido = encenderTelevisor;
    }
    
    public String getNombreDue�o() {
        return nombreDue�o;
    }
    
    public int getNumeroCanalActivo() {
        return numeroCanalActivo;
    }
    
    public boolean getTelevisorEncendido() {
        return televisorEncendido;
    }
}
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
    
    public void setNombreDueño(String newNombre) {
        nombreDueño = newNombre;
    }
    
    public void numeroCanalActivo(int cambioCanal) {
        numeroCanalActivo = cambioCanal;
    }
    
    public void televisorEncendido(boolean televisorApagado) {
        if (televisorEncendido = true) {
            televisorApagado = false;
        }
        else {
            televisorEncendido = false;
            televisorApagado = true;
        }
    }
    
    public void imprimirEstado() {
        System.out.println("Dueño: " + nombreDueño);
        System.out.println("Numero del canal: " + numeroCanalActivo);
        System.out.println("Televisor encendido: " + televisorEncendido);
    }
    public String getDatosEstado() {
        return ("Dueño: " + nombreDueño + " |Numero del canal: " + "" + numeroCanalActivo + " |Encendido: " + "" + televisorEncendido);
    }
}
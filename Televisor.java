public class Televisor {
    private String nombreDue�o;
    private int numeroCanalActivo;
    private boolean televisorEncendido;
    private boolean tieneDue�o;
    public Televisor(String nombreDelDue�o, int queNumeroCanalActivo, boolean encenderTelevisor) {
        nombreDue�o = nombreDelDue�o;
        numeroCanalActivo = queNumeroCanalActivo;
        televisorEncendido = encenderTelevisor;
        tieneDue�o = true;
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
    
    public void setNombreDue�o(String newNombre) {
        nombreDue�o = newNombre;
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
        System.out.println("Due�o: " + nombreDue�o);
        System.out.println("Numero del canal: " + numeroCanalActivo);
        System.out.println("Televisor encendido: " + televisorEncendido);
        System.out.println("Tiene un due�o: " + tieneDue�o);
    }
    
    public String getDatosEstado() {
        return ("Due�o: " + nombreDue�o + " |Numero del canal: " + "" + numeroCanalActivo + " |Encendido: " + "" + televisorEncendido + " |Tiene un due�o: " + "" + tieneDue�o);
    }
    
    public void setTieneDue�o(boolean hayUnDue�o) {
        tieneDue�o = hayUnDue�o;
    }
    
    public boolean getTieneDue�o(){
        return tieneDue�o;
    }
}
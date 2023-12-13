public class Televisor {
    private String nombreDueno;
    private int numeroCanalActivo;
    private boolean televisorEncendido;
    private boolean tieneDueno;
    public Televisor(String nombreDelDueno, int queNumeroCanalActivo) {
        nombreDueno = nombreDelDueno;
        numeroCanalActivo = queNumeroCanalActivo;
        televisorEncendido = true;
        tieneDueno = true;
    }
    
    public String getNombreDueno() {
        return nombreDueno;
    }
    
        public String getDatosEstado() {
        return ("Dueno: " + nombreDueno + " |Numero del canal: " + "" + numeroCanalActivo + " |Encendido: " + "" + (televisorEncendido ? "Si" : "No") + " |Tiene un dueno: " + "" + (tieneDueno? "Si" : "No"));
    }
    
    public int getNumeroCanalActivo() {
        return numeroCanalActivo;
    }
    
    public boolean getTelevisorEncendido() {
        return televisorEncendido;
    }
    
    public void setNombreDueno(String newNombre) {
        nombreDueno = newNombre;
    }
    
    public void numeroCanalActivo(int cambioCanal) {
        numeroCanalActivo = numeroCanalActivo + cambioCanal;
    }
    
    public void televisorEncendido() {
        televisorEncendido = !televisorEncendido;
    }
    
    public void setTieneDueno() {
        tieneDueno = !tieneDueno;
    }
    
    public boolean getTieneDueno(){
        return tieneDueno;
    }
    
        public void imprimirEstado() {
        System.out.println("Dueno: " + nombreDueno + " |Numero del canal: " + numeroCanalActivo + " |Televisor encendido: " + (televisorEncendido ? "Si" : "No") + " |Tiene un dueno: " + (tieneDueno? "Si" : "No"));
    }
}
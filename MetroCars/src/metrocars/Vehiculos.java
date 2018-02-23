package metrocars;

public class Vehiculos {
    
    private int precio;
    private int serial;
    private String nombre;
    private boolean disp;
    private String tipo;
    
    public Vehiculos(int precio, int serial, String nombre, boolean disp, String tipo){
        
        this.precio = precio;
        this.serial = serial;
        this.nombre = nombre;
        this.disp = disp;
        this.tipo = tipo;
    }
    
    public Vehiculos(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public void desplegar(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println(" Tipo: "+this.tipo);
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getSerial() {
        return serial;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setDisp(boolean disp) {
        this.disp = disp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDisp() {
        return disp;
    }
    
    
    
}

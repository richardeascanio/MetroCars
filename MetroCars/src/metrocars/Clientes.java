package metrocars;

public class Clientes {
    
    private String nombre;
    private int telefono;
    private int cedula;
    private PilaVehiculos carrito;
    

    public Clientes(String nombre, int telefono, int cedula, PilaVehiculos carrito) {
        
        this.nombre = nombre;
        this.telefono = telefono;
        this.cedula = cedula;
        this.carrito = carrito;
    }

    public int getCedula() {
        return cedula;
    }

    public PilaVehiculos getCarrito() {
        return carrito;
    }

    public void setCarrito(PilaVehiculos carrito) {
        this.carrito = carrito;
    }
    
    

    public String getNombre() {
        return nombre;
    }
    
    
}

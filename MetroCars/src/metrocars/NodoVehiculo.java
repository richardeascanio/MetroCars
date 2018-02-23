package metrocars;

public class NodoVehiculo { //Clase Nodo de vehiculos, con todas las caracteirsticas que tiene un vehiculo
    
    
    //Atributos 
    
    private NodoVehiculo proximo;
    private Vehiculos vehiculo;

    public NodoVehiculo(Vehiculos vehiculo){
        //Constructor con las variables 
        this.vehiculo = vehiculo;
        this.proximo = null;
    }
 
     public NodoVehiculo getProximo() {
        
        return this.proximo;
    }

    public void setProximo(NodoVehiculo proximo) {
        
        this.proximo = proximo;
    }

    public Vehiculos getVehiculos() {
        return vehiculo;
    }

    public void presentar(NodoVehiculo aux){ //Presentamos el modelo a disposicion
        
        System.out.println("El vehiculo es de tipo: "+this.vehiculo.getTipo());
        System.out.println("Nombre: "+this.vehiculo.getNombre());
        System.out.println("Precio: "+this.vehiculo.getPrecio());
        System.out.println("Serial: "+this.vehiculo.getSerial());
        if(aux.getVehiculos().isDisp())
            System.out.println("El vehiculo se encuentra disponible");
        else
           System.out.println("El vehiculo no se encuentra disponible"); 
    }
    
    
}

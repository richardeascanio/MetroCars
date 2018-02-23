package metrocars;

public class PilaVehiculos extends ListaVehiculos{
    
    public PilaVehiculos(){
        
        super();
    }
    
    public void push(NodoVehiculo nuevo){
        
        insertarNodo(nuevo);
    }
    
    public NodoVehiculo pop(){
        
        return eliminarPrimero();
    }
    
    public NodoVehiculo peek(){
        
        NodoVehiculo temp;
        NodoVehiculo dato;
        temp = getCabeza();
        dato= temp;
        return dato;
    }
    
    public void imprimirCarrito(PilaVehiculos pila){
        
        NodoVehiculo aux = pila.getCabeza();
        PilaVehiculos temp = new PilaVehiculos();
        while(aux!=null){
            pila.peek().presentar(aux);
            temp.push(pila.pop());
            aux = pila.peek();
        }
        NodoVehiculo aux1 = temp.getCabeza();
        
        while(aux1!=null){
            pila.push(temp.pop());
            aux1 = temp.peek();
        } 
    }
}

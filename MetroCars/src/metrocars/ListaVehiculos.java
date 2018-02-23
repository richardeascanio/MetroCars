package metrocars;

public class ListaVehiculos { //Clase donde contiene la lista de Vehiculos
    
    protected NodoVehiculo cabeza;

    public ListaVehiculos() {
        
        this.cabeza=null;
    }
    
    public ListaVehiculos(NodoVehiculo cabeza){
        this.cabeza = cabeza;
    }
    
    public void insertarNodo(NodoVehiculo nodo){
        
        if(estaVacia()){
            
            this.cabeza = nodo;
        }
        else{
            nodo.setProximo(this.cabeza);
            this.cabeza= nodo;
        }
    }
    
    public void insertarUltimo(NodoVehiculo nuevoNodo){
        
        if(this.estaVacia()){
            
            this.cabeza = nuevoNodo;
            
        }else{
            
            NodoVehiculo aux = this.cabeza;
            
            while(aux.getProximo()!= null){
                
                aux = aux.getProximo();
            
            }
            
            aux.setProximo(nuevoNodo);
            
        }
        
    }
    
    public NodoVehiculo eliminarPrimero(){
        
        if(!estaVacia()){
            NodoVehiculo temp = this.cabeza;
            this.cabeza= this.cabeza.getProximo();
            temp.setProximo(null);
            return temp;
        }
        else{
            return null;
        }
    }
    
    public void ordenarPrecio(){
        
        NodoVehiculo aux, mayor;
        
        ListaVehiculos lista = new ListaVehiculos();
        ListaVehiculos temp = new ListaVehiculos();
        
        aux = mayor = this.cabeza;
        
        while(aux!=null){
            temp.insertarUltimo(new NodoVehiculo(aux.getVehiculos()));
            aux = aux.getProximo();
        }
        
        while(!temp.estaVacia()){
            aux = mayor = temp.cabeza;
        }
        
        while(aux!=null){
            if(aux.getVehiculos().getPrecio()<mayor.getVehiculos().getPrecio()){
                mayor = aux;
            }
            aux = aux.getProximo();
        }
        lista.insertarUltimo(new NodoVehiculo(mayor.getVehiculos()));
        aux = temp.cabeza;
        
        if(mayor==aux){
            temp.eliminarPrimero();
        }
        else{
            while(aux.getProximo()!=mayor){
                aux = aux.getProximo();
            }
            aux.setProximo(mayor.getProximo());
            mayor.setProximo(null);
        }
    }
    
    public NodoVehiculo buscarSerial(int serial, NodoVehiculo aux){

        if(!estaVacia()){
            while(aux!=null){
                if(aux.getVehiculos().getSerial()==serial){
                    return aux;
                }
                else{
                    aux = aux.getProximo();
                }
            }
        }
        return null;
    }
    
    public NodoVehiculo getCabeza() {
        return cabeza;
    }
    
    public boolean estaVacia() {
        
        return this.cabeza == null;
    }
    
    public void mostrar (){ //Muestra la lista de vehiculos
   
       NodoVehiculo aux = this.cabeza;
        
        while (aux != null){
            aux.presentar(aux);
            aux = aux.getProximo();
        }
    }
}

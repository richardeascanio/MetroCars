package metrocars;

public class ABBClientes{ //Clase de Arbol de clientes 
    
    //Atributos
    
    private NodoCliente raiz;
    
    
    public ABBClientes() {
        
    }
    
    public boolean estaVacio() { //Metodo que revisa si el arbol de clientes esta vacio
        
        return this.raiz == null;
    } 
    
    public void recorrerPreOrden(NodoCliente aux) { //Arbol de clientes, presenta a las personas que estan en el arbol
        
        if(aux != null){
            
            aux.presentar();
            
            this.recorrerPreOrden(aux.getHijoDer());
            
            this.recorrerPreOrden(aux.getHijoIzq()); 
            
        }
        
    }
     
    public void insertarNodo(NodoCliente nodo, NodoCliente aux){
        
        if(estaVacio()){
            
            this.raiz = nodo;
        }
        else if (nodo.getCliente().getCedula()< aux.getCliente().getCedula()) {
            
            if (aux.getHijoIzq() == null) {
                
		aux.setHijoIzq(nodo);
                
            }else{
                
                this.insertarNodo(aux.getHijoIzq(), nodo);
            }
            
        }else if (nodo.getCliente().getCedula() > aux.getCliente().getCedula()) {
            
            if (aux.getHijoDer() == null) {
                
		aux.setHijoDer(nodo);
                
            }else{
                
		this.insertarNodo(aux.getHijoDer(), nodo);
            }
        }else{
            
            System.out.println("Este cliente ya se encuentra registrado en el sistema");
        }   
    } 
     
    public NodoCliente getCliente(int ced, NodoCliente aux){
        
        if (aux != null) {
            
            if (ced < aux.getCliente().getCedula()) {

                return this.getCliente(ced, aux.getHijoIzq());

            }else if (ced > aux.getCliente().getCedula()) {

                return this.getCliente(ced, aux.getHijoDer());

            }else {
                
                return aux;
            }
        }
        System.out.println("El cliente no se encuentra registrado en el sistema");
        return null;
    }

    public NodoCliente getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoCliente raiz) {
        this.raiz = raiz;
    }
}

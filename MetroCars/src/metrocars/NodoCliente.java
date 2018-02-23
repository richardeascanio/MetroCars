package metrocars;


public class NodoCliente { //Clase Nodo de clientes con todas las caracteristicas que tiene un cliente
    
    //Atributos
    
    private Clientes cliente;
    private NodoCliente hijoDer;
    private NodoCliente hijoIzq;

    public NodoCliente(Clientes cliente) { //Contructor 
        this.cliente = cliente;
        this.hijoDer = null;
        this.hijoIzq = null;
    }

    public Clientes getCliente() {
        return cliente;
    }
    
    public NodoCliente getHijoDer() {
        return hijoDer;
    }

    public NodoCliente getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoDer(NodoCliente hijoDer) {
        this.hijoDer = hijoDer;
    }

    public void setHijoIzq(NodoCliente hijoIzq) {
        this.hijoIzq = hijoIzq;
    }
    
    public void presentar(){
        
    }
}

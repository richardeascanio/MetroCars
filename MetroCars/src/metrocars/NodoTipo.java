package metrocars;


public class NodoTipo {
    
    private NodoTipo proximo;
    private String tipo;
    
    public NodoTipo(String tipo){
        this.proximo = null;
        this.tipo = tipo;
    }
    
    public void presentar(NodoTipo aux){
        
        System.out.println("- "+aux.getTipo());
    }

    public String getTipo() {
        return tipo;
    }

    public NodoTipo getProximo() {
        return proximo;
    }

    public void setProximo(NodoTipo proximo) {
        this.proximo = proximo;
    }
    
    
}

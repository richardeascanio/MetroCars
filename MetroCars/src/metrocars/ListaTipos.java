package metrocars;

public class ListaTipos {
    
    private NodoTipo cabeza;
    
    public ListaTipos (){
        
        this.cabeza = null;
    }
    
    public void insertarTipo(NodoTipo aux){

        if(this.cabeza==null){
            
            this.cabeza=aux;
        }
        else{
            NodoTipo temp = this.cabeza;
            while(temp.getProximo()!=null){
                temp = temp.getProximo();
            }
            temp.setProximo(aux);
        }
    }
    
    public void imprimirTipos(){
        
        NodoTipo aux = this.cabeza;
        while(aux!=null){
            
            aux.presentar(aux);
            aux = aux.getProximo();
        }
    }
}

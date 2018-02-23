package metrocars;

import java.util.Scanner;

public class Empleados{ //Clase de clientes donde se podran hacer todas las operaciones de clientes
    
    Scanner sc = new Scanner(System.in);  
    
    public Empleados() {
        
    }
    
    public void agregarVehiculo(ListaVehiculos listav, ListaTipos listat, Archivo a){ //Agrega Vehiculos al catalogo de vehiculos
         
         System.out.println("Ingrese el nombre del tipo de vehiculo");
         listat.imprimirTipos();
         String tip = sc.next();
         
         System.out.print("Ingrese el nombre del modelo del vehiculo nuevo: ");
         String mod = sc.next();
         
         Vehiculos v = new Vehiculos(mod, tip);
         a.escribirVehiculo(v);
         System.out.println("Se agrego un nuevo vehiculo al catalogo");
    }
    
    public void agregarTipo(ListaTipos listat){
        
        System.out.println("Ingrese el nombre del tipo de vehiculo que desea agregar");
        String tipo = sc.next();
        NodoTipo nodo = new NodoTipo(tipo);
        listat.insertarTipo(nodo);
        
        System.out.println("Se agrego un nuevo tipo de vehiculo");
    }
     
    public void imprimirListaV(ListaVehiculos listav){
         
         listav.mostrar();
    }

    public void registrar(ABBClientes abbc){ //Registra un cliente
         
        System.out.print("Ingrese el nombre de la persona que desea registar: ");
        String nom = sc.next();
         
        System.out.print("Ingrese el numero de telefono de la persona que desea registrar: ");
        int tel = sc.nextInt();
         
        System.out.println("Ingrese el numero de cedula de la persona que desea ingresar: ");
        int ced = sc.nextInt();
        
        Clientes cliente = new Clientes(nom, tel, ced, null);
        NodoCliente nodoC = new NodoCliente(cliente);
        abbc.insertarNodo(nodoC, abbc.getRaiz());
        System.out.println("Se ha registrado el cliente exitosamente");
    }
    
    public void ordenarMayorMenor(ListaVehiculos listav){
        System.out.println("Vehiculos ordenados por precio de mayor a menor: ");
        listav.ordenarPrecio();
        
    }
    
    public void mostrarCarrito(Clientes cli){
        System.out.println("Carrito del cliente: ");
        cli.getCarrito().imprimirCarrito(cli.getCarrito());
    }

    public void eliminarDelCarrito(NodoCliente nodo){
        
        nodo.getCliente().getCarrito().eliminarPrimero();
    }
}
    


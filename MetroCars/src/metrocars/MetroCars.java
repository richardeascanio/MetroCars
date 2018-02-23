package metrocars;

//Prueba GitHub

import java.util.Scanner;

public class MetroCars {
    
    public static void menu(){
        
        System.out.println("\n\nIngrese el numero de la accion que desea hacer: ");
        System.out.println("1. Crear un vehiculo nuevo+");
        System.out.println("2. Crear un tipo de vehiculo+");
        System.out.println("3. Registrar nuevos clientes+");
        System.out.println("4. Agregar un vehiculo nuevo al carrito del cliente+");
        System.out.println("5. Ver listado de vehiculos disponibles+");
        System.out.println("6. Filtrar vehiculos por tipo");
        System.out.println("7. Ordenar vehiculos por precio");
        System.out.println("8. Ordenar vehiculos por nombre");
        System.out.println("9. Modificar propiedades del vehiculo+");
        System.out.println("10. Eliminar vehiculos del archivo de texto+");
        System.out.println("11. Ver el carrito del cliente+");
        System.out.println("12. Ver los modelos mas comprados");
        System.out.println("13. Ver las ganancias totales de la empresa");
        System.out.println("14. Terminar pedido");
        System.out.println("0. Salir\n\n");
    }

    public static void main(String[] args) { //Main del programa
        
        Archivo a = new Archivo();
        ListaVehiculos listav = new ListaVehiculos();
        Empleados emp = new Empleados();
        ABBClientes abbc = new ABBClientes();
        ListaTipos listat = new ListaTipos();
        NodoTipo carro = new NodoTipo("Carro");
        NodoTipo camioneta = new NodoTipo("Camioneta");
        NodoTipo moto = new NodoTipo("Motocicleta");
        
        listat.insertarTipo(carro);
        listat.insertarTipo(camioneta);
        listat.insertarTipo(moto);
        
        
        Scanner sc = new Scanner(System.in);
        menu();
        int opc = sc.nextInt();
        
        while(opc!=0){
            
            switch (opc){
                
                case 0: {
                    System.out.println("Salir");
                    break;
                }
                case 1: {
                    emp.agregarVehiculo(listav, listat, a);
                    
                    break;
                }
                case 2: {
                    emp.agregarTipo(listat);
                    break;
                }
                case 3: {
                    emp.registrar(abbc);
                    break;
                }
                case 4: {
                    System.out.println("Ingrese la cedula del cliente: ");
                    int ced = sc.nextInt();
                    Clientes c = abbc.getCliente(ced, abbc.getRaiz()).getCliente();
                    String ce = c.getNombre();
                    System.out.println("el nombre del cliente es "+ce);
                    System.out.println("Ingrese el serial del vehiculo que desea agregar al carrito del cliente: ");
                    int serial = sc.nextInt();
                    
                    NodoVehiculo v = listav.buscarSerial(serial, listav.getCabeza());
                    System.out.println("El modelo del v es: "+v.getVehiculos().getNombre());
                    
                    if(c.getCarrito()== null){
                        PilaVehiculos car = new PilaVehiculos();
                        c.setCarrito(car);
                    }
                    
                    c.getCarrito().push(v);
                    System.out.println("Se ha agregado el vehiculo de serial: "+c.getCarrito().peek().getVehiculos().getSerial());
                    break;
                }
                case 5:{
                    System.out.println("Lista de vehiculos: ");
                    emp.imprimirListaV(listav);
                    break;
                }
                case 6: {
                    
                    break;
                }
                case 7: {
                    System.out.println("Ordenando los vehiculos disponibles por el precio queda: ");
                    listav.ordenarPrecio();
                    emp.imprimirListaV(listav);
                    break;
                }
                case 9: {
                    System.out.println("Indique el serial del vehiculo");
                    int se = sc.nextInt();
                    NodoVehiculo v = listav.buscarSerial(se, listav.getCabeza());
                    System.out.println("1. Cambiar el modelo, 2. Cambiar el precio, 3. Cambiar el tipo, 4. Cambiar disponibilidad");
                    int op = sc.nextInt();
                    if(op==1){
                        System.out.println("Ingrese el nuevo modelo");
                        String mod = sc.next();
                        v.getVehiculos().setNombre(mod);
                    }
                    else{
                        if(op==2){
                            System.out.println("Ingrese el nuevo precio");
                            int pre = sc.nextInt();
                            v.getVehiculos().setPrecio(pre);
                        }
                        else{
                            if(op==3){
                                System.out.println("Ingrese el nuevo tipo");
                                String tip = sc.next();
                                v.getVehiculos().setTipo(tip);
                            }
                            else{
                                if(v.getVehiculos().isDisp()){
                                    v.getVehiculos().setDisp(false);
                                    System.out.println("Ahora el vehiculo no esta disponible");
                                }
                                else{
                                    v.getVehiculos().setDisp(true);
                                    System.out.println("Ahora el vehiculo esta disponible");
                                }
                            }
                        }
                    }
                    break;
                }
                case 10: {
                    
                    System.out.println("Ingrese en nombre del vehiculo que quiere eliminar");
                    String nom = sc.next();
                    a.eliminar(nom);
                    break;
                }
                case 11: {
                    System.out.println("Ingrese la cedula del cliente que tiene el carrito: ");
                    int ced = sc.nextInt();
                    Clientes c = abbc.getCliente(ced, abbc.getRaiz()).getCliente();
                    
                    emp.mostrarCarrito(c);
                    break;
                }
                default:
                    System.out.println("Opcion Invalida");
            }
            menu();
            opc = sc.nextInt();
        }  
    }  
}

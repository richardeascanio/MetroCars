package metrocars;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Archivo {
    
    public void escribirVehiculo(Vehiculos vehiculo){
        try{
            File f = new File("agenda.txt");
            FileWriter fw;
            BufferedWriter bw;
            if(f.exists() && f.length()!=0){
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(vehiculo.getNombre()+"/"+vehiculo.getTipo());
            }
            else{
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write(vehiculo.getNombre()+"/"+vehiculo.getTipo());
            }
            bw.close();
            fw.close();
        }
        catch(Exception e){
                System.out.println(e);
        }
    
    }
    
    public void eliminar(String nombre){
        
        File f = new File("agenda.txt");
        try {
            if(f.exists()){
            FileReader fr  = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            int numlineas=0;
            while((linea = br.readLine()) != null){
                numlineas++;
                
            }
            String contactos [] = new String [numlineas];
            br = new BufferedReader(new FileReader(f));
            int i=0;
            while((linea = br.readLine())!= null){
                
                contactos[i] = linea;
                i++;
            }
            br.close();
            fr.close();
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            boolean bandera = false;
            boolean primera = true;
            for(int j=0;j<contactos.length;j++){
                String l []= contactos[j].split("/");
                if(l[0].equals(nombre)){
                    bandera = true;
                    System.out.println("Elemento eliminado");
                }
                else{
                    if(primera==true){
                        bw.write(contactos[j]);
                        primera=false;
                    }
                    else{
                        bw.newLine();
                        bw.write(contactos[j]);
                    }
                }
            }
            if(bandera==false){
                System.out.println("No se encontro el vehiculo");
            }
            bw.close();
            fw.close();
            if(numlineas==1 && bandera==true){
                f.delete();
            }
        }
        else
            System.out.println("No hay vehiculos por eliminar");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
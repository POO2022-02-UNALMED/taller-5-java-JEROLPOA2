package gestion;
import java.util.ArrayList;

public class Zoologico{

    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;

    public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas){
        
        this. nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = zonas;
    }

    public Zoologico(){
        
        this. nombre = "";
        this.ubicacion = "";
        this.zonas = null;
    }

    public void agregarZonas(Zona zona){

        if (zona != null){
            this.zonas.add(zona);
        }
        
    }
    
    public int cantidadTotalAnimales(){

        int ca = 0;
        
        for(int i = 0; i < zonas.size(); i++){

            ca += zonas.get(i).cantidadAnimales();
        }

        return ca;
    }

    public String getNombre(){
        return nombre;
    }
    public String getUbicacion(){
        return ubicacion;
    }
    public ArrayList<Zona> getZonas(){
        return zonas;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setUubicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
    public void setZonas(ArrayList<Zona> zonas){
        this.zonas = zonas;
    }

}
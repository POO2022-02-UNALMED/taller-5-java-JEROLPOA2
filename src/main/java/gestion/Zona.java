package gestion;
import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {

    private String nombre;
    private ArrayList<Zoologico> zoo;
    private ArrayList<Animal> animales;

    public Zona(String nombre, ArrayList<Zoologico> zoo, ArrayList<Animal> animales){
        
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = animales;
    }

    public Zona(){
        
        this.nombre = "";
        this.zoo = null;
        this.animales = null;
    }

    public void agregarAnimales(Animal animal){
        
        if(animal != null){
            this.animales.add(animal);
        }
        
    }

    public int cantidadAnimales(){
        return animales.size();
    }

    public String getNombre(){
        return nombre;
    }
    public ArrayList<Zoologico> getZoo(){
        return zoo;
    }
    public ArrayList<Animal> getAnimales(){
        return animales;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setZoo(ArrayList<Zoologico> zoo){
        this.zoo = zoo;
    }
    public void setAnimales(ArrayList<Animal> animales){
        this.animales = animales;
    }
}

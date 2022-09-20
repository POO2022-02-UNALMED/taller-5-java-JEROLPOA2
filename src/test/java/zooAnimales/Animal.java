package zooAnimales;

import java.util.ArrayList;


import gestion.Zona;

public class Animal {
    
    private static int totalAnimales = 0;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private static Zona zona;

    public Animal(String nombre, int edad, String habitat, String genero){

        Animal.totalAnimales += 1;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
    }

    public Animal(){

        Animal.totalAnimales += 1;
    }

    public String movimiento(){
        return "desplazarse";
    }

    public static String totalPorTipo(){
       
        String str = "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" + "Aves: " + Ave.cantidadAves() + "\n" + "Reptiles: " + Reptil.cantidadReptiles() + "\n" + Pez.cantidadPeces() + "\n" + Anfibio.cantidadAnfibios();

        return str;
    }

    @Override
    public String toString() {
        
        if(zona != null){
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad +", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es " + zona + ", en el " + zona.getZoo();
        }
        
        else{
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad +", habito en " + habitat + " y mi genero es " + genero;
        }
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setZona(Zona zona){
        Animal.zona = zona;
    }

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getHabitat(){
        return habitat;
    }
    public String getGenero(){
        return genero;
    }
    public Zona getZona(){
        return zona;
    }
}

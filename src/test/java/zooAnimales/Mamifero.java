package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
    
    private static ArrayList<Mamifero> listado;
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){

        super(nombre,edad,habitat,genero);
        this.pelaje = pelaje;
        this.patas = patas;

    }

    public Mamifero(){

        super();

    }

    public static int cantidadMamiferos(){
        return Mamifero.listado.size();
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        Mamifero.caballos += 1;

        Mamifero caballo = new Mamifero(nombre,edad,"pradera", genero, true, 4);
        return caballo;
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero){
        Mamifero.leones += 1;

        Mamifero leon = new Mamifero(nombre,edad,"selva", genero, true, 4);
        return leon;
    }

    
    public void setListado(ArrayList<Mamifero> listado){
        Mamifero.listado = listado;
    }
    public void setPelaje(boolean pelaje){
        this.pelaje = pelaje;
    }
    public void setPatas(int patas){
        this.patas = patas;
    }

    public ArrayList<Mamifero> getListado(){
        return Mamifero.listado;
    }
    public boolean isPelaje(){
        return pelaje;
    }
    public int getPatas(){
        return patas;
    }
}


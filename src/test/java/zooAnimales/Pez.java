package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{

    private static ArrayList<Pez> listado;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){

        super(nombre,edad,habitat,genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;

    }

    public Pez(){
        super();

    }

    public static int cantidadPeces(){
        return Pez.listado.size();
    }

    @Override
    public String movimiento(){
        return "nadar";
    }

    public static Pez crearSalmon(String nombre, int edad, String genero){
        
        Pez.salmones += 1;

        Pez salmon = new Pez(nombre,edad,"oceano", genero,"rojo",6);
        return salmon;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero){
        
        Pez.bacalaos += 1;

        Pez bacalao = new Pez(nombre,edad,"oceano", genero,"blanco",6);
        return bacalao;
    }

    public void setListado(ArrayList<Pez> listado){
        Pez.listado = listado;
    }
    public void setColorEscamas(String colorEscamas){
        this.colorEscamas = colorEscamas;
    }
    public void setCantidadAletas(int cantidadAletas){
        this.cantidadAletas = cantidadAletas;
    }

    public ArrayList<Pez> getListado(){
        return Pez.listado;
    }
    public String getColorEscamas(){
        return colorEscamas;
    }
    public int getCantidadAletas(){
        return cantidadAletas;
    }
}


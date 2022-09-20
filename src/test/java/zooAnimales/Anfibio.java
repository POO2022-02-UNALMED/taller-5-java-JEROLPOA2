package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{

    private static ArrayList<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
        
        super(nombre,edad,habitat,genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        
    }

    public Anfibio(){
        
        super();
    }


    public static int cantidadAnfibios(){
        return Anfibio.listado.size();
    }

    @Override
    public String movimiento(){
        return "saltar";
    }

    public static Anfibio crearRana(String nombre, int edad, String genero){
        
        Anfibio.ranas += 1;
        Anfibio rana = new Anfibio(nombre,edad,"selva", genero,"rojo", true);
        return rana;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        
        Anfibio.salamandras += 1;

        Anfibio salamandra = new Anfibio(nombre,edad,"selva", genero,"negro y amarillo", false);
        return salamandra;
    }

    public void setListado(ArrayList<Anfibio> listado){
        Anfibio.listado = listado;
    }
    public void setVColorPielenenoso(boolean venenoso){
        this.venenoso = venenoso;
    }
    public void setColorPiel(String colorPiel){
        this.colorPiel = colorPiel;
    }

    public ArrayList<Anfibio> getListado(){
        return Anfibio.listado;
    }
    public boolean isVenenoso(){
        return venenoso;
    }
    public String getColorPiel(){
        return colorPiel;
    }
}

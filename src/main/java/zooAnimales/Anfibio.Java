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
        listado.add(this);
    }

    public Anfibio(){
        
        super();
        this.colorPiel = "";
        this.venenoso = false;
        listado.add(this);
    }


    public int cantidadAnfibios(){
        return Anfibio.listado.size();
    }

    @Override
    public String movimiento(){
        return "saltar";
    }

    public void crearRana(String nombre, int edad, String habitat, String genero){
        
        Anfibio.ranas += 1;

        Anfibio rana = new Anfibio(nombre,edad,"selva", genero,"rojo", true);
    }

    public void crearSalamndra(String nombre, int edad, String habitat, String genero){
        
        Anfibio.salamandras += 1;

        Anfibio salamandra = new Anfibio(nombre,edad,"selva", genero,"negro y amarillo", false);
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
    public boolean getVColorPielenenoso(){
        return venenoso;
    }
    public String getColorPiel(){
        return colorPiel;
    }
}
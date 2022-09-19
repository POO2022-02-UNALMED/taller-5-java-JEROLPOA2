package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{

    private static ArrayList<Reptil> listado;
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){

        super(nombre,edad,habitat,genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }

    public Reptil(){
        super();
        this.colorEscamas = "";
        this.largoCola = 0;
        listado.add(this);
    }

    public int cantidadReptiles(){
        return Reptil.listado.size();
    }

    @Override
    public String movimiento(){
        return "reptar";
    }

    public void crearIguana(String nombre, int edad, String habitat, String genero){
        
        Reptil.iguanas += 1;

        Reptil iguana = new Reptil(nombre,edad,"humedal", genero,"verde",3);
    }

    public void crearSerpiente(String nombre, int edad, String habitat, String genero){
        
        Reptil.serpientes += 1;

        Reptil serpiente = new Reptil(nombre,edad,"jungla", genero,"blanco",1);
    }

    public void setListado(ArrayList<Reptil> listado){
        Reptil.listado = listado;
    }
    public void setColorEscamas(String colorEscamas){
        this.colorEscamas = colorEscamas;
    }
    public void setLargoCola(int largoCola){
        this.largoCola = largoCola;
    }

    public ArrayList<Reptil> getListado(){
        return Reptil.listado;
    }
    public String getColorEscamas(){
        return colorEscamas;
    }
    public int getLargoCola(){
        return largoCola;
    }
}
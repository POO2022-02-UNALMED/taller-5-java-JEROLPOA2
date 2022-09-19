public class Anfibio extends Animal{

    private static ArrayList<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero,ArrayList<Zona> zona, String colorPiel, boolean venenoso){
        
        super(nombre,edad,habitat,genero,zona);
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
        return this.listado.size();
    }

    @Override
    public String movimiento(){
        return "saltar";
    }

    public void crearRana(String nombre, int edad, String habitat, String genero,ArrayList<Zona> zona){
        
        Reptil.ranas += 1;

        rana = new Reptil(nombre,edad,"selva", genero, zona,"rojo", true);
    }

    public void crearSalamndra(String nombre, int edad, String habitat, String genero,ArrayList<Zona> zona){
        
        Reptil.salamandras += 1;

        salamandra = new Reptil(nombre,edad,"selva", genero, zona,"negro y amarillo", false);
    }

    public void setListado(ArrayList<Anfibio> listado){
        this.listado = listado;
    }
    public void setVColorPielenenoso(boolean venenoso){
        this.venenoso = venenoso;
    }
    public void setColorPiel(String colorPiel){
        this.colorPiel = colorPiel;
    }

    public ArrayList<Anfibio> getListado(){
        return listado;
    }
    public boolean getVColorPielenenoso(){
        return venenoso;
    }
    public int getColorPiel(){
        return colorPiel;
    }
}
package zooAnimales;
public class Mamifero extends Animal{
    
    private static ArrayList<Mamifero> listado;
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero,ArrayList<Zona> zona, boolean pelaje, int patas){

        super(nombre,edad,habitat,genero,zona);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }

    public Mamifero(){

        super();
        this.pelaje = false;
        this.patas = 0;
        listado.add(this);
    }

    public int cantidadMamiferos(){
        return this.listado.size();
    }

    public void crearCaballo(String nombre, int edad, String genero,ArrayList<Zona> zona){
        Mamifero.caballos += 1;

        caballo = new Mamifero(nombre,edad,"pradera", genero, zona, true, 4);
    }

    public void crearLeon(String nombre, int edad, String genero,ArrayList<Zona> zona){
        Mamifero.leones += 1;

        leon = new Mamifero(nombre,edad,"selva", genero, zona, true, 4);
    }

    
    public void setListado(ArrayList<Mamifero> listado){
        this.listado = listado;
    }
    public void setPelaje(boolean pelaje){
        this.pelaje = pelaje;
    }
    public void setPatas(int patas){
        this.patas = patas;
    }

    public ArrayList<Mamifero> getListado(){
        return listado;
    }
    public boolean getPelaje(){
        return pelaje;
    }
    public int getPatas(){
        return patas;
    }
}
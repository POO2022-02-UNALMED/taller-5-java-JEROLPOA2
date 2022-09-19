
public class Pez{

    private static ArrayList<Pez> listado;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero,ArrayList<Zona> zona, String colorEscamas, int cantidadAletas){

        super(nombre,edad,habitat,genero,zona);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }

    public Pez(){
        super();
        this.colorEscamas = "";
        this.cantidadAletas = 0;
        listado.add(this);
    }

    public int cantidadPeces(){
        return this.listado.size();
    }

    @Override
    public String movimiento(){
        return "nadar";
    }

    public void crearSalmon(String nombre, int edad, String habitat, String genero,ArrayList<Zona> zona){
        
        Pez.salmones += 1;

        salmon = new Pez(nombre,edad,"oceano", genero, zona,"rojo",6);
    }

    public void crearBacalao(String nombre, int edad, String habitat, String genero,ArrayList<Zona> zona){
        
        Pez.bacalaos += 1;

        bacalao = new Pez(nombre,edad,"oceano", genero, zona,"blanco",6);
    }

    public void setListado(ArrayList<Pez> listado){
        this.listado = listado;
    }
    public void setColorEscamas(String colorEscamas){
        this.colorEscamas = colorEscamas;
    }
    public void setCantidadAletas(int cantidadAletas){
        this.cantidadAletas = cantidadAletas;
    }

    public ArrayList<Pez> getListado(){
        return listado;
    }
    public String getColorEscamas(){
        return colorEscamas;
    }
    public int getCantadAletas(){
        return cantidadAletas;
    }
}
package zooAnimales;
public class Ave extends Animal{

    private static ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){

        super(nombre,edad,habitat,genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public Ave(){
        super();
        this.colorPlumas = "";
        listado.add(this);
    }

    public int cantidadAves(){
        return this.listado.size();
    }

    @Override
    public String movimiento(){
        return "volar";
    }

    public void crearHalcon(String nombre, int edad, String habitat, String genero){
        
        Ave.halcones += 1;

        halcon = new Ave(nombre,edad,"montanas", genero,"cafe glorioso");
    }

    public void crearAguila(String nombre, int edad, String habitat, String genero){
        
        Ave.aguilas += 1;

        aguilas = new Ave(nombre,edad,"montanas", genero,"blanco y amarillo");
    }

    public void setListado(ArrayList<Ave> listado){
        this.listado = listado;
    }
    public void setColorPlumas(String colorPlumas){
        this.colorPlumas = colorPlumas;
    }

    public ArrayList<Ave> getListado(){
        return listado;
    }
    public String getColorPlumas(){
        return colorPlumas;
    }

}
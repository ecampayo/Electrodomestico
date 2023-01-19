public class Secadora extends Electrodemestico{
    //Constantes
    private final static int CARGA_DEF=5;
    //atributos
    private int carga;
    //Métodos públicos
    public int getCarga(){
        return carga;
    }
    public double precioFinal(){
        //Invocamos al método de la clase padre
        double plus=super.precioFinal();
        //Añadimos el código necesario para la clase secadora
        if (carga>=30){
            plus+=50;
        }
        return plus;
    }
    //Constructores
    public Secadora(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }
    public Secadora(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }
    public Secadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase, peso, consumoEnergetico, color);
        this.carga=carga;
    }
}

public class Electrodemestico {
    //Definición constantes
    //color por defecto
    protected final static String COLOR_DEF="blanco";
    //consumo energético por defecto
    protected final static char CONSUMO_ENERGETICO_DEF='F';
    //precio por defecto
    protected final static double PRECIO_BASE_DEF=100;
    //peso por defecto
    protected final static double PESO_DEF=5;
    //Definición de atributos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;


    //Métodos privados
    private void comprobarColor (String color){
        String colores[]={"blanco", "negro", "rojo","azul", "gris"};
        boolean encontrado=false;
        for (int i=0; i<colores.length && !encontrado; i++){
            if (colores[i].equals(color)){
                encontrado=true;
            }
        }
        if (encontrado) {
            this.color = color;
        }else{
                this.color=COLOR_DEF;
            }
        }
    //Comprobamos consumo energético
    private void comprobarConsumoEnergetico (char consumoEnergetico){
        if (consumoEnergetico>=65 && consumoEnergetico<=70 ){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
        }
    }
    //Métodos públicos
    public double getPrecioBase(){
        return precioBase;
    }
    public String getColor(){
        return color;
    }
    public char getConsumoEnergetico(){
        return consumoEnergetico;
    }
    public double getPeso(){
        return peso;
    }
    //Calcular precio final electrodoméstico

    public double precioFinal(){
        double plus=0;
        switch (consumoEnergetico) {
            case 'A':
                plus += 100;
                break;
            case 'B':
                plus += 80;
                break;
            case 'C':
                plus += 60;
                break;
            case 'D':
                plus += 50;
                break;
            case 'E':
                plus += 30;
                break;
            case 'F':
                plus += 10;
                break;
        }
        if (peso>=0 && peso<19){
            plus+=10;
        } else if (peso>=20 && peso<49) {
            plus+=50;
        } else if (peso>=50 && peso<79) {
            plus+=80;
        } else if (peso>=80) {
            plus+=100;
        }
        return precioBase+plus;
    }
    //Constructores
    public Electrodemestico(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF,COLOR_DEF);

    }
    public Electrodemestico(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF);

    }
    public Electrodemestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        this.consumoEnergetico=consumoEnergetico;
        this.color=color;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    }


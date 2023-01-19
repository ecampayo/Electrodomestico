public class ElectrodomesticoApp {
    public static void main(String[] args) {
        //creamos el array de objetos de electrodomésticos
        Electrodemestico listaElectrodomesticos[]=new Electrodemestico[10];
        //Asignamos valores del objeto al array
        listaElectrodomesticos[0]=new Electrodemestico(200, 60,'C', "verde");
        listaElectrodomesticos[1]=new Secadora(150, 30);
        listaElectrodomesticos[2]=new Television(500, 80, 'E', "negro", 42, false);
        listaElectrodomesticos[3]=new Electrodemestico();
        listaElectrodomesticos[4]=new Electrodemestico(600,20,'D', "gris");
        listaElectrodomesticos[5]=new Secadora(300,40,'z', "blanco", 40);
        listaElectrodomesticos[6]=new Television(250, 70);
        listaElectrodomesticos[7]=new Secadora(400, 100, 'A', "verde", 15);
        listaElectrodomesticos[8]=new Television(200, 60, 'C', "naranja", 30, true);
        listaElectrodomesticos[9]=new Electrodemestico(50,10);
        //Creamos las variables que usaremos para almacenar la suma de los precios
        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaSecadoras=0;
        //Recorremos el array e invocamos a precioFinal
        for(int i=0; i<listaElectrodomesticos.length;i++){
            if(listaElectrodomesticos[i] instanceof Electrodemestico){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }if (listaElectrodomesticos[i] instanceof Secadora){
                sumaSecadoras+=listaElectrodomesticos[i].precioFinal();
            }if (listaElectrodomesticos[i] instanceof Television){
                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }
        //Mostramos los resultados
        System.out.println("La suma del precio de Electrodomesticos sera " +sumaElectrodomesticos);
        System.out.println("La suma del precio de Secadoras sera "+sumaSecadoras);
        System.out.println("La suma del precio de Televisiones sera "+sumaTelevisiones);
    }
}

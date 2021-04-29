package Extra;

public class app {

    public  static  void main ( String []  args){
       /*Hilos*/
        /*procesos de llamado */
    Proceso p1 = new Proceso();
    Proceso p2 = new Proceso();

    /*seteo*/

    p1.setName("imprimir 1 ");
    p1.setN(15);
    p1.setRapidez(5000);

    p2.setName("imprimir");
    p2.setN(20);
    p2.setRapidez(1000);

    /*proceso de impresion*/

        p1.setName("imprime 2");
        p2.setN(10);


        /*llamado del metrodo run*/
        p1.start();
        p2.start();

    }



}

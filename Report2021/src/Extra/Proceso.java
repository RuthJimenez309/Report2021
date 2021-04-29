package Extra;

/*Thread para hacer referencia de hilos */
public class Proceso extends Thread{
    /*Thread clase abstracta*/


    /*ejercicio de los hilos*/

   /*  se bora para que no de problemas
   private String name;  */
    private  int n;
    private  int rapidez;



    /*  Esto tamabien se borra
   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   */
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    /* set end gets del metodo rapidez*/

    public int getRapidez() {
        return rapidez;
    }

    public void setRapidez(int rapidez) {
        this.rapidez = rapidez;
    }

    /*metodo imprimir*/

   /* public  void  imprimir (){


    }*/

    /*el lllamada de la clase abstracta es polimorfismos  */
    /* @Override siempre va antes el overtide */

    @Override

    public  void run(){
        for ( int i=0; i < n ; i++ ){
            System.out.println(super.getName() + ":" + i );
            try{
                Thread.sleep(this.rapidez);
            }catch( InterruptedException e){
                e.printStackTrace();
            }
        }



    }



    /*dormir nuestromprograma */

    /*metodo para dormir */



}

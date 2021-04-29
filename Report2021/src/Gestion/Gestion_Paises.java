package Gestion;

public class Gestion_Paises {

    public String nombre_por_region;
    private double Special_Support;
    private  double Healthy_life_expetency;
    private  double Freedom_to_make_choices;
    private  double Generosity;
    private  double  Percetption_of_corruption;

    public Gestion_Paises (String nombre_por_region,double Special_Support, double Healthy_life_expetency , double Freedom_to_make_choices,double Generosity
            ,double  Percetption_of_corruption ) {

        this.nombre_por_region = nombre_por_region;
        this.Special_Support = Special_Support;
        this.Healthy_life_expetency= Healthy_life_expetency;
        this.Freedom_to_make_choices = Freedom_to_make_choices;
        this.Generosity = Generosity;
        this.Percetption_of_corruption = Percetption_of_corruption;

    }

    /*metodos que necesitaremos para la validation*/

    public String getNombre_por_region() {
        return nombre_por_region;
    }

    public void setNombre_por_region(String nombre_por_region) {
        this.nombre_por_region = nombre_por_region;
    }

    public double getSpecial_Support() {
        return Special_Support;
    }

    public void setSpecial_Support(double special_Support) {
        Special_Support = special_Support;
    }

    public double getHealthy_life_expetency() {
        return Healthy_life_expetency;
    }

    public void setHealthy_life_expetency(double healthy_life_expetency) {
        Healthy_life_expetency = healthy_life_expetency;
    }

    public double getFreedom_to_make_choices() {
        return Freedom_to_make_choices;
    }

    public void setFreedom_to_make_choices(double freedom_to_make_choices) {
        Freedom_to_make_choices = freedom_to_make_choices;
    }

    public double getGenerosity() {
        return Generosity;
    }

    public void setGenerosity(double generosity) {
        Generosity = generosity;
    }

    public double getPercetption_of_corruption() {
        return Percetption_of_corruption;
    }

    public void setPercetption_of_corruption(double percetption_of_corruption) {
        Percetption_of_corruption = percetption_of_corruption;
    }



}

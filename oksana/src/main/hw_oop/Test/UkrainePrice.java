package Test;

/**
 * Created by Оксана on 06.11.2015.
 */
public  class UkrainePrice extends CarTransportationCosts {
    public double countLocaleCost(){
        //складні обчислення із врахуванням податків, митних зборів та інших витрат
        double someLocaleCosts=14000.00;
        double price=this.countPrimeCost()+this.countTransportationCosts("Ukraine")+someLocaleCosts;

        return price;
    }
}
package Test;

/**
 * Created by Оксана on 06.11.2015.
 */
public class EnglandPrice extends CarTransportationCosts {

    public double countLocaleCost(){
        //складні обчислення із врахуванням податків, митних зборів та інших витрат
        double enLocaleCosts=15800.00;
        double price=super.countPrimeCost()+super.countTransportationCosts("Ukraine")+enLocaleCosts;

        return price;
    }
}
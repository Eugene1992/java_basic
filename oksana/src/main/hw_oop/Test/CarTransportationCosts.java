package Test;

/**
 * Created by Оксана on 06.11.2015.
 */

    public abstract class CarTransportationCosts extends CarCost {

        @Override
        public double countTransportationCosts(String country) {


            if (country.compareTo("Ukraine") == 0){
                //обчислення вартості транспортування в Україну
                return 3.000;
            }

            if (country.compareTo("England") == 0) {
                //обчислення вартості доставки в Англію
                return 2.000;
            }
            return -1.0;
        }

    }



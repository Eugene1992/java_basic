package Test;

/**
 * Created by Оксана on 06.11.2015.
 */
public class MainClas {
    UkrainePrice ukPrice = null;
    EnglandPrice enPrice = null;

    MainClas() {
        // ПОМИЛКИ! Екземпляри абстрактних класів неможливо створити
        // CarCost cs=new CarCost();
        // CarTransportationCosts pt=new CarTransportationCosts();

        // тож працюємо з неабстрактними класами, в яких усі методи
        // абстрактного класу CarCost реалізовані

        ukPrice = new UkrainePrice();
        enPrice = new EnglandPrice();
        System.out.println("Ціна автомобіля в Україні складає "
                + ukPrice.countLocaleCost());
        System.out.println("Ціна автомобіля в Англії складає "
                + enPrice.countLocaleCost());

    }

    public static void main(String[] args) {
        new MainClas();
    }
}
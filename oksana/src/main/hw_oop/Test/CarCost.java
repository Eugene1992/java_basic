package Test;

/**
 * Created by Оксана on 06.11.2015.
 */
/**
 * Абстрактний клас
 * Список методів до реалізації
 */
public abstract class CarCost {

    /**
     * обчислення собівартості
     * @return - Собівартість автомобіля на заводі
     */
    public double countPrimeCost() {
        //обчислення собівартості
        return 50000.0;
    }

    /**
     * Обчислення вартості перевезення
     * @param Country - країна
     * @return - вартість перевезення
     */
    public abstract double countTransportationCosts(String Country);

    /**
     * Обчислення вартості автомобіля в салонах продажів
     * @return - остаточна ціна автомобіля у певній країні
     */
    public abstract double countLocaleCost();
}
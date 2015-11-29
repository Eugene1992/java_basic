package Price;

import Worker.Worker;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Задание 3
 * Создайте проект, используя IntelliJ IDEA.
 * Требуется: Описать класс с именем Price, содержащую следующие поля:
 * название товара;
 * название магазина, в котором продается товар;
 * стоимость товара в гривнах.
 * Написать программу, выполняющую следующие действия:
 * ввод с клавиатуры данных в массив, состоящий из двух элементов типа Price (записи должны
 * быть упорядочены в алфавитном порядке по названиям магазинов);
 * вывод на экран информации о товарах, продающихся в магазине, название которого введено с
 * клавиатуры (если такого магазина нет, вывести исключение).
 */
public class Price {
    private String nameProduct;
    private String nameStore;
    private double priceProduct;

    public void setNameProduct(String nameProduct){
        this.nameProduct = nameProduct;
    }
    public String getNameProduct(){
        return nameProduct;
    }
    public void setNameStore(String nameStore){
        this.nameStore = nameStore;
    }
    public String getNameStore(){
        return nameStore;
    }
    public void setPriceProduct(double priceProduct){
        this.priceProduct = priceProduct;
    }
    public double getPriceProduct(){
        return priceProduct;
    }

    @Override
    public String toString() {
        return "" + "Store / Product / Price - " + this.getNameStore() + " / " + this.getNameProduct() + " / " + this.getPriceProduct();
    }
}




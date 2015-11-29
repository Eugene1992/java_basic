package Calculator;
/**
 * Задание
 * Создайте проект, используя IntelliJ IDEA.
 * Создайте класс Calculator.
 * В теле класса создайте четыре метода для арифметических действий: (Add – сложение, Sub – вычитание,
 * Mul – умножение, Div – деление).
 * Метод деления должен делать проверку деления на ноль, если проверка не проходит, сгенерировать
 * исключение.
 * Пользователь вводит значения, над которыми хочет произвести операцию и выбрать саму операцию.
 * При возникновении ошибок должны выбрасываться исключения.
 */
public class Calculator {

    private double a;
    private double b;
    private String action;

    public void setA(double a){
        this.a = a;
    }
    public double getA(){
        return a;
    }
    public void setB(double b) {this.b = b; }
    public double getB() {return b; }
    public void setAction(String action) {this.action = action; }
    public String getAction() {return action;}

    public double add(double a, double b){
        return a + b;
    }
    public double sub(double a, double b){
        return a - b;
    }
    public double mul(double a, double b){
        return a * b;
    }
    public double div(double a, double b){
        try {
            return a / b;
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Division by zero!");
        }
        return a / b;
    }
}

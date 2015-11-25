package Distance;
/**
 * Задание 3
 * Создайте проект, используя IntelliJ IDEA.
 * Требуется:
 * Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте
 * статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы
 * измерения (к примеру из матров в километры, из километров в мили, и так далее).
 */
public class Distance {

    private static double distanse = 10;

    public void setDistanse(double number){distanse = number;}
    public double getDistanse(){return distanse;}

    public static void print(double dis) {
        System.out.println(dis);
    }

    static class Convert {
        double mmToCm(double dis) {
            return dis / 10;
        }

        double cmTomm(double distance) {
            return distance * 10;
        }

        double cmTom(double distance) {
            return distance / 100;
        }

        double mToCm(double distance) {
            return distance * 100;
        }

        double cmToDm(double distance) {
            return distance * 0.39370078740157;
        }

        double dmToCm(double distance) {
            return distance / 0.39370078740157;
        }

        double metrToKilometr(double distance) {
            return distance * 1000;
        }

        double KilometrToMetr(double distanse) {
            return distanse / 1000;
        }

        double KilometrToMili(double distanse) {
            return distanse / 0.62137119223733;
        }

        double MiliToKilometr(double distanse) {
            return distanse * 0.62137119223733;
        }
    }
}


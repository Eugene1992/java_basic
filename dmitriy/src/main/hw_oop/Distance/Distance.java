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

    private static double distance;

    public void setDistance(double number){distance = number;}
    public double getDistance(){return distance;}

    public static void print(double dis) {
        System.out.println(dis);
    }

    static class Convert {
        double mmToCm(double distance) {
            return distance / 10;
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

        double KilometrToMetr(double distance) {
            return distance / 1000;
        }

        double KilometrToMili(double distance) {
            return distance / 0.62137119223733;
        }

        double MiliToKilometr(double distance) {
            return distance * 0.62137119223733;
        }
    }
}


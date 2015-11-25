package Animals;
/**
 * Задание 2
 * Создайте проект, используя IntelliJ IDEA.
 * Создайте перечислительный тип (enum) Animals, содержащий коструктор, который должен принимать
 * целочисленное значение (возраст животного), и содержать перегруженый метод toString(), который
 * должен возвращать название экземпляра и возраст животного.
 */
public enum Animals {

    ANIMALSNAME(6),
    OLD(9);

    public int age;

    Animals(int old) {
        age = old;
    }

    public String toString() {
        return ANIMALSNAME + " " + age;
    }
}

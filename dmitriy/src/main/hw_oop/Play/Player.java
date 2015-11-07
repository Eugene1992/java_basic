package Play;
/**
 * Задание 3
 * Используя IntelliJ IDEA, создайте проект.Требуется:
 * Создайте 2 интерфейса Playable и Recodable. В каждом из интерфейсов создайте по 3 метода void Play() /
 * void Pause() / void Stop() и void Record() / void Pause() / void Stop() соответственно.
 * Создайте производный класс Player от базовых интерфейсов Playable и Recodable.
 * Написать программу, которая выполняет проигрывание и запись.
 */
public class Player implements Playable, Recordable {
    public void play() {
        System.out.println("I play, piu piu piu bla bla bla...");
    }

    public void pause() {
        System.out.println("Pause");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void record() {
        System.out.println("i read! hrhrhrhhrrhhrh...");
    }
}

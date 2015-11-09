package hw43;

/**
 * Created by IT on 08.11.2015.
 */
public class Player implements Playable, Recodable {

    public void Play() {
        System.out.println("Play");
    }

    public void Record() {
        System.out.println("Record");

    }

    public void Pause() {
        System.out.println("Pause");

    }

    public void Stop() {
        System.out.println("Stop");

    }
}

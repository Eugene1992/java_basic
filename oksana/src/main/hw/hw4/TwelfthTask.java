package hw4;

/**
 * Created by Оксана on 11.10.2015.
 *
 * 12. Счастливые билетики. Есть билеты с номерами от 000001 до 999999. «Счастливым» считается билетик у которого сумма первых
 трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576. С помощью программы,
 подсчитайте сколько счастливых билетов.

 */
public class TwelfthTask {
    public static void main(String[] args) {

        int happyNumbers = 0;
        for (int i =1; i < 999999; i++) {
            int Six = i % 10;
            int Five = (i / 10) % 10;
            int Four = (i / 100) % 10;
            int Three = (i / 1000) % 10;
            int Two = (i / 10000) % 10;
            int One = (i / 100000) % 10;
            if ((One + Two + Three) == (Four + Five + Six)) {
                happyNumbers++;
            }
        }
        System.out.println("Number of Happy numbers: "+happyNumbers);
    }

}

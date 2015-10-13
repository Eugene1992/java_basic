package lesson5;

/**
 * Created by WebCamp on 06.07.2015.
 */
public class C03_Cyper {
    // Побитовые логические операции. (^)

    // Например:
    // Используя операцию XOR, мы можем зашифровать сообщение.
    // В таком виде шифрования используется один ключ, как для шифрования, так и для расшифровки.
    // Криптостойкость такого ключа, можно увеличить, если увеличить его длину.

    public static void main(String[] args) {
        short secretKey = 0x0088;   // Секретный ключ (длина - 16 bit).
        char character = 'A';      // Исходный символ для шифрования.

        System.out.println("Исходный символ: " + character + ", его код в кодовой таблице: " + (byte)character);

        // Зашифровываем символ.
        character = (char)(character ^ secretKey);
        System.out.println("Зашифрованный символ: " + character + ", его код в кодовой таблице: " + (byte) character);

        // Расшифровываем символ.
        character = (char)(character ^ secretKey);
        System.out.println("Расшифрованный символ: " + character + ", его код в кодовой таблице: " + (byte) character);
    }
}

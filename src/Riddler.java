import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLOutput;

/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Stefan Perkovic
 */
public class Riddler {

    // Decrypts the first message of the puzzle
    public String decryptOne(String encrypted) {
        String decrypted = "";
        int shift = 9;
        // Loops through each character and shifts if it's a letter
        for (int i = 0; i < encrypted.length(); i++){
            if (Character.isLetter(encrypted.charAt(i))) {
                if (Character.isLowerCase(encrypted.charAt(i)))
                    decrypted += (char) ((encrypted.charAt(i) - 'a' + shift) % 26 + 'a');
                else{
                    decrypted += (char) ((encrypted.charAt(i) - 'A' + shift) % 26 + 'A');
                }
            }
            else{
                decrypted += encrypted.charAt(i);
            }
        }
        return decrypted;
    }

    // Decrypts the second message of the puzzle
    public String decryptTwo(String encrypted) {
        String[] ASCIIs = encrypted.split(" ");
        String decrypted = "";
        // Converts each ASCII value into an int and then its corresponding char
        for (int i = 0; i < ASCIIs.length; i++){
            int value = Integer.parseInt(ASCIIs[i]);
            decrypted += (char)(value);
        }
        return decrypted;
    }

    // Decrypts the third message of the puzzle
    public String decryptThree(String encrypted) {
        String decrypted = "";
        int bit_length = 8;
        // Converts each group of bits into a number
        for (int i = 0; i < encrypted.length(); i += bit_length){
            int val = 0;
            // Uses bitwise operators to convert each bit into a number
            for (int j = 0; j < bit_length; j++){
                val <<= 1;
                if (encrypted.charAt(i + j) == '1'){
                    val |= 1;
                }
            }
            decrypted += (char)(val);
        }
        return decrypted;
    }

    // Decrypts the fourth message of the puzzle
    public String decryptFour(String encrypted) {
        String decrypted = "";
        // Shifts each dingbat to its corresponding letter
        for (int i = 0; i < encrypted.length(); i++){
            decrypted += (char) ((encrypted.charAt(i) - '\u2700') + 'A');
        }
        return decrypted;
    }
}

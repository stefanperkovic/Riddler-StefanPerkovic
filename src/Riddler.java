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
 * Completed by: YOUR NAME HERE
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        String text = "’Knrj sizcczx, reu kyv jczkyp kfmvj Uzu xpiv reu xzdscv ze kyv nrsv: Rcc dzdjp nviv kyv sfifxfmvj, Reu kyv dfdv irkyj flkxirsv.";
        String decrypted = "";

        for (int i = 0; i < text.length(); i++){
            if (Character.isLetter(text.charAt(i))) {
                if (Character.isLowerCase(text.charAt(i)))
                    decrypted += (char) ((text.charAt(i) - 'a' + 9) % 26 + 'a');
                else{
                    decrypted += (char) ((text.charAt(i) - 'A' + 9) % 26 + 'A');
                }
            }
            else{
                decrypted += text.charAt(i);
            }
        }
        System.out.print(decrypted);
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String text = "39 84 104 101 32 116 105 109 101 32 104 97 115 32 99 111 109 101 44 39 32 116 104 101 32 87 97 108 114 117 115 32 115 97 105 100 44 39 84 111 32 116 97 108 107 32 111 102 32 109 97 110 121 32 116 104 105 110 103 115 58 79 102 32 115 104 111 101 115 32 45 32 97 110 100 32 115 104 105 112 115 32 45 32 97 110 100 32 115 101 97 108 105 110 103 45 119 97 120 32 45 79 102 32 99 97 98 98 97 103 101 115 32 45 32 97 110 100 32 107 105 110 103 115 32 45 65 110 100 32 119 104 121 32 116 104 101 32 115 101 97 32 105 115 32 98 111 105 108 105 110 103 32 104 111 116 32 45 65 110 100 32 119 104 101 116 104 101 114 32 112 105 103 115 32 104 97 118 101 32 119 105 110 103 115 46 39";
        String[] values = text.split(" ");

        String decrypted = "";
        for (int i = 0; i < values.length; i++){
            int val = Integer.parseInt(values[i]);
            decrypted += (char)(val);
        }

        // TODO: Complete the decryptTwo() function.
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String text = "0100100101101110001000000111010001101000011001010010000001101101011010010110010001110011011101000010000001101111011001100010000001110100011010000110010100100000011101110110111101110010011001000010000001101000011001010010000001110111011000010111001100100000011101000111001001111001011010010110111001100111001000000111010001101111001000000111001101100001011110010010110001001001011011100010000001110100011010000110010100100000011011010110100101100100011100110111010000100000011011110110011000100000011010000110100101110011001000000110110001100001011101010110011101101000011101000110010101110010001000000110000101101110011001000010000001100111011011000110010101100101001011000100100001100101001000000110100001100001011001000010000001110011011011110110011001110100011011000111100100100000011000010110111001100100001000000111001101110101011001000110010001100101011011100110110001111001001000000111011001100001011011100110100101110011011010000110010101100100001000000110000101110111011000010111100100101101010001100110111101110010001000000111010001101000011001010010000001010011011011100110000101110010011010110010000001110111011000010111001100100000011000010010000001000010011011110110111101101010011101010110110100101100001000000111100101101111011101010010000001110011011001010110010100101110";
        String decrypted = "";

        // TODO: Complete the decryptThree() function.
        for (int i = 0; i < text.length(); i +=8){
            String bit = text.substring(i, i+8);
            int val = Integer.parseInt(bit, 2);
            decrypted += (char)(val);

        }
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}

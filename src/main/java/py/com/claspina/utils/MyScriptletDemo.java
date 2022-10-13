package py.com.claspina.utils;

import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;

/**
 * @author Carlos F. Laspina - claspina@sgisoftware.com
 */
public class MyScriptletDemo extends JRDefaultScriptlet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JRScriptletException {
        System.out.println(padLeftWithCharacter("Carlos Laspina", "-", 10));
        System.out.println(padLeftWithCharacter("dummyData", "*", 15));
        System.out.println(padLeftZeros("25.000", 15));
    }

    public static String padLeftWithCharacter(String inputString, String character, int length) {
        if (inputString.length() >= length) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < length - inputString.length()) {
            sb.append(character);
        }
        sb.append(inputString);

        return sb.toString();
    }

    public static String padLeftZeros(String inputString, int length) {
        return padLeftWithCharacter(inputString, "0", length);
    }

}

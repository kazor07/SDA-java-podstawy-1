package zajecia;

/**
 * Created by RENT on 2017-04-14.
 */
public class Zajecia9 {
    public static void main(String[] args) {
        String message = "wojna";

        System.out.println(message);
        System.out.println(cezarCode(message));
        System.out.println(cezardecode(cezarCode(message)));
    }
    public static String cezarCode(String message){
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122)
                charArray[i]++;
        }
        return String.valueOf(charArray);

    }
    public static String cezardecode(String message){
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122)
                charArray[i]--;
        }
        return String.valueOf(charArray);

    }

}

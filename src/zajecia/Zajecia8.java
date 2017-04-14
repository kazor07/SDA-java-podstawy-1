package zajecia;

public class Zajecia8 {
    public static void main(String[] args) {
//        System.out.println(countCharakterIn("Ala ma kota", 'a'));
//        System.out.println(countCharakterIn("Ala ma kota i dwa psy", 'a'));
//        System.out.println(countCharakterIn("ala ma kota i dwa psy", 'a'));
//            String message = "KooT";
        String pokemonMessage = "AjKJYasgsfthf";
//        System.out.println(countCapitalLetters(pokemonMessage));
//        System.out.println(countSmallLetters(pokemonMessage));
//        System.out.println("ilosc slow " + countWords(pokemonMessage));
//            switchCase(pokemonMessage);
//        System.out.println(ananimOf(pokemonMessage));

        System.out.println(toLowerCase(pokemonMessage));

    }
    public static String  toUpperCase(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            }
        }
        return String.valueOf(charArray);
//        return message.split(" ").length;


    }
    public static String  toLowerCase(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;
            }
        }
        return String.valueOf(charArray);
//        return message.split(" ").length;


    }
    public static int countCharakterInoption(String message, char charakter){

        int counter = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == charakter){
                counter++;
            }
        }
        return counter;

    }

    public static int countCharakterIn(String message, char charakter){
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == charakter){
                counter++;
            }
        }
        return counter;

    }

    public static int  countCapitalLetters(String message){
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 &&  charArray[i] <= 90){
                counter++;
            }
        }
        return counter;
    }

    public static int  countSmallLetters(String message){
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 &&  charArray[i] <= 122){
                counter++;
            }
//            counter += (charArray[i] >= 97 && charArray[i] <= 122) ? 1: 0;
        }

        return counter;


    }
    public static int  countWords(String message){
        char[] charArray = message.toCharArray();
        int counter = 1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ' ){
                counter++;
            }

        }
        return counter ;
//        return message.split(" ").length;

    }
    public static String switchCase(String message){
        char[] charArray = message.toCharArray();
        for (int i = 0;  i < charArray.length; i++) {
            if (charArray[i] >= 97 &&  charArray[i] <= 122){
               charArray[i] -= 32;
            }else
                if (charArray[i] >= 65 &&  charArray[i] <= 90){
                charArray[i] += 32;
            }
        }

//        return new String(charArray);
//        return charArray.toString();
        System.out.println(charArray);
        return String.valueOf(charArray);

    }
    //message wspak

    public static String ananimOf (String message){
        char[] charArray = message.toCharArray();
        for (int i = 0; i <charArray.length / 2; i++) {
//            int a = charArray[i];
//            int b = charArray[charArray.length -1 -i];
            char tmp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 -i];
            charArray[charArray.length - 1 -i] = tmp;

        }

        return String.valueOf(charArray);

    }
    public static boolean isPalindrome (String message){
        char[] charArray = message.toCharArray();
        boolean palindrome = true;
        int i = 0;
        while (palindrome && i < charArray.length/2){
            if (charArray[i] != charArray[charArray.length -i -1]){
                palindrome = false;
            }
            i++;

        }


        return message.equals(ananimOf(message)); //to uzywamy do stringow - obiektow!!

//        return palindrome;

    }

    public static void charandStringTest() {
        String message = "Ala ma kota";
        char znak = 'a';
        for (int i = 0; i < 26; i++) {

            System.out.println(znak + " , ");
            znak++;
        }
        char[] charArray = message.toCharArray();
        System.out.println(message.length());
        System.out.println(charArray.length);
    }
}


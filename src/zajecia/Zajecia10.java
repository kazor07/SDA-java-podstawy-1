package zajecia;


public class Zajecia10 {

    public static void main(String[] args) {

//        System.out.println(find("Ala ma kota", 'm'));
//        System.out.println(find("Ala ma kota", 'k'));

//        System.out.println(countAll("Ala ma kota", 'a'));
//        System.out.println(multiplydigits(123));
//        System.out.println(multiplydigits(143));




    }
    public static int find(String message, char sentence){
        char[] charArray = message.toCharArray();
        int i =0;
        while (charArray[i] != sentence && i < charArray.length){
            i++;

        }
        return (i == charArray.length) ? -1 : i;
    }
        public static int multiplydigits (int number){
            int result = 1;
            while ( number != 0 ){
                result *= number % 10;
                number /= 10;

            }

                        return result;

        }

        public static String  toBinary(int number){
            int [] binarycode;
            while (number == 0){

            }

        }
     public static String  toNumber(int binarycode){


    }
//        public static int countAll(String message, char sentence){
//            char[] charArray = message.toCharArray();
//            int counter = 0;
//            for (int i = 0; i < charArray.length; i++) {
//                if (Zajecia8.toLowerCase(charArray[i]) == Zajecia8.toLowerCase(sentence)){
//                    counter++;
//                }
//            }
//
//            return counter;
//
//        }



//    public static int (String message, char sentence) {
//
//    }




}

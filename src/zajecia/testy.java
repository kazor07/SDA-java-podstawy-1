package zajecia;


import java.util.Scanner;

public class testy {
    public static void main(String[] args) {
//        checkAge();
//        isNumberEven();
//        checkBigger();
//        arrayTest();
//        listevenandgreaterthan0();
//        avg();
//        sumofeven();
//        sumofpositive();
//        countEvenelements();
//            sumofoddelements();
//        displaynexttoo();
        String message = "sdsdasdasdasdasdads FDSFDSFSFSFSDS";

        System.out.println(switchCase(message));
    }
    public static void checkAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj swoj wiek :");
        int Age = scanner.nextInt();
        if (Age > 18){
            System.out.println("jestes dorosły");
        } else if( Age == 18){
            System.out.println("jestes dokladnie pelnoletni");
        } else {
            System.out.println("dziaciaku wypad");
        }
    }
    public static void isNumberEven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj jakas liczbe");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println(number + " - number is even");
        } else {
            System.out.println("number id odd");
        }
    }
    public static void checkBigger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe A");
        int numbera = scanner.nextInt();
        System.out.println("podaj druga liczbe");
        int numberb = scanner.nextInt();
        if ( numbera > numberb){
            System.out.println("liczba A jest wieksza od B");
        } else if (numberb > numbera){
            System.out.println("liczba B jest wieksza od A");
        }else {
            System.out.println("liczby sa równe sobie");
        }
    }

    public static void arrayTest(){
        int[] array = {1, 2, -5, 10, 15, 18, 124, 1125};
        for (int i = 0; i <array.length ; i++) {
            if ( array[i] % 2 == 0) {
                System.out.print(array[i] + ", ");
            }
        }
    }
    public static void listevenandgreaterthan0(){
        int[] array = {1, 2, -5, 10, 15, 18, 124, 1125};
        for (int i = 0; i <array.length ; i++) {
            if (array[i] % 2 == 0 && array[i] > 0 ) {
                System.out.print(array[i] + ", ");

            }

        }

    }
    public static void avg(){
        int[] oooo = {1, 2, -5, 10, 15, 18, 124, 1125};
        int sum = 0;
        for (int i = 0; i < oooo.length; i++) {
            sum += oooo[i];
        }
        System.out.println("suma elementów to: " + sum);
        System.out.println("avg elementów to: " + ((double)sum / (double)oooo.length));

    }
    public static void sumofeven(){
        int[] oooo = {1, 2, -5, 10, 15, 18, 124, 1125};
        int sum = 0;
        for (int i = 0; i <oooo.length ; i++) {
            if (oooo[i] % 2 == 0){
                sum += oooo[i];
            }
        }
        System.out.println(sum);
    }
    public static void sumofpositive() {
        int[] oooo = {1, 2, -5, 10, 15, 18, 124, 1125};
        int sum = 0;
        for (int i = 0; i < oooo.length; i++) {
            if (oooo[i] >= 0) {
                sum += oooo[i];

            }
        }
        System.out.println(sum);

    }
    public static void countEvenelements(){
        int[] array = {2, 3, 4, 5, 6, 7, 9, 11, 13};
        int counter = 0;
        for (int i = 0; i <array.length; i++) {
            if (array[i] % 2 == 0 ){
                counter++;
            }

        }
        System.out.println("parzystych jest: " + counter);
    }
    public static void sumofoddelements(){
        int[] array = {2, 3, 4, 5, 6, 7, 9, 11, 13};
        int sum = 0;
        for (int i = 0; i <array.length; i++) {
            if (array[i] % 2 != 0 ){
                sum += array[i];
            }
        }
        System.out.println("suma nieparzystych: " + sum);
    }
    public static void displaynexttoo(){
        int[] array = {2, 3, 4, 5, 6, 7, 9, 11, 13};
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + ",");

        }
        System.out.println(" teraz tylko parzyste ");
        for (int i = 0; i <array.length ; i++) {
            if ( i % 2 == 0)
                System.out.print(array[i] + ",");


        }
    }
    public static String switchCase(String message){
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97  && charArray[i] <= 122){
                charArray[i] -= 32;
            } else if(charArray[i] >= 65  && charArray[i] <= 90){

                charArray[i] += 32;


            }
        }

        return String.valueOf(charArray);
    }


}

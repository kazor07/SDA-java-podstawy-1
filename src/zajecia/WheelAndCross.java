package zajecia;




public class WheelAndCross {
    public static void main(String[] args) {

        System.out.println(displayBoard();


    }

    public static void displayBoard(char[][] gameBoard){

        char[][] matrix = new char[3][3];
        for (int i = 0; i< 3; i++) {
            for (int j = 0; j< 3; j++) {
                matrix[i][j] = i + j; //save
            }
        }
        return matrix;

    }
}

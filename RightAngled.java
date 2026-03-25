
public class RightAngled {
    public static void main(String args[]) {

        int rows = 5; // number of rows

        for (int i = 1; i <= rows; i++) { // outer loop for rows
            for (int j = 1; j <= i; j++) { // inner loop for columns in each row
                System.out.print("0 ");    // print 0 and stay on same line
            }
            System.out.println();          // move to next row
        }

    }
}
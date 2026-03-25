public class RightAgiled1 {
    public static void main(String args[]) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // print spaces
            for (int s = rows; s > i; s--) {
                System.out.print("  "); // two spaces for alignment
            }

            // print 0s
            for (int j = 1; j <= i; j++) {
                System.out.print("0 "); // 0 with a space
            }
        System.out.println(); // move to next row

            
        }
    }
}
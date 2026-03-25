public class Pattern {
    public static void main(String args[]) {

        for (int i = 0; i < 5; i++) {        // 5 rows
            for (int j = 0; j < 6; j++) {    // 6 columns
                System.out.print("0 ");      // print 0 and stay on the same line
            }
            System.out.println();             // move to next row after 6 columns
        }

    }
}
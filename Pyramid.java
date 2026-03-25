public class Pyramid{

    public static void main(String[] args)
    {
        int rows = 5; //number of rows

        for(int i=1; i<=rows; i++)  //outer loop
        {
            for(int s=rows; s>i; s--)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("0");
            }

            System.out.println();
        }

    }
}
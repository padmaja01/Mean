import java.util.Scanner;

public class Mean {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
            sum+=array[i];
        }
        System.out.printf("%.2f\n",(double) sum/n);


    }
}

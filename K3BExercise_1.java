import java.util.Scanner;
public class K3BExercise_1{
    public static void main(String[] args){
        System.out.println("Enter your size: ");
        Scanner sc =  new Scanner(System.in);
        int size = sc.nextInt();
        int sum = 0;
        int avg = 0;
        int[] array = new int[size];

        System.out.println("Enter your array list: ");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
            sum = sum + array[i];
        }
        avg = sum/size;
        System.out.println(sum + " " + avg);


    }
}

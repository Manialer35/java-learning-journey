import java.util.Scanner;

public class K3BExercise_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int even=0, odd = 0;
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
            if(array[i]%2 == 0){
                even += 1;
            }
            else{
                odd += 1;
            }
        }
        System.out.println(even + " " + odd);
    }
}
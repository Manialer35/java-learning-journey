import java.util.Scanner;

public class K3BExercise3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for(int i =0; i<size; i++){
            if(array[i]<min){
                min = array[i];
            }
        }

        System.out.print(min + " ");
        for(int i =0; i<size; i++){
            if(array[i] == min){
                System.out.print(i + " ");
            }
        }
    }
}
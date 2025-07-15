import java.util.Scanner;

public class searcharr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        boolean flag=false;
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to search:");
        int c = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if(array[i]==c){
                System.out.println("FOUND AT POSITION   "+i);
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("ELEMENT NOT FOUND  ");
        }
    }
    
}

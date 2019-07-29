import java.util.Scanner;
import java.util.Collections;
public class SS2_Dao_nguoc_phan_cac_phan_tu {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner sr = new Scanner(System.in);
        do{
            System.out.print("Enter a size: ");
            size= sr.nextInt();
            if (size>20){
                System.out.println("Size does not exceed 20");
            }
        }while (size>20);

        array=new int[size];
        for (int i=0;i<array.length;i++){
            System.out.print("Enter element "+ (i+1)+": ");
            array[i]=sr.nextInt();
        }
        System.out.print("Mảng ban đầu là: ");
        for (int i:array
             ) {
            System.out.print(i+" ");
        }
        System.out.println();
       // đảo ngược các phần tử
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.print("Mảng sau khi đảo ngược: ");
        for (int i:array){
            System.out.print(i+" ");
        }


    }
}

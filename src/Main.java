import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int [] list={15,12,788,1,-1,-788,2,0};
        int number;
        System.out.println("Dizi : "+Arrays.toString(list));

        System.out.print("Girilen Sayı : ");
        number=input.nextInt();
        Arrays.sort(list);
        int min =list[0];
        int max=list[7];
        for (int i:list){
            if (i>min&&i<number){
                min=i;
            }

            if (i<max&&i>number){
                max=i;
            }

        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+max);
    }
}
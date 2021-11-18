import java.util.Scanner;

/**
 * @author fatih-git
 */

public class artık {

    public static void main(String[] args) {

        int year;
        Scanner input=new Scanner(System.in);

        System.out.print("Bir yıl giriniz: ");
        year=input.nextInt();

        if(year%4==0){
            System.out.println("Girilen yıl bir artık yıldır.");
        }
        else{
            System.out.println("Girilen yıl bir artık yıl değildir.");
        }

    }

}

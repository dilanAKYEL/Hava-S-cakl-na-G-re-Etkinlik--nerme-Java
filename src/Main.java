import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

        int heat;

        System.out.print("Sıcaklığı Giriniz:");
        heat=input.nextInt();

        if (heat<5){
            System.out.print("Kayak Yapabilirsiniz.");

        }
        else if (heat>=5 && heat<=25){
            if (heat<15){
                System.out.print("Sinemaya Gidebilirsiniz.");
            }
            if (heat>=10){
                System.out.print("Pikniğe Gidebilirsiniz.");
            }
            else{
                System.out.print("Yüzmeye Gidebilirsiniz.");
            }
        }
    }





}

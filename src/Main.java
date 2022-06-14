import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number of weeks");
        Scanner input = new Scanner(System.in);
        String weeks =  input.nextLine();
        int num =Integer.parseInt(weeks);
        System.out.println((7*num)+" Days");
        System.out.println((24*(7*num))+" Hours");
        System.out.println(60*(24*(7*num))+" Minutes");
        System.out.println(60*(60*(24*(7*num)))+" Seconds");


    }

}

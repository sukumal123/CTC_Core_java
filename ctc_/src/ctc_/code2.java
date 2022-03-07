package ctc_;
import java.util.Scanner;

public class code2 {

    public static void main(String[] args) {
    	//find out user's percentage in 3 subject
        var xy = new Scanner(System.in);
        System.out.println("marks in math");
        int a = xy.nextInt();
        System.out.print("marks in english");
        int b = xy.nextInt();
        System.out.print("marks in hindi");
        int c =xy.nextInt();
        int total=(a+b+c);
        int percentage= total/3;
        System.out.print("percentage:-" + percentage);
    
		

	}

}

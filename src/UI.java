import java.util.Scanner;

public class UI {
    public static Scanner sc = new Scanner(System.in);
    public void print(String s){
        System.out.println(s);
    }
    public String read(String s){
        print(s);
        return sc.nextLine();
    }
}

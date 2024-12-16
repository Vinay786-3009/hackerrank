//it as no end it comes on how many statements u write
import java.util.*;
public class endfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=1;
        while(sc.hasNext())
        {
            String s=sc.nextLine();
            System.out.println(n+" "+s);
            n++;
        }
        }

}

 
package calculatorapplication;
 
import java.util.Scanner;

public class ReadInput {
    public static String read(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input expression eg 4+3/5");
        String inputLine=scanner.nextLine();
        scanner.close();
        return inputLine;
    }
}

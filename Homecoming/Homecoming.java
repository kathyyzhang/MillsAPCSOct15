/** 
 * preparation for homecoming <3
 * 
 * @author Kathy Zhang
 * @version 10.25.15
 */
import java.util.*;
public class Homecoming
{

    public static void main(String[] args){
        getADate();
        System.out.println();
        damage();
    }

    public static void getADate(){
        Scanner userinput=new Scanner(System.in);      
        System.out.println("Hi! My name is Kathy.");
        System.out.println("What's your name?");         
        String x= userinput.nextLine();
        System.out.println("Nice to meet you "+x);
        System.out.println("Would you like to go to Homecoming with me?");
        String y= userinput.nextLine();
        System.out.println("Great! It'll be a magical night-- Kathy and "+x+" going to the Mills Homecoming Dance 2015!");
    }

    public static void damage(){
        Scanner userinput=new Scanner(System.in);    
        System.out.println("Let's figure out the damage for the evening.");
        System.out.println();
        System.out.println("What are your estimated costs?");
        System.out.print("Tickets (each): $");
        int ticket= userinput.nextInt();
        System.out.print("Flowers (total for both of you): $");
        int flowers= userinput.nextInt();
        System.out.print("Pictures: $");
        int pic=userinput.nextInt();
        System.out.print("Dinner (per meal): $");
        int dinner= userinput.nextInt();
        System.out.print("New clothes (tie to match dress? Vest? Dress? Non-tennis shoes?): $");
        int clothes= userinput.nextInt();
        System.out.print("Any other expenses: $");
        int other= userinput.nextInt();
        System.out.println();
        double total=1.0825*(dinner*2+clothes)+(flowers+pic+other+ticket*2);
        System.out.print("So, you should expect to spend, including tax, $"+total);
        System.out.print("If you split the costs with your date, each will pay: $"+total/2);
        
    }
    public static void statsTable(int t, int f, int p, int d, int c, int o){
        System.out.println("MHS Homecoming 2015");
        System.out.println("Kathy and ");
        System.out.println();
        System.out.println("Tickets (total):\t "+t);
        System.out.println("Flowers (for both of you):\t "+f*2);
        System.out.println("Pictures:\t "+p);
        System.out.println("Dinner (for two):\t "+d*2);
        System.out.println("New clothes:\t "+c);
        System.out.println("Any other expenses:\t "+o);
        System.out.println();
    }
}

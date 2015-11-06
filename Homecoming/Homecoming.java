/** 
 * preparation for homecoming ... with Shanda Lear <3 
 * 
 * @author Kathy Zhang
 * @version 10.25.15
 */
import java.util.*;
public class Homecoming
{

    public static void main(String[] args){
        getADate();
    }

    public static void getADate(){
        //introductions :)
        Scanner userinput=new Scanner(System.in);      
        System.out.println("Hi! My name is Shanda Lear.");
        System.out.println("What's your name?");         
        String name= userinput.nextLine();
        System.out.println("Nice to meet you "+name+".");
        System.out.println("Would you like to go to Homecoming with me?");
        String y= userinput.nextLine();
        System.out.println("Great! It'll be a sparkling night-- Shanda Lear and "+name+" going to the Mills Homecoming Dance 2015! \t-wink wink-");
        damage(name);
    }

    public static void damage(String n){
        //calculating costs and such
        Scanner userinput=new Scanner(System.in);    
        System.out.println();
        System.out.println("-♫ ♪ cue classical music ♩ ♬-");
        System.out.println();
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
        double total=1.0825*(dinner*2+clothes)+(flowers+pic+other+ticket*2)*100;
        int total2= (int)total;
        double totale=total2/100.0;        
        System.out.println("So, you should expect to spend, including tax, $"+totale);
        int half=total2/2;
        double half2= half/100.0;        
        System.out.println("If you split the costs with your date, each will pay: $"+half2);
        System.out.println();
        statsTable(n,ticket, flowers, pic, dinner, clothes, other);

    }

    public static void statsTable(String name,int t, int f, int p, int d, int c, int o){
        //final print out of cost and yea
        System.out.println("MHS Homecoming 2015");
        System.out.println("Shanda Lear and "+name+" <3");
        System.out.println();
        System.out.println("Tickets (total):          \t $"+t);
        System.out.println("Flowers (for both of you):\t $"+f*2);
        System.out.println("Pictures:                 \t $"+p);
        System.out.println("Dinner (for two):         \t $"+d*2);
        System.out.println("New clothes:              \t $"+c);
        System.out.println("Any other expenses:       \t $"+o);
        System.out.println();
        double sub=(t+f*2+p+d*2+c+o)*100;
        int sub2= (int)sub;
        double subtotal=sub2/100.0;
        System.out.println("\t    Subtotal     $"+subtotal);
        double sales=0.0825*(d*2+c)*100;
        int sales2=(int)sales;
        double salestax=sales2/100.0;
        System.out.println("\t    Sales Tax    $"+salestax);
        double total=subtotal+salestax;
        System.out.println("\t    Total        $"+total);        
    }
}

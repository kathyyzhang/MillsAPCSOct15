/**
 * Write a description of class Equestria here.
 * 
 * @author Kathy Zhang
 * @version 10.13.15
 */
public class Equestria
{
   public static void main(String[] args)
    {
        /*//Baltimare
        int xbalt=31;
        int ybalt=14;
        //Manehattan
        int xmane=33;
        int ymane=7;
        //Los Pegasus
        int xlos=8;
        int ylos=17;
        //Neighagara
        int xneigh=24;
        int yneigh=7;
        //Badlands
        int xbad=27;
        int ybad=22;
        //Ponyville
        int xpony=17;
        int ypony=13;*/
        
        System.out.print("Distance from Baltimare to Manehattan = ");
        distance(8, 17, 27, 22);
        
        //dist(8, 17, 27, 22, 17, 13);
        //roadTrip();
    }

    public static double distance(int x1, int y1, int x2, int y2){
       //double d1= Math.sqrt(Math.pow(double x2-x1, 2)+Math.pow(double y2-y1, 2))*100;
       //return d1;
       
    }

    /*public static void roadTrip(){
    int diameter=35;
    double c=diameter*Math.PI;
    return c;*/

    public static double dist(int x1, int y1, int x2, int y2, int x3, int y3){ 
        double distx1x2= Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        double distx2x3= Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
        double distx1x3= Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        return distx1x3;
    }  
    
}

/**
 * Finds distances between places in Equestria. Also serves as a handy tour guide.
 * 
 * @author Kathy Zhang
 * @version 10.17.15
 */
public class Equestria
{
    public static void main(String[] args)
    {
        //Baltimare
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
        int ypony=13;
        //Cloudville
        int xcloud=15;
        int ycloud=8;
        //Dodge City
        int xdodge =23;
        int ydodge=17;
        //Canterlot
        int xcant=18;
        int ycant=9;
        //double d=distance(8, 17, 27, 22);
        double d=distance(xbalt, ybalt, xmane, ymane);
        System.out.println("Distance from Baltimare to Manehattan = " + d);
        double d2=distance(xlos, ylos, xneigh, yneigh);
        System.out.println("Distance from Los Pegasus to Neighagara Falls = " + d2);
        double d3=distance(xbad, ybad, xpony, ypony);
        System.out.println("Distance from Badlands to Ponyville = " + d3);
        //diameter= distance from Cloudville to Ponyville
        double dia=distance(xcloud, ycloud, xpony, ypony);
        System.out.println("The diameter of the trip is "+dia +".");
        double trip=roadTrip(dia);
        System.out.println("The total length of the trip is "+trip);
        //three points: Manehattan, Dodge City, Canterlot 
        double x=distance(xmane, ymane, xdodge, ydodge);
        double y=distance(xdodge, ydodge, xcant, ycant);
        double z=distance(xcant, ycant, xmane, ymane);
        System.out.println("Distance from Manehattan to Dodge City = " + x);
        System.out.println("Distance from Dodge City to Canterlot = " + y);
        System.out.println("Distance from Canterlot to Dodge City = " + z);
        tour(x, y, z);
        //four-coordinate trip consists of Ponyville, Manehattan, Badlands, and Cloudville
        double max= longestTrip(xpony, ypony, xmane, ymane, xbad, ybad, xcloud, ycloud);
        System.out.println("The longest distance is between all pairs of destinations is "+max+ "."); 
        
    }

    public static double distance(int x1, int y1, int x2, int y2){
        double d1= Math.sqrt(Math.pow( x2-x1, 2)+Math.pow(y2-y1, 2))*100;
        int d2 = (int)d1;
        return 0.01 * d2;

    }

    public static double roadTrip(double diameter){
        //diameter= distance from Cloudville to Ponyville
        double c=diameter*Math.PI*100;
        int c2=(int)c;
        return 0.01*c2;
    }

    public static void tour(double d1, double d2, double d3){
        //d1=Manehattan, d2=Dodge City, d3=Canterlot
        //angle between d2 and d3
        double a= Math.acos((Math.pow(d1,2)-Math.pow(d2,2)-Math.pow(d3,2))/(-2*d2*d3))*(180/Math.PI)*100;
        int a2=(int)a;
        
        //angle between d1 and d3
        double b= Math.acos((Math.pow(d2,2)-Math.pow(d1,2)-Math.pow(d3,2))/(-2*d1*d3))*(180/Math.PI)*100;
        int b2=(int)b;
        //angle between d2 and d1
        double c= Math.acos((Math.pow(d3,2)-Math.pow(d2,2)-Math.pow(d1,2))/(-2*d1*d2))*(180/Math.PI)*100;
        int c2=(int)c;
        System.out.println("The angle between Dodge City and Canterlot is "+0.01*a2+" degrees.");
        System.out.println("The angle between Manehattan and Canterlot is "+0.01*b2+" degrees.");
        System.out.println("The angle between Dodge City and Manehattan is "+0.01*c2+" degrees.");

    }

    public static double longestTrip(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){ 
        double distx1x2= distance(x1, y1, x2, y2);
        double distx1x3= distance(x1, y1, x3, y3);
        double distx1x4= distance(x1, y1, x4, y4);
        double distx2x3= distance(x2, y2, x3, y3);
        double distx2x4= distance(x2, y2, x4, y4);
        double distx3x4= distance(x3, y3, x4, y4);
        return Math.max(Math.max(Math.max(distx1x2, distx1x3), Math.max(distx1x4, distx2x3)), Math.max(distx2x4, distx3x4));
        
    }  

}

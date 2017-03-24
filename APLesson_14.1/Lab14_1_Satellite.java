import java.util.ArrayList;
public class Lab14_1_Satellite
{
	public static void main(String[]args)
	{
		ArrayList<Lab14_1_Location> locate = new ArrayList<>();
		double[] home = {0,0};
		double [] honLoc = {5,6};
		locate.add(new Lab14_1_Honda(honLoc));
		locate.add(new Lab14_1_Toyota("8, 9"));
		locate.add(new Lab14_1_GMC(3,8));
		
		 String printout = "\n" +
               "==========================" + "\nStarting locations...";


       for (Lab14_1_Location l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }


       printout += "\n\nDistance from home...";


		for (Lab14_1_Location l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }
	   
	   printout += "\n\n" + "==========================\n";
	   
	   for (Lab14_1_Location l : locate)
	   {
		   double one = Math.random() * 99 + 1;
		   double two = Math.random() * 99 + 1;
		   ((Lab14_1_Car)l).move(one, two);
	   
	   
			printout += "\nAfter " + l.getID() + " moved (" + one + ", " + two + ")" + "\nNew location : " + "(" + one + ", " + two + ")" + "\n";
	   }
	   
	   for (Lab14_1_Location l : locate)
	   {
		   printout += "\nDistance for " + l.getID() + ": " + getDistance(l.getLoc(), home);
	   }
	   
	    printout += "\n\n" + "==========================\n";
		
		System.out.println(printout);
   }


   public static String getDistance(double[] car, double[] home)
   {
       return String.format("(%.2f)", Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2))));
   }


   public static String getLocation(double[] loc)
   {
       return String.format("(%.2f, %.2f)", loc[0], loc[1]);
   }
}
	
	

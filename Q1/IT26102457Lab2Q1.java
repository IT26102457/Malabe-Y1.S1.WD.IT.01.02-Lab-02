public class IT26102457Lab2Q1
{
  public static void main(String[]args)
  {
   int perimeter=100;//given permiter of the fence
    double length;
    double width;

     //width to length ratio:3/4=0.75
     double width_ratio=0.75;

//calculate the length and width
//using the formula : perimeter = 2*(length+width)
//substitute width=width_ratio*length
//100=2*(length+(width_ratio*length))
//100=2*length*(1+width_ratio)
//length=100/(2*(1+width_ratio));

length=perimeter /(2*(1+width_ratio));	
width=width_ratio*length;
//output
System.out.println("length of the fence:"+length);
System.out.println("width of the fence :"+width);
  
  }
  
}
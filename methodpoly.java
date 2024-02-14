class methodpoly
{
  public static void main(String args[])
  {
   int r1=add(10,20);
   System.out.println("result of addition is(2 integers)="+r1);
   int r2=add(100,200,300);
   System.out.println("result of addition of 3 integers="+r2);
   double r3=add(25.5,50.5);
   System.out.println("result of addition 2 double values"+r3);
   }
 public static int add(int a,int b)
   {
     return(a+b);
	}
 public static int add(int a,int b,int c)
    {
	 return(a+b+c);
	 }
 public static double add(double a,double b)
    {
	  return(a+b);
	 }
}
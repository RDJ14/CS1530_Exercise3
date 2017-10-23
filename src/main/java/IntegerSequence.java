import java.lang.Integer;

public class IntegerSequence{

  public static int triangle(int number)
  {
    int temp = number;
    int triangle = 0;
    while(temp > 0)
    {
      triangle += temp;
      temp--;
    }
    return triangle;
  }

  public static int lazyCater(int number)
  {
    int temp = number;
    int cater = (temp * temp) + temp + 2;
    cater = cater / 2;
    return cater;
  }

  public static void main(String[] args) {
    if(args.length != 1)
      {
        System.out.println("You must specify an integer");
        System.exit(1);
      }
      int number = 0;
      try{
        number = Integer.parseInt(args[0]);
      }
      catch(Exception e)
      {
        System.out.println("You must specify an integer");
        System.exit(1);
      }

      int triangle = 0;
      int lazyCater = 0;

      triangle = triangle(number);
      lazyCater = lazyCater(number);

      System.out.println("Tri(" +number + ") = " +triangle);
      System.out.println("Lazy(" +number + ") = " +lazyCater);
  }
}

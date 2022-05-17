public class Narrowing
{
public static void main(String[] args)
{
double d = 200.06;
 
long l = (long)d;
 
int i = (int)l;
System.out.println("Double Data type value "+d);
 
System.out.println("Long Data type value "+l);

System.out.println("Int Data type value "+i);
}
}
public class ExplicitTest {
public static void main(String args[])
{
byte b = 70;
 
b = (int)(b * 2);
System.out.println(b);
}
}

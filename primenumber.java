package week1day1;

//import java.util.Iterator;

public class primenumber {

	public static void main(String[] args) {
int input = 13;
Boolean flag = false;
for (int i = 2; i <= input/2; i++)
{
if(input%i ==0)
{
	flag=true;
	break;
}
}
if(flag==false)
{
System.out.println(input + " is Prime");	
	
}
else
{
System.out.println(input + " is not Prime");	
	
}

	
}
}

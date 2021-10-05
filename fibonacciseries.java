package week1day1;

import java.util.Iterator;

public class fibonacciseries {

	public static void main(String[] args) {
int range = 8,firstnumber = 0,secondnumber = 1,sum = 0;{
	System.out.println(firstnumber);
for (int i = 1; i < range; i++) {
sum=firstnumber+secondnumber;
firstnumber=secondnumber;
secondnumber=sum;
System.out.println(firstnumber);
	
}		
	}
}

	}


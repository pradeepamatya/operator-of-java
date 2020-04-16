package com.pradeep;

public class Main {

    public static void main(String[] args) {
	int result  = 1+2;
	System.out.println("1=2=" +result);

	int previousResult = result;

	result = result -1;
	System.out.println(previousResult + "- 1 =" +result);

	previousResult = result;

	result = result *10;
	System.out.println(previousResult + " * 10 =" +result);

	previousResult = result;

	result = result /5;
	System.out.println(previousResult + " / 5 =" +result);

	previousResult = result;

	result = result %3;
	System.out.println(previousResult + " % 3 =" +result);

	previousResult = result;
	result =result +1;
	System.out.println("Result is now " + result);

	result ++;
	System.out.println("Result is now " + result);

	result --;
	System.out.println("Result is now " + result);

	result +=2;
	System.out.println("Result is now " + result);

	result *=10;
	System.out.println("Result is now " + result);

	result -=10;
	System.out.println("Result is now " + result);

	result /=10;
	System.out.println("Result is now " + result);

	boolean isAlien = false;
	if (isAlien ==true)
	    System.out.println("It is not an alien");

	int topScore = 80 ;
	if(topScore <100)
	    System.out.println("You got the high Score");

	int secondTopScore = 81;
	if((topScore>secondTopScore) &&(topScore < 100))
	    System.out.println("Greater than Second top score and less than 100");

	if((topScore>secondTopScore) || (topScore < 100))
	    System.out.println("One of the test is true");

	boolean isCar = true;
	boolean wasCar = isCar ? true:false;
	if(wasCar)
	    System.out.println("was car is true");

	double valueOne = 20d;
	double valuetwo = 80d;
	double total = (valueOne + valuetwo) * 25;
	System.out.println("TOTAL IS " + total);
	double theRemainder =  total % 20;
	System.out.println("THe remainder is " + theRemainder);
	if(theRemainder<= 20)
	    System.out.println("the result is got the remainder ");


    }
}

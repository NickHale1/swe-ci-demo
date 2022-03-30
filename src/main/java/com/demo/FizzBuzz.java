package com.demo;

public class FizzBuzz 
{
    String processNumber(int num)
	{	
    	if(num <= 0) {
			return "Invalid";
		}
		if(num%15==0) {
			return "FizzBuzz";
		} else if (num%5==0) {
			return "Buzz";
		} else if (num%3==0) {
			return "Fizz";
		}

		return String.valueOf(num);
	}
	
	String processNumbers (int[] numList)
	{
    	if(numList==null){
			return "Invalid";
		}
		if(numList.length<=0) {
			return "Invalid";
		}
		int i =0;
		String output="";
		while(i<numList.length-1) {
			output += processNumber(numList[i]);
			output += ", ";
			i++;
		}
		output += processNumber(numList[numList.length-1]);
		if (output.contains("Invalid")){
			return "Invalid";
		}

		return output;
	}

	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		System.out.println(fb.processNumbers(new int[] {1, 2, 3, 5, 6, 10, 15, 30}));
	}

}

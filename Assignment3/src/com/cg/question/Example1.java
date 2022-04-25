// There are n people standing in a circle waiting to be executed. The counting out begins at some point in the circle and proceed around the circle in a fixed direction. In each step , a certain number of people are skipped and the next person is executed. the elimination proceeds around the circle(which is becoming smaller and smaller as the executed people are removed),until only the last person remains,who is given freedom.Given the total number of person n and a number k which indicates that k-1 persons are skipped and K th person is killed in circle.the task is to choose the place in the initial circle so that you are the last one remaining and so survive.

package com.cg.question;
class People
{
	static int Priya(int n , int k)
	{
		if(n==1)
		return 1;
		else
			return (Priya(n-1 , k)+k-1)%n+1;
	}


	public static void main(String[] args) 
	{
		int n=5;
		int k=2;
		System.out.println("The choosen place is "+ Priya(n , k));
	}
}

	
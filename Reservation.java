import java.util.Scanner;
import java.util.Random; 
import java.lang.*;
class Reservation
{
int seats=0;
void booking()
{
	if(seats==72)
		System.out.println("RESERVATION IS FULL");
	else
	{
		Scanner s1=new Scanner(System.in);
		Random ran= new Random(); 
		System.out.println("Enter your name\t");
		String name=s1.nextLine();
		System.out.println("Enter your age\t");
		int age=s1.nextInt();
		System.out.println("Enter the Date\t");
		int date=s1.nextInt();
		System.out.println("Enter the pickup stop\t");
		String plocation=s1.nextLine();
		System.out.println("Enter the reaching stop\t");
        String rlocation=s1.nextLine();
		if(age>=65)
		{
			System.out.println("(i) Lower Berth (LB)\n(ii) Upper Berth (UB)\n(iii) Middle Berth (MB)\n(iv) Side Lower (SL)\n(v) Side Upper (SU)\nEnter your choice of seat\t");
			int ch=s1.nextInt();
  			System.out.println("Reservation of Mrs. "+name+"\n From "+plocation+" To "+rlocation+"\nFor seat type "+ch+"\nDate: "+date+"/jan/2018 Time: 5.0 pm\nIs done successfullly..");
		    seats++;
		}
		else
		{
			int sran= ran.nextInt(4);
			if(sran==0)
				System.out.println("Lower Berth seat is available for you");
			else if(sran==1)
				System.out.println("Upper Berth seat is available for you");
			else if(sran==2)
				System.out.println("Middle Berth seat is available for you");
			else if(sran==3)
				System.out.println("Side Lower seat is available for you");
			else if(sran==4)
				System.out.println("Side Upper seat is available for you");
			System.out.println("Reservation of Mrs. "+name+"\nFrom "+plocation+" To "+rlocation+"\nDate: "+date+"/jan/2018 Time: 5.0 pm\nIs done successfullly..");
		    seats++;
		}
	}
}
void availability()
{
	System.out.println("Only "+(72-seats)+" seates are available..");
}
public static void main(String args[])
{
	Reservation r=new Reservation();
	Scanner s1=new Scanner(System.in);
	System.out.println("Welcome to Railway Reservation...\n");
	while(true)
	{
		System.out.println("1) Reservation process \n2) Availability of seats \n3) Exit \nEnter your choice\t");
		int choice=s1.nextInt();
		switch(choice)
		{
			case 1: r.booking();
			break;
			case 2: r.availability();
			break;
			case 3: System.exit(0);
			default :System.out.println("!!Choose correct option..");
		}
	}
}
}
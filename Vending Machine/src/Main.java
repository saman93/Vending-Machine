/*
 * Take money from user
 * Take the order
 * See if the money is enough
 * if yes
 * 		deliver the item
 * 		change = initial money - cost of item 
 * else
 * 		print: not enough money
 * 		change = initial money
 * Give back the change
 * Formula to give back the change in coins:
 * 			q = (int) (chg / 0.25);
 *			chg = chg- q*0.25;
 *			d = (int) (chg / 0.10);
 *			chg = chg- d*0.10;
 *			n = (int) (chg / 0.05);
 *			chg = chg- n*0.05;
 *			pn = (int) (chg / 0.01);
 *
 * q : Quarter
 * chg : Change
 * d : Dime
 * n : Nickle
 * pn : Penny
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int q, d, n, pn;
		int p;
		double bc;
		int m;
		double chg;
		String s;
		Scanner keyboard = new Scanner(System.in);
		
		do{
			q =0;
			d =0;
			n =0;
			pn =0;
			p =0;
			m =0;
			chg =0;
			bc =0;
			s = null;
			
			System.out.println("Insert money:");
			System.out.println("0. Finish Payment");
			System.out.println("1. 0.01$");
			System.out.println("2. 0.05$");
			System.out.println("3. 0.10$");
			System.out.println("4. 0.25$");
			System.out.println("5. 1.00$");
			System.out.println("6. 5.00$");
			
			do{
				
				m =keyboard.nextInt();
				
				if(m == 1)
					bc+=0.01;
				if(m == 2)
					bc+=0.05;
				if(m == 3)
					bc+=0.10;
				if(m == 4)
					bc+=0.25;
				if(m == 5)
					bc+=1;
				if(m == 6)
					bc+=5;
				
			}while(m!=0);
			
	
			System.out.println("You paid "+ bc+ "$");
			System.out.println();
			
			
			do{
				System.out.println("Which item are you intrested in?");
				System.out.println("0.Cancel Order");
				System.out.println("1.Candy: 1.49$");
				System.out.println("2.Soda: 1.99$");
				System.out.println("3.Chips: 2.49$");
				System.out.println("4.Gum: 0.99$");
				System.out.println("5.Water: 0.49$");
				p = keyboard.nextInt();
				
			}while(p>5 || p <0);
			System.out.println();
			
			if(p==0){
				System.out.print("Canceling transaction");
				System.out.print(".");
				System.out.print(".");
				System.out.print(".");
				System.out.print(".");
				System.out.println(".");
				
				chg = bc;
			}
			
			
			if(p==1){
				if(bc>=1.49){
					System.out.println("Here's your Candy");
					chg =bc -1.49;
				}
				else{
					System.out.println("Not enough money");
					chg =bc;
				}
			}
			
			
			if(p==2){
				if(bc>=1.99){
					System.out.println("Here's your Soda");
					chg =bc -1.99;
				}
				else{
					System.out.println("Not enough money");
					chg =bc;
				}
			}
			
	
			if(p==3){
				if(bc>=2.49){
					System.out.println("Here's your Chips");
					chg =bc -2.49;
				}
				else{
					System.out.println("Not enough money");
					chg =bc;
				}
			}
			
			
			if(p==4){
				if(bc>=0.99){
					System.out.println("Here's your Gum");
					chg =bc -0.99;
				}
				else{
					System.out.println("Not enough money");
					chg =bc;
				}
			}
			
			
			if(p==5){
				if(bc>=0.49){
					System.out.println("Here's your Water");
					chg =bc -0.49;
				}
				else{
					System.out.println("Not enough money");
					chg =bc;
				}
			}
			
			
			q = (int) (chg / 0.25);
			chg = chg- q*0.25;
			d = (int) (chg / 0.10);
			chg = chg- d*0.10;
			n = (int) (chg / 0.05);
			chg = chg- n*0.05;
			pn = (int) (chg / 0.01);
			
			System.out.println();
			System.out.println("Here's your change");
			System.out.println();
			System.out.println(""+ q+ " Quarter/s");
			System.out.println(""+ d+ " Dime/s");
			System.out.println(""+ n+ " Nickle/s");
			System.out.println(""+ pn+ " Penny/s");
			System.out.println();
			System.out.println();
			System.out.println("Do you want anything else? yes/no");
			
			s = keyboard.next();
		
		}while(s.equalsIgnoreCase("yes"));
		
		System.out.println(".");
		System.out.println(".");
		System.out.println("***Thank You***");
		System.out.println();
		
	}
		
	

}

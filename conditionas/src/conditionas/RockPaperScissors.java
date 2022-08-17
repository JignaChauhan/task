package conditionas;
import java.util.*;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
       System.out.println("0 is for Rock:");
       System.out.println("1 is for Paper:");
       System.out.println("2 is for Scissors:");
        int computer_choice;
        int computerwon;
        int mychoice=0;
        int me=0;
        int game=1;
        
        while(game>=5) {
        	Random rand=new Random();
        	computer_choice=rand.nextInt(2);
        	computer_choice=sc.nextInt();
        	computerwon=rand.nextInt(2);
        	computerwon=sc.nextInt();
        	mychoice=rand.nextInt(2);
        	mychoice=sc.nextInt();
        	
        	switch(mychoice) {
        	case 0:
        		System.out.println("You Choose Rock:");
        		break;
        	case 1:
        		System.out.println("You Choose Paper:");
        		break;
        	case 2:
        		System.out.println("You Choose Scissors:");
        }
        	switch(computer_choice) {
        	case 0:
        		System.out.println("Computer Choose Rock:");
        		break;
        	case 1:
        		System.out.println("Computer Choose Paper:");
        		break;
        	case 2:
        		System.out.println("Computer Choose Scissors:");
        	}
        	if(computer_choice==mychoice) {
        		System.out.println("Match is tie!!");
        	}
        	else if(computer_choice==0 && mychoice==1) {
        		System.out.println("i won Game!! Computer lose");
        		me++;
        	}
        	else if(computer_choice==0 && mychoice==2) {
        		System.out.println("I lose Game And Computer Won!! ");
        		computerwon++;
        	}
        	else if(computer_choice==1 && mychoice==0) {
        		System.out.println("Computer Won!! Game And I lose");
        		computerwon++;
        	}
        	else if(computer_choice==1 && mychoice==2) {
        		System.out.println("I Won Game!! And Computer lose Game");
        		me++;
        	}
        	else if(computer_choice==2 && mychoice==0) {
        		System.out.println("i Won Game!! And Computer lose Game");
        	    me++;
        	}
        	else if(computer_choice==2 && mychoice==1) {
        		System.out.println("Computer Won Game!! And i lose Game");
        	    computerwon++;
        	}
        	if(game==5) {
        		break;
        	}
        	game++;
        	
        	
        }
        Random rand=new Random();
        computerwon=rand.nextInt(2);
    	computerwon=sc.nextInt();
    	me=rand.nextInt(2);
    	me=sc.nextInt();
    	
    	
        System.out.println("computer"+":"+computerwon);
        System.out.println("me"+":"+me);
        
        if(computerwon>me) {
        	System.out.println("Computer Won the Game!!");
        }
        else if(computerwon==me) {
        	System.out.println("Match tiee!!");
        }
        else {
        	System.out.println("I won Game And Computer lose");
        }
	
	
	}
	

}

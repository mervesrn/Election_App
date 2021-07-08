import java.util.ArrayList;
import java.util.Scanner;

public class Election {
public int[] votes=new int[100];
public int highestNumOfVotes;
ArrayList<Citizen> citizens=new ArrayList<Citizen>();
public int totalVotes= 0;

public Citizen currentWinner;

ArrayList<Citizen> candidates=new ArrayList<Citizen>();



public Election() {
	
}

public String elect() throws InvalidAgeException {
	
	for(int i=0; i<citizens.size();i++) {
		try {
			
				if(validate_citizen(citizens.get(i).getAge(),citizens.get(i))) {
				
				int votes_index=citizens.get(i).votesFor(candidates.size());
				 votes[votes_index]++;
				   System.out.println(citizens.get(i).getName() + " -->  Voted for --->  " + candidates.get(votes_index).getName() +"  /this candidate's total vote number:"+ votes[votes_index] );
				   totalVotes++;
				   System.out.println();
				}   
				else throw new InvalidAgeException();
		} catch (InvalidAgeException e) {
			System.out.println();
			e.printStackTrace();
			
		
		}
			
		
	}	
	
		return "";
		
		//burası tekrar düzenlenicek
}


public int findHighest() {
	
	int highestNumOfVotes_index=0;

	for(int i=0; i<votes.length;i++) {
		
		if(votes[i]>=highestNumOfVotes) {
			highestNumOfVotes=votes[i];
			highestNumOfVotes_index=i;
		}
	}
	this.currentWinner=candidates.get(highestNumOfVotes_index);
	return highestNumOfVotes;
//	tekrar düzeltilicek olmadı
}


public Citizen findCurrentWinner() {
	int highestNumOfVotes_index=0;

	for(int i=0; i<votes.length;i++) {
		
		if(votes[i]>=highestNumOfVotes) {
			highestNumOfVotes=votes[i];
			highestNumOfVotes_index=i;
			
		}
	}
	this.currentWinner=candidates.get(highestNumOfVotes_index);
	
	return this.currentWinner;
}

public void listCandidates() {
	
	System.out.println("CANDITATES:");
	
	
	if(!candidates.isEmpty()) {
		
	for(int i=0;i<candidates.size();i++) {
	try {
	
	
	 throw new InvalidAgeException();
	} catch(InvalidAgeException e) {
		
		
	}
			
			System.out.println(candidates.get(i).toString());
		
			
	}
	}	
		
	}
	



public void listCitizens() {
	
	System.out.println("CITIZENS:");
	
	for(int i=0;i<citizens.size();i++) {
		
		System.out.println(citizens.get(i).toString());
		
	}
	
}

public  void validate_candidate(int age,Citizen c) {
	
	
		try {
			if(!(age<18)) {
				
				
				System.out.println(age + " is greater than 18");
				candidates.add(c);
				System.out.println(c.toString());
			} 
			else throw new InvalidAgeException();
		} catch (InvalidAgeException e) {
//			e.printStackTrace();
		System.out.println("Too young to be candidate!");
		System.out.println(c.toString());
			
		}
	
		
}

public  boolean  validate_citizen(int age,Citizen c) {
	
	try {
		if(!(age<18)) {
			
			
			System.out.println(age + " is greater than 18");
			
			return true;
		} 
		else throw new InvalidAgeException();
	} catch (InvalidAgeException e) {
//		e.printStackTrace();
	System.out.println("Too young to vote!");
	System.out.println(c.toString());
		return false;
	}
	
}





public static void main(String[] args)  {
	Election elec=new Election();
	
	
	
	
	int sayi=1;
	  String etc="";
	while(sayi==1){
		System.out.printf("\n\n%10s******************************************************************\n",etc);
		System.out.printf("%10s*%59s*\n",etc,etc);
		System.out.printf("%10s*----------------##- ELECTION -##----------------*\n",etc);
		System.out.println("Press 1: Add a candidate in this election");
		System.out.println("Press 2: Print the list of candidates in this election");
		System.out.println("Press 3: Print the list of CITIZEN TO VOTE in this election");
		System.out.println("Press 4: Learn the highest number of votes");
		System.out.println("Press 5: Learn the current winner in this election");
		System.out.println("Press 6: Learn the total vote:");
		System.out.println("Press 7: EXIT");
		System.out.printf(
			   "%10s******************************************************************\n",etc);
		System.out.println(":");
	
	
	Scanner scanner = new Scanner(System.in);
	
	int choice= scanner.nextInt();
	
	
	
	int flag=1;
	while(flag==1){  
		
	   switch(choice){
	   
	   case 1:{
		   Citizen c=new Citizen();

            elec.validate_candidate(c.getAge(),c);
           
		   
		   break;
		  
		   }
	   	
	   case 2:
		
		   
		   if(elec.candidates.isEmpty()) {
				 System.out.println("Sorry!... THE LIST IS EMPTY."); 
				 System.out.println("..........There is no candidates  =(..........");
				 break;
			  }
		   else {
			   
			  try {
				
				elec.listCandidates();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		
		   break;
		   } 
	   case 3:
	   {
		
		   Citizen dummy=new Citizen();
		   
		   for(int i=0;i<15;i++) {
			   Citizen dummy2=new Citizen();
			   elec.citizens.add(dummy2);
			   
		   }
		   System.out.println(); 
		  
		   elec.listCitizens();
		   System.out.println();
		   try {
			String a=elec.elect();
		} catch (InvalidAgeException e) {
			

		}
		   break;
		   
		   }
	 
	   case 4:
	   {
		   if(elec.candidates.isEmpty()) {
			 System.out.println("Sorry!... Candidates LIST IS EMPTY."); 
			 System.out.println("..........There is no candidate =(..........");
			
		  }
		   else {
			   
			   System.out.println("Highest number of votes is " +elec.findHighest());
			System.out.println(); 
			   
		   }
			   
		   break;
	   } 
	   case 5:
	   {
		   
		   Citizen winner=new Citizen();
		   if(elec.candidates.isEmpty()) {
				 System.out.println("Sorry!... Candidates LIST IS EMPTY."); 
				 System.out.println("..........There is no candidate  =(..........");
				 break;
			  }
		   else {
			   
			   winner= elec.findCurrentWinner();
			   
			   System.out.println("Current winner is "+ winner.toString() );
		   } 
		   break;
			   		}
	   case 6:
	   {
		 System.out.println(elec.totalVotes ); 
		 break;
		 
		 
		   }

	   
	   case 7:
		   flag=0;
		   System.exit(flag);
		   break;
		   
	   default:
		   System.out.println("There is not found in MENU!!");
		   System.out.println("Invalid Option Entered. Please Enter Correct Option.");
		   break;
	
                   }
	   break;
             }
	
	
         }
	
	
	
}

}



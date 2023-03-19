package Task2;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
        int noOfRounds=1;

		
		String playAgain = "yes";
		
		
		while 
	        
	        (playAgain.equals("yes") || playAgain.equals("YES"))
		{
			
			System.out.println("____NUMBER GUESSING GAME____");
	        System.out.println("____START PLAYING____");
	        System.out.println("Enter 1 to Start the game \nEnter 2 for to Exit");
	        System.out.println("Enter your Number : ");
        
	        int attempt = 1;
	        int NoOfGuesses =1;	        
	        int guessFromUser;
	        int userChoice;
	        Scanner choice = new Scanner(System.in);
	        userChoice = choice.nextInt();
    	
    	
	    	 int systemNumber = (int) (Math.random() * 99 + 1);   
	        Scanner InputFromUser = new Scanner(System.in);
	        
	        
	        if(userChoice==1) {
       
        
        
		        do{
			        

		            System.out.println("\nRound " + noOfRounds + " starts..");

		            System.out.print("Enter a guess number between 1 to 100\n");
		            
		            if(InputFromUser.hasNextInt()) 
			            {
			            	guessFromUser = InputFromUser.nextInt();
			                if (guessFromUser == systemNumber)
			                {    
			                	
			                	System.out.println("Congratulations!!,You enter the Correct guess number...You Won!!!");
			                	System.out.println("You guess the system generated number " + systemNumber + " in "
			                            + NoOfGuesses + " guesses");
			                	
			                	
			                	 //Displaying score and giving points based on the number of attempts
			                    switch (NoOfGuesses) {
			                    case 1:
			                    	System.out.println("your score = 100 out of 100 ");
			                        System.out.println("your points= 10 points out of 10 ");
			                        break;
		                        case 2:
		                            System.out.println("your score = 90 out of 100 ");
		                            System.out.println("your points= 9 points out of 10 ");
		                            break;
		                        case 3:
		                            System.out.println("your score = 80 out of 100 ");		
		                            System.out.println("your points= 8 points out of 10 ");
		                            break;
		                        case 4:
		                            System.out.println("your score = 70 out of 100 ");
		                            System.out.println("your points= 7 points out of 10 ");
		                            break;
		                        case 5:
		                            System.out.println("your score = 60 out of 100 ");
		                            System.out.println("your points= 6 points out of 10 ");
		                            break;
		                        case 6:
		                            System.out.println("your score = 50 out of 100 ");
		                            System.out.println("your points= 5 points out of 10 ");
		                            break;
		                        case 7:
		                        	System.out.println("your score = 40 out of 100 ");
		                            System.out.println("your points= 4 points out of 10 ");
		                            break;
		                        case 8:
		                        	System.out.println("your score = 30 out of 100 ");
		                            System.out.println("your points= 3 points out of 10 ");
		                            break;
		                        case 9:
		                        	System.out.println("your score = 20 out of 100 ");
		                            System.out.println("your points= 2 points out of 10 ");
		                            break;
		                        case 10:
		                        	System.out.println("your score = 10 out of 100 ");
		                            System.out.println("your points= 1 point out of 10 ");
		                            break;
		                            
			                    }
			                    noOfRounds++;
			                    break;
			                }
            
                
			                else if (guessFromUser < systemNumber)
			                	System.out.println("Your guess number is smaller, please enter a greater number..");
			                else if (guessFromUser > systemNumber)
			                    System.out.println("Your guess number is larger, please enter a smaller number..");
			                
			                //Limiting the number of attempts
			                NoOfGuesses++;

			
			                if(attempt >10) 
			                {
			                    System.out.println("You have exceeded the maximum limit, please play again..");
			                    break;
			                }
			                attempt++;

			            }
		            
			        	else 
			            {
			                System.out.println("Enter a Valid Integer Number");
			                break;
			            }
			        
			        

					} while (guessFromUser != systemNumber);

		        
			}

			        else {
			        	System.out.println("Exit from the game..");
			        }
	        		
			 
			        System.out.println(" Thank you!!"+"\nMay you enjoy a game"+" \nHey!! do you Want to Play again?(yes/no)");
			        playAgain = choice.next();
			        System.out.println("Thanks for playing the Game!");
			
			}
           
			}
			}

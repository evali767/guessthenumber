import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome. If you would like to hear a story, type \"yes\". If not, then type \"no\".");
        String story = scan.nextLine();
        if(story.toUpperCase() .equals ("YES"))
        {
            System.out.println("\n" + "You wander into a forest on your way home from school. It is not your usual route but you were looking for some sort of variety and fun. After approximately 17 minutes of walking, you encounter what seems to be an abandoned mini mushroom village in the damp grass. Confused and curious, you crouch down to examine the scene and to make sure you are really seeing things right. Upon closer look, you are shocked to see that your suspicions are right! Arch shaped holes were seen on the trunks of the mushrooms, presumably acting as doors. You notice bundles of sticks stacked together that remind you of benches. Flowers were planted neatly into straight rows, forming a pattern of some sort. It did not look natural at all. As you stare at the village in confusion at what you have just found, you hear a sound behind you.");
            System.out.println("\n" + "*Ribbit Ribbit*" + "\n" + "\n" + "The silence of the vast forest is disturbed by sudden croaking coming from behind you. Do you turn around? (Type yes or no)" );   
            String ribbit = scan.nextLine();
            if(ribbit.toUpperCase().equals("NO"))
            {
                System.out.println("\n" + "*RIBBIT RIBBIT*" + "\n" + "\n" + "The croaks get louder and louder as they seem to calling for your attention. Do you turn around? (Type yes or no)");
                String ribbit2 = scan.nextLine();
                if(ribbit2.toUpperCase() .equals ("NO"))
                {
                    System.out.println("\n" + "*RIBBIT RIBBIT RIBBIT RIBBIT RIBBIT RIBBIT RIBBIT RIBBIT RIBBIT RIBBIT RIBBIT RIBBIT RIBBIT RIBBITT*" + "\n" + "\n" + "The loud croaks ring through your earrdrums and disturb the natural calmess of the forest. Not sure as to why a frog is being so loud, you turn around towards the noise.");
                }
            }
            String ribbit2 = ("YES");
            if(ribbit.toUpperCase() .equals ("YES") || ribbit2 .equals ("YES")) 
            {
                System.out.println("\n" + "You turn around to see a lime green frog looking up at you. You hold awkward eye contact for 10 seconds before the frog begins to speak, startling you." + "\n" + "\n" + "\"Hi there stranger. Would you like to hear the story of how this village came to be abandoned?\"(Type yes or no)");
                String village = scan.nextLine();
                if(village.toUpperCase() .equals ("NO"))
                {
                    System.out.println("\n" + "The frog's eyes seem to glare at you as you continue to hold eye contact. Both of you are motionless and frozen in place. In fear of the strange frog you change you answer to yes.");
                }
                System.out.println("\n" + "\"To hear the story, you will have to play a magic number guessing game with me. If you get the number correct, I will tell you the story.\" Although you are concerned as to why a frog is speaking in english to you, you tell the frog that you are down to play.");
                
            }
        }
        System.out.println("\n" + "Hello there! Please choose a level of difficuly.");
        System.out.println("Mild: Infinite guesses. Type \"1\" to choose");
        System.out.println("Medium: 5 guesses. Type \"2\" to choose");
        System.out.println("Spicy: 5 guesses, but you will get hints. Type \"3\" to choose");
        int difficulty1 = scan.nextInt();
        System.out.println("Please choose a range of numbers to guess from:");
        System.out.println("Range: 1-10. Type \"10\" to choose");
        System.out.println("Range: 1-50. Type \"50\" to choose");
        System.out.println("Range: 1-100. Type \"100\" to choose");
        int range = scan.nextInt();
        range = range-1; 
        if(difficulty1==1)
        {

        // Mild 
        System.out.println("Guess a number between 1-" + (range+1) + ":");
        int number = (int)(Math.random()*range)+1;
        int guess = scan.nextInt();
        while(number!=guess)
        {
            System.out.println("Incorrect. Please guess again.");
            guess = scan.nextInt();
        }
        System.out.println("Correct! The number is " + number);
        System.out.println("Thank you for playing!");
        if(story.toUpperCase() .equals ("YES"))
            {
                System.out.println("\n" + "\"Good job! Follow me to learn about the secrets of this forest.\"");
                System.out.println("You follow the frog as it hops further into the forest, ready for the adventure ahead of you.");
            }
        }
        // Medium
        if(difficulty1==2)
        
        {   System.out.println("Guess a number between 1-" + (range+1) + ". You have 5 attempts.");
            int number = (int)(Math.random()*range)+1;
            int guess = scan.nextInt();
            int attempt = 5;
            while(guess!=number)
           { 
                attempt = attempt-1;
                if(attempt==0)
                {
                    System.out.println("You have run out of attempts. The number is " + number);
                    System.out.println("Thank you for playing!");
                    if(story.toUpperCase() .equals ("YES"))
                    {
                        System.out.println("\n" + "\"Looks like you got the number wrong. Until next time, friend.\"");
                        System.out.println("You watch the frog hop off into the distance. You walk back home in a daze, wondering if you had just hallucinated all that just happened.");
                    }
                } else 
           {
            System.out.println("Incorrect. You have " + attempt + " guesses remaining. Please guess again.");    
           }
            guess = scan.nextInt();
        }
        System.out.println("Correct! The number is " + number);
        System.out.println("Thank you for playing!");
        if(story.toUpperCase() .equals ("YES"))
            {
                System.out.println("\n" + "\"Good job! Follow me to learn about the secrets of this forest.\"");
                System.out.println("You follow the frog as it hops further into the forest, ready for the adventure ahead of you.");
            }
        }
        //Spicy 
        if(difficulty1==3)
        {   System.out.println("Guess a number between 1-" + (range+1) + ". You have 5 attempts.");
            int number = (int)(Math.random()*range)+1;
            int attempt = 5;
            int guess = scan.nextInt();
            while(number!=guess)
            {
                attempt = attempt-1;
                System.out.println("Incorrect. Please guess again.");
                if(attempt == 0)
                {
                    System.out.println("You have run out of attempts. The number is " + number);
                    System.out.println("Thank you for playing!");
                    if(story.toUpperCase() .equals ("YES"))
                    {
                        System.out.println("\n" + "\"Looks like you got the number wrong. Until next time, friend.\"");
                        System.out.println("You watch the frog hop off into the distance. You walk back home in a daze, wondering if you had just hallucinated all that just happened.");
                    }
                }
            if(guess<number && attempt!=0) 
           {
                System.out.println("Too low. You have " + attempt + " attempts left");
           }
           if(guess>number && attempt!=0)
            {
                System.out.println("Too high. You have " + attempt + " attempts left");
            }
            guess = scan.nextInt();
        }
        System.out.println("Correct! The number is " + number);
        System.out.println("Thank you for playing!");
        if(story.toUpperCase() .equals ("YES"))
            {
                System.out.println("\n" + "\"Good job! Follow me to learn about the secrets of this forest.\"");
                System.out.println("You follow the frog as it hops further into the forest, ready for the adventure ahead of you.");
            }
        }


    }

}

package Week_1_If_statements;

import static input.InputUtils.intInput;

public class ApolloQuiz {
    public static void main(String[] args) {

        // prompt the message or what this program do.
        System.out.println("Quiz time");
        System.out.println("What year Apollo 11 spaceship land on the moon? ");

        // int variable is store only number character.
        int answer = intInput();

        // Use '!' to check if answer is not to equal to the answer and tell the correct answer
        if (answer != 1969){
            System.out.println("Wrong answer. it was 1969");
        } else { // else statement will apply if answer is wrong.
            System.out.println("Correct answer."); // print message
        }
    }
}

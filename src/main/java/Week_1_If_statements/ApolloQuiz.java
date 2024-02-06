package Week_1_If_statements;

import static input.InputUtils.intInput;

public class ApolloQuiz {
    public static void main(String[] args) {

        System.out.println("Quiz time");
        System.out.println("What year Apollo 11 spaceship land on the moon? ");

        int answer = intInput();

        if (answer != 1969){
            System.out.println("Wrong answer. it was 1969");
        }
    }
}

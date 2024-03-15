package Week_4_List;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class ToDoList {
    public static void main(String[] args) {

        List<String> toDoList = new ArrayList<>();

        // prompt the user for tasks until they enter an empty string
        while (true){
            String enter = stringInput("Enter you day list you want to do, Or Enter to quit.");
            if (enter.isEmpty()) { // If the user enters an empty string, exit the loop
                break;
            }
            // Check if the task is already in the list
            if (containsIgnoreCase(toDoList,enter)){
                System.out.println("You already have in list.");
            }else {
                toDoList.add(enter);
            }
        }

        // Display the tasks in the to-do list
        System.out.println("Here is you list of a day.");
        for (String enter: toDoList){
            System.out.println(enter);
        }

        // Display the total number of tasks
        System.out.println("You have " + toDoList.size() + " to do.");

    }
    // Method to check if a list contains a string (ignoring case)
    public static boolean containsIgnoreCase(List<String>list, String enter) {
        for (String item: list){
            if (item.equalsIgnoreCase(enter)){
                return true;
            }
        }
        return false;
    }
}

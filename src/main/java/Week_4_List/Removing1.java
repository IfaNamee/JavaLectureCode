package Week_4_List;

import java.util.ArrayList;
import java.util.List;

public class Removing1 {
    public static void main(String[] args) {

        // Create a new ArrayList of strings called classNames
        List<String> classNames = new ArrayList<>();
        // Add some strings to the classNames list
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        // if you don't need to modify. you can not modify list inside loop.
        for (String name: classNames){
            System.out.println(name);
        //     classNames.remove(4);
            // does not modify. but if you don't want to modify list it good way to do.
        }

        System.out.println();

        // if you want to know where data is.
        for (int i = 0; i < classNames.size(); i++){
            System.out.println(classNames.get(i));
       //     classNames.remove(0);  // This miss list or don't print all list.
        }

        System.out.println();

        // While good way to modify list in loop. you can add or remove list inside a loop.
        while (!classNames.isEmpty()){
            String name = classNames.remove(0);
            System.out.println(name);
        }
        System.out.println(classNames);
    }
}

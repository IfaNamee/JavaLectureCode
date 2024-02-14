package Week_2_Loops_arrays;

public class NameOfClassYouAreTaking {
    public static void main(String[] args) {

        // Store class name
        String[] className = {"Java Programming. ITEC ", "Data Communications. ITEC "
                , "Information Tech. ITEC ", "Preparing for IT. ITEC "};
        // store class number
        int [] classNumber = {2545, 1425,1110,1005};

        // Initialize number of class.
        for (int y = 0; y < 4; y++){  // Instead of using '.length' I used '4' because I have two stores.
            // Print message for all classes.
            System.out.println("I am taking " + className[y] + classNumber[y]); // Print message.
        }
    }
}

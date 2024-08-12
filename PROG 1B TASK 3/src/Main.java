import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ICE TASK 3 - Question 1
        ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7();
        //ex8();
        //ex9();
        //ex10();
        //ex11();
        //ex12();
        //ex13();
        //ex14();
        //ex15();
        //ex16();
        //ex17();
        //ex18();
        //ex19();
        //ex20();
        //ex21();
        //ex22();
    }
    private static void ex1(){
        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");

        //Display array
        System.out.println(colours);
    }
    private static void ex2(){
        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");

        //Display array 1 element at a time in order
        for (String colour : colours) {
            System.out.println(colour);
        }
    }
    private static void ex3(){
        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");

        //Display original array elements order
        System.out.println("Original Elements & Order:");
        for (String colour : colours){
            System.out.println(colour);
        }

        //Insert element in the 0 placement
        colours.add(0,"Purple");

        //Display new array elements order
        System.out.println("\nNew Elements & Order:");
        for (String colour : colours){
            System.out.println(colour);
        }
    }
    private static void ex4(){
        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");

        System.out.println("The colour at position 2 is " + colours.get(2));
    }
    private static void ex5(){
        Scanner scanner = new Scanner(System.in);

        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");

        //Display original array elements order
        System.out.println("Original Elements & Order:");
        for (String colour : colours){
            System.out.println(colour);
        }

        //Prompt user choice of old element
        System.out.println("\nEnter the element you'd like to change");
        String oldElement = scanner.next();

        //Prompt users new element
        System.out.println("\nEnter the element you'd like to insert");
        String updatedElement = scanner.next();

        //Identify index value of olf Element
        int indexValue = colours.indexOf(oldElement);

        //Validate index value
        if (indexValue != -1){
            colours.set(indexValue, updatedElement);
            //Display updated array elements order
            System.out.println("\nUpdated Elements & Order:");
            for (String colour : colours){
                System.out.println(colour);
            }
        } else {
            System.out.println("\nElement " + oldElement + " not found. Elements & Order unchanged.");
            //Display original array elements order
            System.out.println("Elements & Order:");
            for (String colour : colours){
                System.out.println(colour);
            }
        }
    }
    private static void ex6(){
        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");

        //Display original array elements order
        System.out.println("Original Elements & Order:");
        for (String colour : colours){
            System.out.println(colour);
        }

        //Remove element 3
        colours.remove(2);

        //Display updated array elements order
        System.out.println("\nUpdated Elements & Order:");
        for (String colour : colours){
            System.out.println(colour);
        }
    }
    private static void ex7(){
        Scanner scanner = new Scanner(System.in);

        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");

        //Display original array elements order
        System.out.println("Original Elements & Order:");
        for (String colour : colours){
            System.out.println(colour);
        }

        // Prompt user for the element to search
        System.out.print("Enter the element to search: ");
        String searchElement = scanner.nextLine();

        // Search for the element
        boolean containsElement = colours.contains(searchElement);
        int index = colours.indexOf(searchElement);

        // Print the search results
        if (containsElement) {
            System.out.println("The element '" + searchElement + "' is found at index " + index + ".");
        } else {
            System.out.println("The element '" + searchElement + "' is not found in the list.");
        }
    }
    private static void ex8(){
        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");

        //Display original array elements order
        System.out.println("Original Elements & Order:");
        for (String colour : colours){
            System.out.println(colour);
        }

        //Sorting
        Collections.sort(colours);

        //Display updated array elements order
        System.out.println("\nUpdated Elements & Order:");
        for (String colour : colours){
            System.out.println(colour);
        }
    }
    private static void ex9(){
        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");

        //Display original array elements order
        System.out.println("Original Elements & Order:");
        for (String colour : colours){
            System.out.println(colour);
        }

        // Copy using the ArrayList constructor
        ArrayList<String> copiedList = new ArrayList<>(colours);

        //Display updated array elements order
        System.out.println("\nCopied Array List:");
        for (String item : copiedList){
            System.out.println(item);
        }
    }
    private static void ex10(){
        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");

        //Display original array elements order
        System.out.println("Original Elements & Order:");
        for (String colour : colours){
            System.out.println(colour);
        }

        // Shuffle Array
        Collections.shuffle(colours);

        //Display updated array elements order
        System.out.println("\nShuffled Array List:");
        for (String item : colours){
            System.out.println(item);
        }
    }
    private static void ex11(){
        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");

        //Display original array elements order
        System.out.println("Original Elements & Order:");
        for (String colour : colours){
            System.out.println(colour);
        }

        //Reverse using the ArrayList constructor
        Collections.reverse(colours);

        //Display updated array elements order
        System.out.println("\nReversed Array List:");
        for (String item : colours){
            System.out.println(item);
        }
    }
    private static void ex12(){
        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");
        colours.add("Black");
        colours.add("Orange");
        colours.add("Yellow");

        //Display original array elements order
        System.out.println("Original Elements & Order:");
        for (String colour : colours){
            System.out.println(colour);
        }

        // Define the portion to extract
        int fromIndex = 2; // Starting index
        int toIndex = 5;   // Ending index

        // Extract the portion of the list
        List<String> subList = colours.subList(fromIndex, toIndex);

        //Display updated array elements order
        System.out.println("\nCopied Array List:");
        for (String item : subList){
            System.out.println(item);
        }
    }
    private static void ex13(){
        //Create Array1
        ArrayList<String> colours1 = new ArrayList<String>();

        //Add colours/fill array1
        colours1.add("Blue");
        colours1.add("Red");
        colours1.add("Green");

        //Create Array2
        ArrayList<String> colours2 = new ArrayList<String>();

        //Add colours/fill array2
        colours2.add("Blue");
        colours2.add("Red");
        colours2.add("Green");

        //Create Array3
        ArrayList<String> colours3 = new ArrayList<String>();

        //Add colours/fill array3
        colours3.add("Black");
        colours3.add("Red");
        colours3.add("Green");

        // Compare the lists
        System.out.println("Comparing list1 and list2:");
        if (colours1.equals(colours2)) {
            System.out.println("list1 and list2 are equal.");
        } else {
            System.out.println("list1 and list2 are not equal.");
        }

        System.out.println("\nComparing list1 and list3:");
        if (colours1.equals(colours3)) {
            System.out.println("list1 and list3 are equal.");
        } else {
            System.out.println("list1 and list3 are not equal.");
        }
    }
    private static void ex14(){
        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");

        //Display original array elements order
        System.out.println("Original Elements & Order:");
        for (String colour : colours){
            System.out.println(colour);
        }

        // Define indices to swap
        int index1 = 0; // Index of the first element to swap
        int index2 = 2; // Index of the second element to swap

        // Swap elements at index1 and index2
        if (index2 < colours.size()) {
            // Get the elements at the specified indices
            String element1 = colours.get(index1);
            String element2 = colours.get(index2);

            // Swap the elements
            colours.set(index1, element2);
            colours.set(index2, element1);
        } else {
            System.out.println("Invalid indices: " + index1 + " and " + index2);
        }

        //Display updated array elements order
        System.out.println("\nNew Array List:");
        for (String colour : colours){
            System.out.println(colour);
        }
    }
    private static void ex15(){
        //Create Array
        ArrayList<String> colours1 = new ArrayList<String>();

        //Add colours/fill array
        colours1.add("Blue");
        colours1.add("Red");
        colours1.add("Green");

        //Create Array2
        ArrayList<String> colours2 = new ArrayList<String>();

        //Add colours/fill array2
        colours2.add("Black");
        colours2.add("Orange");
        colours2.add("Yellow");

        //Display first array elements order
        System.out.println("1st Colour Array:");
        for (String colour : colours1){
            System.out.println(colour);
        }

        //Display 2nd array elements order
        System.out.println("\n2nd Colour Array:");
        for (String colour : colours2){
            System.out.println(colour);
        }

        // Copy using the ArrayList constructor
        ArrayList<String> joinedList = new ArrayList<>(colours1);
        joinedList.addAll(colours2);

        //Display updated array elements order
        System.out.println("\nJoined Colour Array List:");
        for (String item : joinedList){
            System.out.println(item);
        }
    }
    private static void ex16(){
        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");

        //Display original array elements order
        System.out.println("Original Elements & Order:");
        for (String colour : colours){
            System.out.println(colour);
        }

        // Clone the ArrayList
        ArrayList<String> clonedList = new ArrayList<>(colours);

        //Display updated array elements order
        System.out.println("\nCloned Array List:");
        for (String item : clonedList){
            System.out.println(item);
        }
    }
    private static void ex17(){
        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");

        //Display original array elements order
        System.out.println("Original Elements & Order:");
        for (String colour : colours){
            System.out.println(colour);
        }

        //Empty the Arraylist
        colours.clear();

        //Display updated array elements order
        if (colours.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            for (String colour : colours){
                System.out.println(colour);
            }
        }
    }
    private static void ex18(){
        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");

        // Check if the list is empty
        System.out.println("Checking if the list is empty:");
        if (colours.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("The list is not empty.");
        }

        //Clear list
        colours.clear();

        // Check if the list is empty
        System.out.println("\nChecking if the list is empty:");
        if (colours.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("The list is not empty.");
        }
    }
    private static void ex19(){
        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");

        //Display the initial size
        System.out.println("Initial size of the Arraylist: " + colours.size());

        //Remove element
        colours.remove(1);

        //Display size after removals
        System.out.println("\nSize of the Arraylist after removing element: " + colours.size());

        // Trim the capacity of the ArrayList
        colours.trimToSize();

        // Print the size of the list after trimming capacity
        System.out.println("\nSize of the list after trimming capacity: " + colours.size());
    }
    private static void ex20() {
        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");

        //Display original Arraylist size
        System.out.println("Original size of Arraylist:" + colours.size());

        //Increase capacity
        int newCapacity = 10;
        colours.ensureCapacity(newCapacity);

        //Add more elements
        for (int i = 0; i < 7; i++) {
            colours.add("Colour " + (i+1));
        }

        //Display updated Arraylist size
        System.out.println("\nNew size of the Arraylist: " + colours.size());

        //Display elements in Arraylist
        System.out.println("\nElements in the list:");
        for (String colour : colours) {
            System.out.println(colour);
        }
    }
    private static void ex21(){
        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");

        //Display original array elements order
        System.out.println("Original Elements & Order:");
        for (String colour : colours){
            System.out.println(colour);
        }

        //Initialise new element
        String newElement = "Black";

        //Replace second element
        if (colours.size() > 1){
            colours.set(1, newElement);
        } else {
            System.out.println("There is no second element to replace");
        }

        //Display updated array elements order
        System.out.println("\nUpdated Array List:");
        for (String colour : colours){
            System.out.println(colour);
        }
    }
    private static void ex22(){
        //Create Array
        ArrayList<String> colours = new ArrayList<String>();

        //Add colours/fill array
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");

        //Display array elements with positions
        System.out.println("Arraylist Elements & Positions:");
        for (int i = 0; i < colours.size(); i++){
            System.out.println("In position " + i + " is " + colours.get(i));
        }

    }
}

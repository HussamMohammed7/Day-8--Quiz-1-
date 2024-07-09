import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {





//       1- Write a Java program that accept three numbers from the user and print the largest number .

        System.out.println("******************************************");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers to find the largest number of them");
        System.out.print("Number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Number 2 : ");
        int num2 = input.nextInt();
        System.out.print("Number 3 : ");
        int num3 = input.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("The largest number is : "+ num1);
        }else if (num2>num1 && num2>num3){
            System.out.println("The largest number is : "+ num2);

        }else {
            System.out.println("The largest number is : "+ num3);
        }


//
//       2- Write a Java program that accept a String and a number from the user
//        ,then print the character in the given index .
        System.out.println("******************************************");
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter a string and number to print the character in the given index ");
        System.out.print("Enter a String : ");
        String string_index = input2.nextLine();
        System.out.print("Enter the number of the index you want to find the character (Start with zero) : ");
        int index = input2.nextInt();
        if (index>= string_index.length()){
            System.out.println("the index you entered is out of length ");
        }else {
            System.out.println("The character is : "+string_index.charAt(index));
        }



//
//
//       3-Write a program to enter the numbers till the user wants and at the end it
//       should display the sum entered .
        System.out.println("******************************************");

        Scanner input3 = new Scanner(System.in);
        int user_input = 0 ;
        int sum = 0 ;
        System.out.println("Enter a numbers to find the sum of them ");

        do {
            System.out.print("Enter a number (press 0 to exit and view the sum): ");
            user_input = input3.nextInt();
            sum = sum + user_input;

        }while (user_input!=0);

        System.out.println("the sum of the inputs is : "+ sum);


//
//
//        4-Write a Java program to find positive and negative numbers of a given array:
//
//        -  Original Array:
//      [10, -21 , 30, 31, -25]
//        -  Expected Output:
//        10  is a positive number
//        -21 is a negative number
//        30 is a positive number
//        31 is a positive number
//        -25 is a negative number

        System.out.println("******************************************");
        ArrayList <Integer> pos_neg = new ArrayList<>(Arrays.asList(10,-21,30,31,-25));
        System.out.println(pos_neg);
        for (int i : pos_neg){
            if (i>0){
                System.out.println(i + " is a positive number");
            }
            if (i<0){
                System.out.println(i+" is a negative number");
            }
        }



//       5- Write a Java program to find a shortest word of a given array:
//        - Original Array:
//    [“Tuwaiq”, “Bootcamp” , “Student”,”JAVA”]
//        - Expected Output:
//        JAVA

        System.out.println("******************************************");
        String array_names[] = {"Tuwaiq","Bootcamp","Student","JAVA"};

        int counter_smallest = 10000000;
        String string_smallest ="";

        for (int i = 0; i <= array_names.length-1; i++) {
            if (array_names[i].length()<counter_smallest){
                counter_smallest = array_names[i].length();
                string_smallest = array_names[i];
            }
        }
        System.out.println("The smallest string is : "+string_smallest);


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}
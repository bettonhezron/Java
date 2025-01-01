package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //normal for loop
/*
        String[] fruits = { "Apple", "Mango", "Banana", "Cherry"};
        for (int j = 0; j < fruits.length; j++ ){
            System.out.println(fruits[j]);
        }

*/

/*
        for( int i = 0; i < 5; i++){
            System.out.println("Count: " + i);
        }
*/

  /*
        //enhanced for loop
        int[] numbers = {1,2,3,4,5,6};
        for (int num : numbers){
            System.out.println(num);
        }
*/
 /*       //nested loop
        for (int i = 1; i<= 3; i++){
            for (int j = 1; j<= 3; j++){
                System.out.println("I: " + i + ",J: " + j);
            }
        }
        */
/* //searching and filtering
        int[] numbers = { 10, 20, 30, 40, 50};
        int target = 30;
        for (int num : numbers){
            if (num == target){
                System.out.println("Found: " + num);
                break;

            }
        }

 */
    /*    //sum
        int[] numbers = {6,8,9,4,3, 5};
        int sum = 0;
        for (int num: numbers){
            sum +=num;
        }
        System.out.println("Sum: " + sum);
*/
//generate pattern
        for (int i = 1; i<= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.println("* ");
            }
            System.out.println();
        }



    }
}
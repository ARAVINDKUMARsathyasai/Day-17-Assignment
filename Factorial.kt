// Program to compute and print the factorial of the entered number using kotlin

import java.util.Scanner;

fun main(){
    var sc : Scanner = Scanner(System.`in`);
    var num : Int;
    println("Enter the number to which the factorial is to be calculated");
    num = sc.nextInt();
    var fact : Int = 1;
    for(i in num downTo 1){
        fact *= i
    }
    println("Factorial of $num = $fact");
}
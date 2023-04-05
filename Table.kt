// Program to print the table of the entered number

import java.util.Scanner;

fun main(){
    var sc : Scanner = Scanner(System.`in`)
    var num : Int;
    println("Enter the number for which tables to be printed ")
    num = sc.nextInt();
    println("Printting the table of $num")
    for (i in 1..10){
       println("$num * $i = ${num*i}")
    }
}
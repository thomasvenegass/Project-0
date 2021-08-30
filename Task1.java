// Thomas Venegas
// CS 1400
// Assignment 
// 2/16/2021

import java.util.Scanner;
public class TaskA
{
    public static void main(String[] args)
    {
        double shortbread;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many shortbread do you want to make?");
        shortbread = keyboard.nextDouble();

        double OzButter = 4 * (shortbread/24);
        double g_butter = 125 * (shortbread/24);
        double OzSugar = 2 * (shortbread/24);
        double g_sugar = 55 * (shortbread/24);
        double OzFlour = 6 * (shortbread/24);
        double g_flour = 180 * (shortbread/24);

        
    }
}
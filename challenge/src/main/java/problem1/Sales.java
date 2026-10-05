package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        //final int SALESPEOPLE = 5;
        
        int sum;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of salespeople: ");
        int SALESPEOPLE=scan.nextInt();
        int[] sales = new int[SALESPEOPLE];

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int max = sales[0];;
        int maxId = 0;
        int min = sales[0];;
        int minId = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if(max<sales[i]){
                max=sales[i];
                maxId = i;
            }
            if(min>sales[i]){
                min=sales[i];
                minId = i;
            }
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("max id : "+ (maxId+1) + " and maximum sale is: " + max);
        System.out.println("min id : "+ (minId+1) + " and minimun sale is: " + min);

        double avg =(double) sum/sales.length;
        System.out.println("the average sale is :" + avg);

        System.out.println("Enter a sales amount to compare against: ");
        int value = scan.nextInt();

        int count = 0;
        System.out.println("Salespeople who exceeded " + value + "$ are :");
        for(int i=0;i<sales.length; i++){
                if(sales[i]>value){
                    count++;
                    System.out.println("Salesperson " + (i + 1) + ": $" + sales[i]);
                }
        }
        System.out.println("Total number of salespeople: " + count);



    }
}



/*



3. Do the same for the minimum sale.
4. After the list, sum, average, max and min have been printed, ask the user to enter a
value. Then print the id of each salesperson who exceeded that amount, and the
amount of their sales. Also print the total number of salespeople whose sales exceeded
the value entered.
5. The salespeople are objecting to having an id of 0—no one wants that designation.
Modify your program so that the ids run from 1–5 instead of 0–4. Do not modify the
array—just make the information for salesperson 1 reside in array location 0, and so
on.
6. Instead of always reading in 5 sales amounts, at the beginning ask the user for the
number of sales people and then create an array that is just the right size. The program
can then proceed as before.


*/
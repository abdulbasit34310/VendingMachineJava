import java.util.*;
/**
 * Write a description of class vending here.
 *
 * @Kamran Warraich
 * @version (a version number or a date)
 */
public class vending
{
    // instance variables - replace the example below with your own
    //private int x;
     Scanner input = new Scanner(System.in);
     int item1 = 0;
     int item2 = 0;
     int item3 = 0;
     int item4 = 0;
     int item5 = 0;
                         
     public vending()
     {
        Scanner input = new Scanner(System.in);
        int select = 0 ;
        do
        {
        System.out.println("\n\nPlease enter your selection:"
                + "\n1: Soft Drinks \t 50"
                + "\n2: Snacks \t 100"
                + "\n3: Sweet \t 150"
                + "\n4: Chocolate \t 120"
                + "\n5: Wafers \t 80"
                + "\n6: Exit ");
           select = input.nextInt();
           if(select < 6 && select > 0)
           {
               retrievePrice(select);
           }
           else if(select == 6)
           {
               System.out.print("Exiting...");
           }
           else
           {
               System.out.println("You entered wrong input");
           }
        }while(select != 6);    

    }

    public void retrievePrice(int selection)
    {
        switch (selection)
        {
            case 1:
                moneyInserted(50);
                break;
            case 2:
                moneyInserted(100);
                break;
            case 3:
                moneyInserted(150);
                break;
            case 4:
                moneyInserted(120);
                break;
            case 5: 
                moneyInserted(80);
                break;
            default:
                moneyInserted(0);
                break;
        }
    }


    
    public void moneyInserted(int price)
    {
        
        
        System.out.println("Your item = " + price + "Rs. \nPlease enter the amount of money : ");
        int money = input.nextInt();
        if (money >= price){
            int remaining = money-price;
            System.out.println("Your remaining money is "+remaining);
        }
        else
        {
            System.out.println("Your money is Less than the price of your item.");
            moneyInserted(price);
        }
        
    }
}

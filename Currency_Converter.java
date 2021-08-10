import java.util.*;
import java.text.DecimalFormat;

public class Currency_Converter 
{    
    public static void main(String[] args) 
    {
        double amount, code, rupee, dollar, pound, euro, yen, ringgit;
        DecimalFormat df = new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);
        System.out.println("* * * * * * * * CURRENCY CONVERTER * * * * * * * *");
        System.out.println("Which Currency You Want To Convert ?");
        System.out.println("OPTIONS :- \n\t1. Rupee \n\t2. Dollar \n\t3. Pound \n\t4. Euro \n\t5. Yen \n\t6. Ringgit");
        System.out.print("Choose (Valid Option: 1,2,3,4,5,6) : ");
        code = sc.nextInt();
        System.out.print("How Much Money You Want To Convert : ");
        amount = sc.nextFloat();
        if(code == 1)
        {
            dollar = amount / 74.37;
            System.out.println("\n\tYour "+amount+" Rupees is "+df.format(dollar)+" Dollar.");
            
            pound = amount / 103.04;
            System.out.println("\tYour "+amount+" Rupees is "+df.format(pound)+" Pound.");
            
            euro = amount / 87.16;
            System.out.println("\tYour "+amount+" Rupees is "+df.format(euro)+" Euro.");
            
            yen = amount / 0.67;
            System.out.println("\tYour "+amount+" Rupees is "+df.format(yen)+" Yen.");
            
            ringgit = amount / 17.59;
            System.out.println("\tYour "+amount+" Rupees is "+df.format(ringgit)+" Ringgit.");
        }
        else if(code == 2)
        {
            rupee = amount * 74.37;
            System.out.println("\n\tYour "+amount+" Dollar is "+df.format(rupee)+" Rupees.");
            
            pound = amount * 0.72;
            System.out.println("\tYour "+amount+" Dollar is "+df.format(pound)+" Pound.");
            
            euro = amount * 0.85;
            System.out.println("\tYour "+amount+" Dollar is "+df.format(euro)+" Euro.");
            
            yen = amount * 110.45;
            System.out.println("\tYour "+amount+" Dollar is "+df.format(yen)+" Yen.");
            
            ringgit = amount * 4.23;
            System.out.println("\tYour "+amount+" Dollar is "+df.format(ringgit)+" Ringgit.");
        }
        else if(code == 3)
        {
            rupee = amount * 103.03;
            System.out.println("\n\tYour "+amount+" Pound is "+df.format(rupee)+" Rupees.");
            
            dollar = amount * 1.39;
            System.out.println("\tYour "+amount+" Pound is "+df.format(dollar)+" Dollar.");
            
            euro = amount * 1.18;
            System.out.println("\tYour "+amount+" Pound is "+df.format(euro)+" Euro.");
            
            yen = amount * 153.03;
            System.out.println("\tYour "+amount+" Pound is "+df.format(yen)+" Yen.");
            
            ringgit = amount * 5.86;
            System.out.println("\tYour "+amount+" Pound is "+df.format(ringgit)+" Ringgit.");
        }
        else if(code == 4)
        {
            rupee = amount * 87.17;
            System.out.println("\n\tYour "+amount+" Euro is "+df.format(rupee)+" Rupees.");
            
            dollar = amount * 1.17;
            System.out.println("\tYour "+amount+" Euro is "+df.format(dollar)+" Dollar.");
            
            pound = amount * 0.85;
            System.out.println("\tYour "+amount+" Euro is "+df.format(pound)+" Pound.");
            
            yen = amount * 129.42;
            System.out.println("\tYour "+amount+" Euro is "+df.format(yen)+" Yen.");
            
            ringgit = amount * 4.95;
            System.out.println("\tYour "+amount+" Euro is "+df.format(ringgit)+" Ringgit.");
        }
        else if(code == 5)
        {
            rupee = amount * 0.67;
            System.out.println("\n\tYour "+amount+" Yen is "+df.format(rupee)+" Rupees.");
            
            dollar = amount * 0.009;
            System.out.println("\tYour "+amount+" Yen is "+df.format(dollar)+" Dollar.");
            
            pound = amount * 0.006;
            System.out.println("\tYour "+amount+" Yen is "+df.format(pound)+" Pound.");
            
            euro = amount * 0.007;
            System.out.println("\tYour "+amount+" Yen is "+df.format(euro)+" Euro.");
            
            ringgit = amount * 0.038;
            System.out.println("\tYour "+amount+" Yen is "+df.format(ringgit)+" Ringgit.");
        }
        else if(code == 6)
        {
            rupee = amount * 17.58;
            System.out.println("\n\tYour "+amount+" Ringgit is "+df.format(rupee)+" Rupees.");
            
            dollar = amount * 0.24;
            System.out.println("\tYour "+amount+" Ringgit is "+df.format(dollar)+" Dollar.");
            
            pound = amount * 0.17;
            System.out.println("\tYour "+amount+" Ringgit is "+df.format(pound)+" Pound.");
            
            euro = amount * 0.20;
            System.out.println("\tYour "+amount+" Ringgit is "+df.format(euro)+" Euro.");
            
            yen = amount * 26.10;
            System.out.println("\tYour "+amount+" Ringgit is "+df.format(yen)+" Yen.");
        }
        else
            System.out.println("Invalid Input..!! Enter Valid Options Only..!!");
        System.out.println("\n* * * * * * * Thanks For Using Currency Converter * * * * * * *");
    }   
}
import java.util.*;
 class branchdrivers {
    public static void main(String[] args)
    {

        branch b=new branch("peter",3520);
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println("1)create an account\n2)Branch Attributes\n3.Account details\n4)Delete account\n5)Exit\n\nEnter your choice:");
            int ch= s.nextInt();
            switch(ch)
            {
                case 1:b.createaccount();
                    break;
                case 2:b.branchattribute();
                    break;
                case 3:b.a.accountsdetails();
                    break;
                case 4:b.deleteaccnt();
                       break;
                case 5:System.exit(0);
                default:System.out.println("Enter the correct input!");
            }
        }

    }
}
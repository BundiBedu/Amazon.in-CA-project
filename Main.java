import java.io.*;
public class Main 
{
    static int i;
    static String user_name[] = new String [100];
    static String user_name1;
    static String pass[]= new String[100];
    static String pass1;
    static String mail;
    static String mb;
    static int cust=1;
    static int currentUser;
    public static void main(String args[])throws IOException
    {
        Main ob= new Main();
        String pass1;
        Logos l=new Logos();
        l.mainLogo();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Welcome to Amazon.in\nA program by Nilay Bhatia");
        for(double d=-999999999;d<999999999;d+=0.4)
        {
        }
        MainMenu();

    }

    public static void MainMenu()throws IOException
    {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while(true)
        {
            try
            {
                System.out.println("\f");
                System.out.println("Choose an option from below(Only 1, 2, 3 allowed)");
                System.out.println("1. Login to Amazon account");
                System.out.println("2. New to Amazon? -Sign up!");
                System.out.println("3. Exit");
                i=Integer.parseInt(br.readLine());
            }
            catch(NumberFormatException E)
            {
                continue;
            }
            if(i==1||i==2||i==3)
                break;
        }
        switch(i)
        {
            case 1:
            Login();
            break;//breaking case 1:
            case 2:
            System.out.println("\fPlease enter your details");
            SignUp();
            break;
            case 3:
            System.exit(0);
        }
    }

    /**
     * Method Login
     * to login into amazon account
     */
    public static void Login()throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        Outer:
        while(true)
        {
            System.out.println("Enter your username");
            user_name1 = br.readLine();
            Inner:
            for(int j=0;j<user_name1.length();j++)
            {

                if(Character.isWhitespace(user_name1.charAt(0)))
                    continue Outer;
                if(Character.isLetter(user_name1.charAt(j))||Character.isWhitespace(user_name1.charAt(j)))

                    continue;
                else 
                {

                    System.out.println("please follow instructions and enter proper name");
                    continue Outer; 

                }

            }
            break;
        }

        System.out.println("Enter your password");
        pass1= br.readLine();
        boolean flag=false;
        for(int j=1;j<cust;j++)
        {
            if(user_name1.equalsIgnoreCase(user_name[j])&&pass1.equals(pass[j])) 
            {
                flag=true;
                currentUser=j;
                break;
            }
            else{
                flag=false;
            }
        }
        if(flag==true){
            System.out.println("Welcome to amazon, "+user_name[currentUser]);
            System.out.println("Press enter to continue");
            br.readLine();
            Home ob1=new Home();
            ob1.HomeMenu();//calling Home menu  function of the program 
        }
        else
        {
            System.out.println("Sorry, no record found.");
            System.out.println("");
            System.out.println("Press Enter");
            br.readLine();
            MainMenu();
        }
    }

    /**
     * Method SignUp
     * To signup a new user
     */
    public static void SignUp()throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("\fSignup!");
        Outer:
        while(true)
        {
            System.out.println("Enter your username(letters only)");
            user_name[cust] = br.readLine();;
            Inner:
            for(int j=0;j<user_name[cust].length();j++)
            {
                if(Character.isWhitespace(user_name[cust].charAt(0)))
                    continue Outer;
                if(Character.isLetter(user_name[cust].charAt(j))||Character.isWhitespace(user_name[cust].charAt(j)))

                    continue;
                else 
                {

                    System.out.println("please follow instructions and enter proper name");
                    user_name[cust]=br.readLine();
                    j=-1;
                    continue Inner;

                }

            }
            break;
        }
        //Validating E-mail
        Outer:
        while(true)
        {         
            System.out.println("E-mail address:");
            mail=br.readLine();
            for(int j=0;j<mail.length();j++)
            {
                if(mail.charAt(j)=='@'&&mail.indexOf('.')>mail.indexOf('@')){

                    break Outer;

                }              
            }
            System.out.println("Invalid e-mail"); 
        }

        System.out.println("Password:");
        pass[cust]=br.readLine();
        System.out.println("\fSignup!");
        System.out.println("Enter your username(letters only)");
        System.out.println(user_name[cust]);
        System.out.println("E-mail address:");
        System.out.println(mail);
        System.out.println("Password:");
        for(int j=1;j<=pass[cust].length();j++)
            System.out.print("*");
        System.out.println();
        //Validating Mobile no.
        Outer:
        while(true)
        {
            try
            {
                System.out.println("Indian 10-digit Mobile no.");
                long m=Long.parseLong(br.readLine()); 
                mb=Long.toString(m);
                if(mb.length()==10&&(mb.charAt(0)=='7'||mb.charAt(0)=='8'||mb.charAt(0)=='9'))  
                    break Outer;
            }
            catch(NumberFormatException E)
            {
                // System.out.println("Please enter only numerals");
                //br.readLine();
                continue;
            }
            System.out.println("Please follow instructions"); 
        }
        cust++;
        System.out.println("You have successfully created an amazon account");
        br.readLine();
        MainMenu();

    }

}

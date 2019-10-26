import java.util.*;
import java.io.*;
public class Home
{
    static String bookName[] = new String[9];
    static String bookAuth[] = new String[9];// Book Author
    static int bookPrice[] = new int[9];
    static String bookPub[] = new String[9]; //Book Publisher

    static String mobName[]=new String[9];
    static int mobPrice[]=new int[9];
    static String mobOs[]=new String[9];
    static String mobSize[]=new String[9];
    static String mobCam[]=new String[9];

    static String lapName[]=new String[9];
    static int lapPrice[]=new int[9];
    static String lapOs[]=new String[9];
    static String lapSize[]=new String[9];
    static String lapScreen[]=new String[9];

    static int custInd=0;
    static int choice;
    String custChoice;
    int custPrice;

    static boolean b=false;

    Home()
    {
        //Mobiles
        mobName[0]="Moto E Dual Sim ";
        mobName[1]="Apple iPhone 5S(Gold, with 16 GB)";
        mobName[2]="Apple 16GB iPad Mini with Wi-Fi(16 GB, Wi-Fi)";
        mobName[3]="Samsung Galaxy P3100 Tablet (Silver)";
        mobName[4]="Samsung 8.9\" Galaxy P7300 Tablet";
        mobName[5]="Sony SGPT113IN/S 9.4\" Tablet";
        mobName[6]="Nokia Lumia 830(Black)";
        mobName[7]="Micromax Funbook 4 GB  Tablet";
        mobName[8]="Micromax Funbook Pro";
        mobPrice[0]=6999;
        mobPrice[1]=44500;
        mobPrice[2]=18999;
        mobPrice[3]=15499;
        mobPrice[4]=24994;
        mobPrice[5]=29990;
        mobPrice[6]=28248;
        mobPrice[7]=6499;
        mobPrice[8]=9899;

        //Laptops
        lapName[0]="Lenovo B4030 Notebook (Celeron Dual Core)";
        lapName[1]="HP 15-g049AU Notebook (APU Quad Core A8)";
        lapName[2]="Dell Inspiron 15 3542 Notebook (Intel core i3)";
        lapName[3]="Lenovo Ideapad G50 (Intel Core i3 )";
        lapName[4]="HP All-In-One 20-2110(Pentium)";
        lapName[5]="HP 15-r014TX Notebook(4th Gen i5)";
        lapName[6]="Acer Aspire S3 - 951 2364  Laptop (Core i3 2367)";
        lapName[7]="CORE 2 DUO PC TITANIUM IT SERIES(Intel Core 2 duo)";
        lapName[8]="Apple MD711HN/B MacBook Air (Ci5)";
        lapPrice[0]=21990;
        lapPrice[1]=24490;
        lapPrice[2]=33250;
        lapPrice[3]=37110;
        lapPrice[4]=24590 ;
        lapPrice[5]=41990;
        lapPrice[6]=56800;
        lapPrice[7]=12450;
        lapPrice[8]=64495;

        //Books
        bookName[0]="Midnight's Children (Paperback)";
        bookName[1]="The Oath of the Vayuputras: Shiva Trilogy 3";
        bookName[2]="Lord of the Rings (English)";
        bookName[3]="A Brief History Of Time";
        bookName[4]="The World as I See It";
        bookName[5]="Be Careful What You Wish For";
        bookName[6]="Surely You're Joking Mr Feynman";
        bookName[7]="Wings of Fire: An Autobiography";
        bookName[8]="And Then There Were None";
        bookAuth[0]="Salman Rushdie";
        bookAuth[1]="Amish Tripathi";
        bookAuth[2]="J. R. R. Tolkien";
        bookAuth[3]="Stephen Hawking";
        bookAuth[4]="Albert Einstein";
        bookAuth[5]="Jeffrey Archer";
        bookAuth[6]="Richard P Feynman";
        bookAuth[7]="APJ Abdul Kalam";
        bookAuth[8]="Agatha Christie";
        bookPrice[0]=399;
        bookPrice[1]=240;
        bookPrice[2]=1120;
        bookPrice[3]=319;
        bookPrice[4]=691;
        bookPrice[5]=319;
        bookPrice[6]=499;
        bookPrice[7]=190;
        bookPrice[8]=154;

    }

    public static void HomeMenu()throws IOException
    {
        Home ob=new Home();
        Logos l= new Logos();
        Main ob1=new Main();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while(true)
        {
            try
            {

                System.out.println("\f1.Gallery");
                System.out.println("2.Deals of the day");
                System.out.println("3.Bill");
                System.out.println("4.Logout");
                System.out.println("Choose an option from the above list");

                choice=Integer.parseInt(br.readLine());
            }
            catch(NumberFormatException E)
            {
                System.out.println("Please enter only numerals");
                br.readLine();
                continue;
            }
            if(choice==1||choice==2||choice==3||choice==4)
                break;
            System.out.println("Only 1, 2, 3, 4 allowed. Please Re-enter");
        }
        switch(choice)
        {
            case 1://Gallery
            Gallery();           
            break;//break of outer case 1
            case 2:
            Deals();
            break;
            case 3:            
            Bill();
            break;
            case 4:
            if(prod[0]!=null&&b==false)
            {System.out.println("You have not paid your bill. Press Enter");
                br.readLine();
                Bill();
            }
            else
                ob1.MainMenu();

        }
    }

    public static void Gallery()throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while(true)
        {
            try
            {
                System.out.println("\fGallery(Only 1, 2, 3, 4 allowed)");
                System.out.println("1.Mobiles & Tablets \n2.Desktops and laptops \n3.Books \n4.Back");
                choice=Integer.parseInt(br.readLine());
            }
            catch(NumberFormatException E)
            {
                continue;
            }
            if(choice==1||choice==2||choice==3||choice==4)
                break;
        }
        switch(choice)
        {
            case 1: //Mobiles and tablets
            Mobiles();
            break;
            case 2:
            Laptops();
            break;
            case 3:
            Books();
            break;
            case 4:
            HomeMenu();
        }
    }

    public static void Mobiles()throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        mobOs[0]="Android v4.4";
        mobOs[1]="iOS 7";
        mobOs[2]="iOS 6";
        mobOs[3]="Android v4.1 ";;
        mobOs[4]="Android v3.0 ";
        mobOs[5]="Android v3.2 ";
        mobOs[6]="Windows Phone 8.1";
        mobOs[7]="Android v4.0 ";
        mobOs[8]="Android v4.0.3";

        mobSize[0]="4.3";
        mobSize[1]="6.7";
        mobSize[2]="9.7";
        mobSize[3]="7";
        mobSize[4]="8.9";
        mobSize[5]="9.4";
        mobSize[6]="5";
        mobSize[7]="7";
        mobSize[8]="10.1";

        mobCam[0]="5 MP";
        mobCam[1]="8 MP";
        mobCam[2]="5 MP";
        mobCam[3]="3 MP";
        mobCam[4]="4 MP";
        mobCam[5]="2 MP";
        mobCam[6]="7 MP";
        mobCam[7]="3 MP";
        mobCam[8]="6 MP";

        System.out.println("\fMobiles & Tablets:");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("  Name                                                OS                 Screen(\")   Camera      Price");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        for(int j=0;j<=8;j++)
        {    
            int len=0;
            System.out.print((j+1)+" "+mobName[j]);
            len=mobName[j].length();
            for (int c=1;c<=52-len;c++)
                System.out.print(" ");

            System.out.print(mobOs[j]);
            len=mobOs[j].length();
            for (int c=1;c<=19-len;c++)
                System.out.print(" ");

            System.out.print(mobSize[j]);
            len=mobSize[j].length();
            for (int c=1;c<=12-len;c++)
                System.out.print(" ");
            System.out.print(mobCam[j]);
            len = mobCam[j].length();
            for(int c=1;c<=12-len;c++)

                System.out.print(" ");

            System.out.println("Rs "+mobPrice[j]);
        }

        String custChoice;
        int custPrice;
        System.out.println("\n\nEnter your choice:(Press 0 to go back)");
        int custChoiceno;
        while(true)
        {
            try{
                custChoiceno=Integer.parseInt(br.readLine());
            }
            catch(NumberFormatException E)
            {
                System.out.println("Only numerals allowed");
                continue;
            }
            if(custChoiceno>=0&&custChoiceno<10)
                break;
            System.out.println("Please follow instructions");  
        }
        if(custChoiceno==0)
            Gallery();
        custChoice = mobName[custChoiceno-1];
        custPrice = mobPrice[custChoiceno-1];
        System.out.println("Enter quantity(less than 7)");
        int custQuan;
        while(true)
        {
            try{
                custQuan=Integer.parseInt(br.readLine());

            }
            catch(NumberFormatException E)
            {
                continue;
            }
            if(custQuan>0&&custQuan<7)
                break;
            System.out.println("Please follow Instructions");
            System.out.println("Enter quantity(less than 7)");
        }
        System.out.println("This item was successfully added to your cart.");
        for (int j=0;j<custChoice.length();j++)
        {
            for (double d=-9999999;d<9999999;d+=0.5)
            {

            }
            System.out.print(custChoice.charAt(j));
        }

        Cart(custChoice,custPrice, custQuan);
        br.readLine();
        Gallery();
    }

    public static void Laptops()throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        lapOs[0]="Windows 8";
        lapOs[1]="Windows 8.1";
        lapOs[2]="Windows 8";
        lapOs[3]="Windows 8 ";
        lapOs[4]="Windows 8.1";
        lapOs[5]="Windows 8";
        lapOs[6]="Windows 7";
        lapOs[7]="Windows 7";
        lapOs[8]="Mac OS X Maverics";

        lapSize[0]="500";
        lapSize[1]="500";
        lapSize[2]="500";
        lapSize[3]="1000";
        lapSize[4]="500";
        lapSize[5]="1000";
        lapSize[6]="320";
        lapSize[7]="160";
        lapSize[8]="11";

        lapScreen[0]="14.1";
        lapScreen[1]="15.6";
        lapScreen[2]="15.6";
        lapScreen[3]="15.6";
        lapScreen[4]="19.45";
        lapScreen[5]="15.6";
        lapScreen[6]="13.3";
        lapScreen[7]="16";
        lapScreen[8]="128";
        System.out.println("\fLaptops");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("  Name                                               OS                 Storage     Screen        Price");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        for(int j=0;j<=8;j++)
        {    
            int len=0;
            System.out.print((j+1)+" "+lapName[j]);
            len=lapName[j].length();
            for (int c=1;c<=51-len;c++)
                System.out.print(" ");

            System.out.print(lapOs[j]);
            len=lapOs[j].length();
            for (int c=1;c<=19-len;c++)
                System.out.print(" ");

            System.out.print(lapSize[j]+" GB");
            len=lapSize[j].length()+3;
            for (int c=1;c<=12-len;c++)
                System.out.print(" ");

            System.out.print(lapScreen[j]);
            len=lapScreen[j].length();
            for(int c=1;c<=14-len;c++)

                System.out.print(" ");

            System.out.println("Rs "+lapPrice[j]);
        }

        String custChoice;
        int custPrice;
        System.out.println("\n\nEnter your choice:(Press 0 to go back)");
        int custChoiceno;
        while(true)
        {
            try{
                custChoiceno=Integer.parseInt(br.readLine());
            }
            catch(NumberFormatException E)
            {
                System.out.println("Only numerals allowed");
                continue;
            }
            if(custChoiceno>=0&&custChoiceno<10)
                break;
            System.out.println("Please follow instructions");
        }
        if(custChoiceno==0)
            Gallery();
        custChoice = lapName[custChoiceno-1];
        custPrice = lapPrice[custChoiceno-1];
        System.out.println("Enter quantity(less than 7)");
        int custQuan;
        while(true)
        {
            try{
                custQuan=Integer.parseInt(br.readLine());

            }
            catch(NumberFormatException E)
            {
                System.out.println("Only numbers allowed");
                continue;

            }
            if(custQuan>0&&custQuan<7)
                break;
            System.out.println("Please follow Instructions");
            System.out.println("Enter quantity(less than 7)");
        }
        System.out.println("This item was successfully added to your cart.");
        for (int j=0;j<custChoice.length();j++)
        {
            for (double d=-9999999;d<9999999;d+=0.5)
            {

            }
            System.out.print(custChoice.charAt(j));
        }

        Cart(custChoice,custPrice, custQuan);
        br.readLine();
        Gallery();
    }

    public static void Books()throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        bookPub[0]="Random House";
        bookPub[1]="Westland";
        bookPub[2]="HarperCollins";
        bookPub[3]="Transworld";
        bookPub[4]="Important Books";
        bookPub[5]="Pan Macmillian India";
        bookPub[6]="Random House";
        bookPub[7]="Universities Press";
        bookPub[8]="Harper Collins";
        System.out.println("\fBooks");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Name                                                 Author             Publisher                Price");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        for(int j=0;j<=8;j++)
        {    
            int len=0;
            System.out.print((j+1)+" "+bookName[j]);
            len=bookName[j].length();
            for (int c=1;c<=51-len;c++)
                System.out.print(" ");

            System.out.print(bookAuth[j]);
            len=bookAuth[j].length();
            for (int c=1;c<=19-len;c++)
                System.out.print(" ");

            System.out.print(bookPub[j]);
            len=bookPub[j].length();

            len=bookPub[j].length();
            for(int c=1;c<=25-len;c++)

                System.out.print(" ");

            System.out.println("Rs "+bookPrice[j]);
        } 
        
        String custChoice;
        int custPrice;
        System.out.println("\n\nEnter your choice:(Press 0 to go back)");
        int custChoiceno;
        while(true){
            try{
                custChoiceno=Integer.parseInt(br.readLine());
            }
            catch(NumberFormatException E)
            {
                System.out.println("Only numbers allowed");
                continue;
            }
            if(custChoiceno>=0&&custChoiceno<10)
                break;
        }
        if(custChoiceno==0)
            Gallery();
        custChoice = bookName[custChoiceno-1];
        custPrice = bookPrice[custChoiceno-1];
        System.out.println("Enter quantity(less than 7)");
        int custQuan;
        while(true)
        {
            try{
                custQuan=Integer.parseInt(br.readLine());

            }
            catch(NumberFormatException E)
            {
                System.out.println("Only numerals allowed");
                continue;
            }
            if(custQuan>0&&custQuan<7)
                break;
            System.out.println("Please follow Instructions");
            System.out.println("Enter quantity(less than 7)");
        }
        System.out.println("This item was successfully added to your cart.");
        for (int j=0;j<custChoice.length();j++)
        {
            for (double d=-9999999;d<9999999;d+=0.5)
            {

            }
            System.out.print(custChoice.charAt(j));
        }
        Cart(custChoice,custPrice, custQuan);
        br.readLine();
        Gallery();
    }

    public static void Deals()throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String custChoice;
        int custPrice;
        int custQuan;

        System.out.println("\fDeals of the day:");
        //On Mobiles
        System.out.println("\nOn Mobiles");
        int r1 =(int)(Math.random()*9);
        System.out.println("1."+mobName[r1]);
        int d1=mobPrice[r1]-mobPrice[r1]*20/100;
        System.out.println("Original Price-"+mobPrice[r1]);
        System.out.println("Discounted Price-"+d1);

        //On Laptops
        System.out.println("\nOn Laptops");
        int r2 =(int)(Math.random()*9);
        System.out.println("2."+lapName[r2]);
        int d2=lapPrice[r2]-lapPrice[r2]*20/100;
        System.out.println("Original Price-"+lapPrice[r2]);
        System.out.println("Discounted Price-"+d2);

        //On books
        System.out.println("\nOn Books");
        int r3 =(int)(Math.random()*9);
        System.out.println("3."+bookName[r3]);
        System.out.println("By "+bookAuth[r3]);
        int d3=bookPrice[r3]-bookPrice[r3]*20/100;
        System.out.println("Original Price-"+bookPrice[r3]);
        System.out.println("Discounted Price-"+d3);

        System.out.println("\n4.Back");
        System.out.println("\n\nEnter your choice");
        choice=0;
        while(true){
            try
            {   
                choice=Integer.parseInt(br.readLine());
            }
            catch(NumberFormatException E)
            {
                System.out.println("Only numerals allowed");
                continue;
            }
            if(choice==1||choice==2||choice==3||choice==4)
                break;
            System.out.println("Only 1, 2, 3, 4 allowed");
        }
        switch (choice)
        {
            case 1:
            custChoice=mobName[r1];
            custPrice=d1;
            System.out.println("Enter quantity(less than 7)");
            while(true){
                try
                {
                    custQuan=Integer.parseInt(br.readLine());
                }
                catch(NumberFormatException E)
                {
                    System.out.println("Only numerals allowed");
                    continue;
                }
                if(custQuan>0&&custQuan<7)
                    break;
                System.out.println("Please follow instructions");
            }
            System.out.println("This item was successfully added to your cart.");
            for (int j=0;j<custChoice.length();j++)
            {
                for (double d=-9999999;d<9999999;d+=0.5)
                {

                }
                System.out.print(custChoice.charAt(j));
            }

            Cart(custChoice,custPrice, custQuan);
            br.readLine();
            HomeMenu();
            break;

            case 2:
            custChoice=lapName[r2];
            custPrice=d2;
            System.out.println("Enter quantity(less than 7)");
            while(true){
                try
                {
                    custQuan=Integer.parseInt(br.readLine());
                }
                catch(NumberFormatException E)
                {
                    System.out.println("Only numerals allowed");
                    continue;
                }
                if(custQuan>0&&custQuan<7)
                    break;
                System.out.println("Please follow instructions");
            }
            System.out.println("This item was successfully added to your cart.");
            for (int j=0;j<custChoice.length();j++)
            {
                for (double d=-9999999;d<9999999;d+=0.5)
                {

                }
                System.out.print(custChoice.charAt(j));
            }          
            Cart(custChoice,custPrice, custQuan);
            br.readLine();
            HomeMenu();
            break;

            case 3:
            custChoice=bookName[r3];
            custPrice=d3;
            System.out.println("Enter quantity(less than 7)");
            while(true){
                try
                {
                    custQuan=Integer.parseInt(br.readLine());
                }
                catch(NumberFormatException E)
                {
                    System.out.println("Only numerals allowed");
                    continue;
                }
                if(custQuan>0&&custQuan<7)
                    break;
                System.out.println("Please follow instructions");
            }
            System.out.println("This item was successfully added to your cart.");
            for (int j=0;j<custChoice.length();j++)
            {
                for (double d=-9999999;d<9999999;d+=0.5)
                {

                }
                System.out.print(custChoice.charAt(j));
            }
            Cart(custChoice,custPrice, custQuan);
            br.readLine();
            HomeMenu();
            break;
            case 4:
            HomeMenu();
            break;
        }
    }
    static String prod[]=new String[100];
    static int prodPrice[]=new int[100];
    static int prodQuan[]=new int[100];
    static double custTotal;
    public static void Cart(String custChoice, int custPrice, int custQuan){

        prod[custInd]=custChoice;
        prodPrice[custInd] =custPrice;
        prodQuan[custInd]=custQuan;       
        custInd++;

    }

    public static void Bill()throws IOException 
    {
        b=true;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Main m=new Main();
        Logos l= new Logos();
        l.mainLogo();
        l.billLogo();
        if(prodPrice[0]==0){
            System.out.println("No item in your cart");
            b=false;
            br.readLine();
            HomeMenu();
        }
        System.out.print(" Name:"+m.user_name1+"          Mobile no.="+m.mb+"          E-mail:"+m.mail+"          Date:");
        date();
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Product                                            Qty     Price        AMT");
        System.out.println("----------------------------------------------------------------------------");
        for(int j=0;j<custInd;j++)
        {
            int len=0;
            System.out.print(prod[j]);
            len=prod[j].length();
            for(int c=1;c<=51-len;c++)
            {
                System.out.print(" ");
            }
            System.out.print(" "+prodQuan[j]+"      ");
            System.out.print("Rs."+prodPrice[j]+"     ");
            len= Integer.toString(prodPrice[j]).length();
            for(int c=1;c<=5-len;c++)
            {
                System.out.print(" ");
            }
            System.out.println("Rs."+prodQuan[j]*prodPrice[j]);
            custTotal=custTotal+prodQuan[j]*prodPrice[j];
        }
        System.out.println("\n\nTotal => Rs."+custTotal);

        System.out.println("Your product will be delivered soon.\nThanks for paying the bill.\nKeep visiting :-)");

        for(int j=0;j<custInd;j++)
        {
            prod[j]=null;
            prodPrice[j]=0;
            prodQuan[j]=0;

        }
        custTotal=0;
        custInd=0;
        b=false;
        br.readLine();
        HomeMenu();
    }
    public static void date()
    {
        Date d=new Date();
        String g=d.toString();
        System.out.println(g.substring(8,10)+" "+g.substring(4,8)+" "+g.substring(24));
    }
}

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
public class HelloWorld {

    public static void main(String[] args) {
    	int sequence=1;
    	double a = 2.5;
    	String number = "54415";
    	char num[] = new char[5];
    	int i;
		//System.out.printf("Digits in %s are ",number);
		/*for(i=0;i<5;i++){
			num[i]=number.charAt(i);
			System.out.printf("%s ",num[i]);

		}*/

    	//System.out.println("Hello World!\n\n\n\n\n");
    	//System.out.println("Input quantity of item "+ sequence +':');
    	//System.out.printf("%-20f\n",sequence+a);

        //int numbertest=0;
        //Scanner test = new Scanner(System.in);
       
        //String abc = test.nextLine();
        //numbertest = test.nextInt();


        //System.out.println(abc+numbertest);

        //Date mydate = DateFormat.getDateInstance(DateFormat.LONG);
        //String temp = input.nextLine();
       // mydate = df.parse(temp);
       // System.out.println(dateToString(mydate.substring(0,,10)));

        Date nowdate = new Date();
        long t1 = nowdate.getTime();
        System.out.println(nowdate);
        Date d2 = new Date(t1);
        System.out.println(dateToString(nowdate).substring(0,10));
    }
}


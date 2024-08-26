import java.util.Scanner;
public class Main{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("1).Book\n2).Cancle\n3).Availability\n4).History\n5).Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("-----------Ticket Booked------------------------");
                    break;
                case 2:
                    System.out.println("------------Ticket Canceled-----------");
                    break;
                case 3:
                    System.out.println("No Tickets");
                    break;
                case 4:
                    System.out.println("No History");
                    break;
                case 5:
                    flag = false;                    
                    break;
            
            }
         
            

        }
    }
}
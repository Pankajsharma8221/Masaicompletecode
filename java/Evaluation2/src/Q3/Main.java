package Q3;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
        Scanner sca=new Scanner(System.in);
        Ticket obj=new Ticket();
        
        System.out.println("Enter no of bookings:");
        int no_bookings=sca.nextInt();
        
        System.out.println("Enter the available tickets:");
        obj.setAvailableTickets(sca.nextInt());
        
        while(no_bookings>0)
        {
        System.out.println("Enter the ticketid:");
        obj.setTicketid(sca.nextInt());
        
        System.out.println("Enter the price:");
        obj.setPrice(sca.nextInt());
        
        System.out.println("Enter the no of tickets:");
        int no_tickets=sca.nextInt();
        if(obj.calculateTicketCost(no_tickets)==-1)
        {
            continue;
        }
        
        System.out.println("Available tickets: "+obj.getAvailableTickets());
        
        System.out.println("Total amount:"+obj.calculateTicketCost(no_tickets));
        
        System.out.println("Available ticket after booking:"+obj.getAvailableTickets());
        
            no_bookings--;
        }
	}
}
public class TicketMachine {
    Ticket[] ticketList = new Ticket[3];

    public TicketMachine(Ticket[] ticketList) {
        this.ticketList = ticketList;
    }

    public static void printTicket(Ticket ticket){
        System.out.printf("Film: %s%nPrice: %.2f", ticket.name, ticket.price);
    }


}

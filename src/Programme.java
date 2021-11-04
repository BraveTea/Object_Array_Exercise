public class Programme {

    public static void main(String[] args){
        int numberOfFilms = 3;

        //So this works, but why the heck can't I place this code in the TicketMachine class?
        Ticket[] ticketArray = new Ticket[numberOfFilms];
        ticketArray[0] = new Ticket("StarWars4", 12);
        ticketArray[1] = new Ticket("IndianaJones1", 12);
        ticketArray[2] = new Ticket("BackToTheFuture1", 11);

        TicketMachine TM1 = new TicketMachine(ticketArray); //Okay, so by passing the array during initialisation of Ticketmachine it now works.

        TM1.printTicket(ticketArray[1]);


    }

}

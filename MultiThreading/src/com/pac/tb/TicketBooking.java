package com.pac.tb;


class TicketBooking {
    private int ticketsAvailable = 5; // Total tickets available

    // Synchronized method to ensure one thread accesses it at a time
    public synchronized void bookTicket(String user, int ticketsToBook) {
        System.out.println(user + " is trying to book " + ticketsToBook + " ticket(s).");

        if (ticketsAvailable >= ticketsToBook) {
            System.out.println(user + " successfully booked " + ticketsToBook + " ticket(s).");
            ticketsAvailable -= ticketsToBook;
            System.out.println("Tickets remaining: " + ticketsAvailable);
        } else {
            System.out.println(user + " failed to book tickets. Not enough tickets available.");
        }
    }
}

class UserThread implements Runnable {
    private TicketBooking ticketBooking;
    private String user;
    private int ticketsToBook;

    public UserThread(TicketBooking ticketBooking, String user, int ticketsToBook) {
        this.ticketBooking = ticketBooking;
        this.user = user;
        this.ticketsToBook = ticketsToBook;
    }

    @Override
    public void run() {
        ticketBooking.bookTicket(user, ticketsToBook);
    }
}




package com.pac.tb;



public class HorizontalThreadingExample {
    public static void main(String[] args) {
        TicketBooking ticketBooking = new TicketBooking(); // Shared resource

        // Creating threads for different users trying to book tickets concurrently
        Thread user1 = new Thread(new UserThread(ticketBooking, "User1", 2));
        Thread user2 = new Thread(new UserThread(ticketBooking, "User2", 3));
        Thread user3 = new Thread(new UserThread(ticketBooking, "User3", 2));

        // Start threads concurrently (horizontal threading)
        user1.start();
        user2.start();
        user3.start();
    }
}


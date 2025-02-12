package com.pac.user;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

    public static void main(String[] args) {
        
        // Configure Hibernate
        Configuration cfg = new Configuration();
        cfg.configure("config.xml");
        
        // Build SessionFactory
        SessionFactory factory = cfg.buildSessionFactory();

        // Open a session
        Session ses = factory.openSession();
        
        // Begin transaction
        Transaction tr = ses.beginTransaction();

        // CREATE (Insert User)
        User user = new User("vishalpatil11", "555");
        ses.persist(user);
        tr.commit(); // Commit transaction after insert

        // READ (Fetch User)
        tr = ses.beginTransaction(); // Start new transaction
        User fetchedUser = ses.get(User.class, "vishalpatil11");
        if (fetchedUser != null) {
            System.out.println("User found: " + fetchedUser.getUser() + ", Password: " + fetchedUser.getPass());
        } else {
            System.out.println("User not found!");
        }

        // DELETE (Fetch before deleting)
        User userToDelete = ses.get(User.class, "vishalpatil");
        if (userToDelete != null) {
            ses.delete(userToDelete);
            System.out.println("User deleted successfully.");
        }

        // UPDATE (Modify User)
        User userUpdate = ses.get(User.class, "vishalpatil");
        if (userUpdate != null) {
            userUpdate.setPass("123");
            ses.update(userUpdate);
        }

        // Commit final transaction
        tr.commit();

        // Close session and factory
        ses.close();
        factory.close();
    }
}

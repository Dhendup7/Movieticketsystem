

import Ticketinfo.Movie;
import Ticketinfo.Ticket;
import Userinfo.Seat;
import Userinfo.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> moviesList = new ArrayList<Movie>();
        Movie m1 = new Movie(1, 0, "Action", "RRR", "Rajamoli", "4pm", 500);
        moviesList.add(m1);
        Movie m2 = new Movie(2,4, "Scifi", "Avatar", "James cameron", "10 am", 200);
        moviesList.add(m2);
        moviesList.add(m2);


        ArrayList<User> users = new ArrayList<User>();
        User u1 = new User("Dhendup", 19,"dhendup.sherpa@gmail.com");
        users.add(u1);
        User u2 = new User("Rahul", 18, "rahul@gmail.com");
        users.add(u2);

        ArrayList<Seat> seats = new ArrayList<>();
        Seat s1 = new Seat("Premium", 12);
        seats.add(s1);
        Seat s2 = new Seat("Platinum", 9);
        seats.add(s2);

        Ticket t1 = new Ticket(seats,users,moviesList);


        m1.getInfo();

        t1.getTickets();

        m2.getMovies("6pm");

    }
}


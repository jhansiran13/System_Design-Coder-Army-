import java.util.ArrayList;
import java.util.List;
class Movie {
    public String title;
    public int duration;
    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
}
 
class Booking {
    private List<Movie> bookedMovies = new ArrayList<>();
    public void bookMovie(Movie m) {
        bookedMovies.add(m);
    }
    public List<Movie> getBookings() {
        return bookedMovies;
    }
}
 
class BookingPrinter {
    private Booking booking;
    public BookingPrinter(Booking booking) {
this.booking = booking;
    }
    public void printTicket() {
        System.out.println("Your Ticket:");
        for (Movie m : booking.getBookings()) {
            System.out.println(m.title + " - " + m.duration + " mins");
        }
    }
}
 
class BookingSaver {
    private Booking booking;
    public BookingSaver(Booking booking) {
this.booking = booking;
    }
    public void saveToDB() {
        System.out.println("Booking saved to database...");
    }
}
public class Booking {

    public int availableCount;

    public Booking(int totalTickets) {
        this.availableCount = totalTickets;
    }

    public synchronized void book(String customerName, int ticketCount) {
        if (availableCount >= ticketCount) {
            System.out.println(customerName + " booked " + ticketCount + " ticket(s).");
            availableCount -= ticketCount;
        } else {
            System.out.println(customerName + " failed to book ticket(s). Not enough availableCount ticket(s).");
        }
    }

    public static void main(String[] args) {
        Booking bs = new Booking(10);

        Thread customer1 = new Thread(() -> bs.book("Customer 1", 3));
        Thread customer2 = new Thread(() -> bs.book("Customer 2", 8));
        Thread customer3 = new Thread(() -> bs.book("Customer 3", 7));

        customer1.start();
        customer2.start();
        customer3.start();
    }
}
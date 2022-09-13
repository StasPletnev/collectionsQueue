public class Person {
    protected String name;
    protected String lastName;
    protected int tickets;

    public Person(String name, String lastName, int tickets) {
        this.name = name;
        this.lastName = lastName;
        this.tickets = tickets;
    }

    protected String getName (){
        return name;
    }

    protected String getLastName(){
        return lastName;
    }

    protected int getTickets(){
        return tickets;
    }

    protected int spendingTicket (){
        return tickets--;
    }
}

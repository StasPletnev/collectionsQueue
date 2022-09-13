import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new ArrayDeque<>();
        for (Person z :
                generateClients()) {
            queue.offer(z);
        }
        while (!queue.isEmpty()) {
            Person client = queue.poll();
            client.spendingTicket();
            System.out.println(client.name + " " + client.getLastName() + " прокатился на атракционе. У него осталось " + client.tickets + " билетов");
            if (client.tickets > 0) {
                queue.offer(client);
            } else {
                System.out.println("Недостаточно билетов, чтобы встать в очередь");
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> clients = new LinkedList<>();
        clients.add(new Person("Sergey", "Kudelkin", 5));
        clients.add(new Person("Stas", "Solovev", 6));
        clients.add(new Person("Masha", "Pupkina", 1));
        clients.add(new Person("Sasha", "Dezdemonov", 4));
        clients.add(new Person("Natasha", "Soloveva", 10));
        return clients;
    }
}

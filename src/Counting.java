class Up extends Thread {
    @Override
    public void run() {
        System.out.println("Counting Up");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(200); // Simulate processing delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Down extends Thread {
    @Override
    public void run() {
        System.out.println("Counting down");
        for (int i = 20; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Counting {
    public static void main(String[] args) {
        Up up = new Up();
        Down down = new Down();

        up.start();
        try {
            up.join(); // Ensure Up finishes before CounterDown starts
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        down.start();
    }
}

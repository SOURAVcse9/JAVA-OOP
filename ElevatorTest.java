// ElevatorTest.java
public class ElevatorTest {
    public static void main(String[] args) {
        // Create an instance of Elevator
        Elevator elevator = new Elevator();

        // Set the elevator state to 'doorIsOpen' and execute doAction()
        elevator.setState(new doorIsOpen());
        elevator.getState().doAction();

        // Set the elevator state to 'doorIsClosed' and execute doAction() again
        elevator.setState(new doorIsClosed());
        elevator.getState().doAction();
    }
}

// State interface
interface State {
    void doAction();
}

// doorIsOpen class implementing State
class doorIsOpen implements State {
    public void doAction() {
        System.out.println("The elevator door is OPEN. Elevator cannot move.");
    }
}

// doorIsClosed class implementing State
class doorIsClosed implements State {
    public void doAction() {
        System.out.println("The elevator door is CLOSED. Elevator is moving.");
    }
}

// Elevator class that uses State
class Elevator {
    private State state;

    public Elevator() {
        this.state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }
}

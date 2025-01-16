package _05_state.ex01;

public class ClosedState implements State {

    @Override
    public void open(Door door) {
        System.out.println("ClosedState.open");
        door.setState(new OpenState());
    }

    @Override
    public void close(Door door) {
        System.out.println("ClosedState.close");
    }
}

package _05_state.ex01;

public class OpenState implements State {

    @Override
    public void close(Door door) {
        System.out.println("OpenState.close");
    }

    @Override
    public void open(Door door) {
        System.out.println("OpenState.open");
        door.setState(new ClosedState());
    }
}

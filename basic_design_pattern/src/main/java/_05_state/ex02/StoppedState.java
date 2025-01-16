package _05_state.ex02;

public class StoppedState implements State {

    @Override
    public void play(VideoPlayer player) {
        System.out.println("StoppedState.play");
        player.setState(new PlayingState());
    }

    @Override
    public void stop(VideoPlayer player) {
        System.out.println("StoppedState.stop");
    }
}

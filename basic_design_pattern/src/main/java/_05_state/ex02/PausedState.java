package _05_state.ex02;

public class PausedState implements State {
    @Override
    public void play(VideoPlayer player) {
        System.out.println("PausedState.play");
        player.setState(new PlayingState());
    }

    @Override
    public void stop(VideoPlayer player) {
        System.out.println("PausedState.stop");
        player.setState(new StoppedState());
    }
}

package _05_state.ex02;

public class PlayingState implements State {
    @Override
    public void play(VideoPlayer player) {
        System.out.println("PlayingState.play");
    }

    @Override
    public void stop(VideoPlayer player) {
        System.out.println("PlayingState.stop");
        player.setState(new PausedState());
    }
}

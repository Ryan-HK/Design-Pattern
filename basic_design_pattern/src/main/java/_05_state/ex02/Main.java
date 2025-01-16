package _05_state.ex02;

import _05_state.ex01.Door;

public class Main {


    /**
     * State Pattern
     */
    public static void main(String[] args) {

        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.play();
        videoPlayer.play();
        videoPlayer.play();
        videoPlayer.stop();
        videoPlayer.stop();
        videoPlayer.stop();
        videoPlayer.play();
    }

}
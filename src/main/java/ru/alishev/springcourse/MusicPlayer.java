package ru.alishev.springcourse;

/**
 * @author Neil Alishev
 */
public class MusicPlayer {
    private Music music1;

    // IoC
    public MusicPlayer(Music music1) {
        this.music1 = music1;
    }

    public MusicPlayer() {

    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}

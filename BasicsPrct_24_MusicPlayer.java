import java.util.Scanner;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class BasicsPrct_24_MusicPlayer {

    private String title;
    private String artist;
    private String filePath;
    private Clip audioClip;
    private long clipTimePosition; // Stores the position in microseconds when paused

    public BasicsPrct_24_MusicPlayer(String title, String artist, String filePath) {
        this.title = title;
        this.artist = artist;
        this.filePath = filePath;
        this.clipTimePosition = 0; // Initialize at the beginning
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getFilePath() {
        return filePath;
    }

    public void play() {
        try {
            File audioFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);

            if (clipTimePosition > 0) {
                audioClip.setMicrosecondPosition(clipTimePosition); // Resume from paused position
            }
            audioClip.start();
            System.out.println("Playing: " + title + " by " + artist);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.err.println("Error playing song: " + e.getMessage());
        }
    }

    public void pause() {
        if (audioClip != null && audioClip.isRunning()) {
            clipTimePosition = audioClip.getMicrosecondPosition(); // Save current position
            audioClip.stop();
            System.out.println("Paused: " + title);
        }
    }

    public void stop() {
        if (audioClip != null) {
            audioClip.stop();
            audioClip.close();
            clipTimePosition = 0; // Reset position
            System.out.println("Stopped: " + title);
        }
    }

    public static void main(String[] args) {
        
        BasicsPrct_24_MusicPlayer song1 = new BasicsPrct_24_MusicPlayer("My Song", "My Artist", "C:\\Users\\santo\\Music\\file_example_WAV_2MG.wav");

        song1.play();
        // Simulate some playback time
        try {
            Thread.sleep(3000); // Play for 3 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        song1.pause();
        // Simulate a pause
        try {
            Thread.sleep(2000); // Pause for 2 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        song1.play(); // Resume playback
        try {
            Thread.sleep(3000); // Play for another 3 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        song1.stop();
    }
}
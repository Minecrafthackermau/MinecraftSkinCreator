import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;
import org.jfugue.theory.ChordProgression;

public class SkinDesignerMusic implements Runnable {
	private Player player;
	private Pattern baseProgression;
	private Pattern rhythm;
	
	private SkinDesignerMusic() {
		player = new Player();
		baseProgression = new ChordProgression("I iv V X c")
	                .distribute("7%6")
	                .allChordsAs("$2 $2 $2 $2 $2 $2 $2 $2 $2 $0 $0 $0 $2 $0")
	                .eachChordAs("$4ia100 $1ia80 $2ia80 $3ia80 $4ia100 $2ia80 $1ia100 $4ia100 $2ia100 $1ia100 $2ia80")
	                .getPattern()
	                .setInstrument("Acoustic_Bass")
	                .setTempo(100)
	                .repeat(100);
	    rhythm = new Rhythm()
	            .addLayer("O..oO...O..oOO..")
	            .addLayer("..S...S...S...SS.")
	            .addLayer("````````````````````")
	            .addLayer("...............+.+.................+")
	            .addLayer("..ssssssss..s.ssss.s.s...s.")
	            .addLayer("```.`.``.`.`.S..S...SSSSS")
	            .getPattern()
	            .setTempo(140)
	            .repeat(100);
	}

	@Override
	public void run() {
       while(true){
    	   player.play(baseProgression, rhythm);
       }
	}

	public static void start() {
		Thread musicThread = new Thread(new SkinDesignerMusic());
		musicThread.start();
	}
}

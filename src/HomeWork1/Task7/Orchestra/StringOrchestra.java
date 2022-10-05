package HomeWork1.Task7.Orchestra;

import HomeWork1.Task7.Insruments.Strings.Bass;
import HomeWork1.Task7.Insruments.Strings.Cello;
import HomeWork1.Task7.Insruments.Strings.Guitar;
import HomeWork1.Task7.Insruments.Strings.Violin;

public class StringOrchestra {
    private Guitar guitar;
    private Bass bass;
    private Cello cello;
    private Violin violin;

    public StringOrchestra() {
        this.guitar = new Guitar();
        this.bass = new Bass();
        this.cello = new Cello();
        this.violin = new Violin();
    }

    public void playYourParts() {
        guitar.playsStrings();
        bass.playsStrings();
        cello.playsStrings();
        violin.playsStrings();
    }
}

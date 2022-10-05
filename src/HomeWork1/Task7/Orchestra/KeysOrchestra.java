package HomeWork1.Task7.Orchestra;

import HomeWork1.Task7.Insruments.Keyboards.Harpsichord;
import HomeWork1.Task7.Insruments.Keyboards.Organ;
import HomeWork1.Task7.Insruments.Keyboards.Piano;

public class KeysOrchestra {
    private Organ organ;
    private Harpsichord harpsichord;
    private Piano piano;

    public KeysOrchestra() {
        this.organ = new Organ();
        this.harpsichord = new Harpsichord();
        this.piano = new Piano();
    }

    public void playYourParts() {
        piano.playKeys();
        harpsichord.playKeys();
        organ.playKeys();
    }
}

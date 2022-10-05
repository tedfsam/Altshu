package HomeWork1.Task7;

import HomeWork1.Task7.Orchestra.KeysOrchestra;
import HomeWork1.Task7.Orchestra.StringOrchestra;

public class Main {
    public static void main(String[] args) {
        KeysOrchestra keysOrchestra = new KeysOrchestra();
        keysOrchestra.playYourParts();
        StringOrchestra stringOrchestra = new StringOrchestra();
        stringOrchestra.playYourParts();
    }
}

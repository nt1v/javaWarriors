package wisniowa.tc;

import wisniowa.tc.characters.Archer;
import wisniowa.tc.characters.Mage;
import wisniowa.tc.characters.Warrior;

import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        Team team = new Team(
                new Mage("vex", 200, 200)
        );

        MainWindow mw = new MainWindow(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT, team);
    }
}

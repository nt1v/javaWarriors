package wisniowa.tc.characters;

import javax.swing.*;

public class Mage extends Player {

    public Mage (String name, int x, int y) {
        super(name, x, y);
        this.baseImage = new ImageIcon("static/images/mage/vex.png").getImage();
    }

}



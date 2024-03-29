package wisniowa.tc.characters;
import wisniowa.tc.Constants;

import javax.swing.*;
import java.awt.*;

public abstract class Player {
    private String name;
    private int x, y, damage, healthPoints;// = 100;
    protected Image baseImage;// default musi byc!!!!
    private int goLeftKey;
    private int goRightKey;
    private int goUpKey;
    private int goDownKey;
    private int attackLeftKey;
    private int attackRightKey;

    public Player(String name, int x, int y, int goLeftKey, int goRightKey, int goUpKey, int goDownKey, int attackLeftKey, int attackRightKey) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.goLeftKey = goLeftKey;
        this.goRightKey = goRightKey;
        this.goUpKey = goUpKey;
        this.goDownKey = goDownKey;
        this.attackLeftKey = attackLeftKey;
        this.attackRightKey = attackRightKey;
    }

    public Player(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        //System.out.println("static/images/" + this.getClass().getSimpleName() + "/1.png");
        this.baseImage = new ImageIcon(Constants.IMAGES_FOLDER + this.getClass().getSimpleName() + "/1.png").getImage();
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getBaseImage() {
        return baseImage;
    }

    public void setX(int x) {
        if (x > Constants.MAX_LEFT_POSITION && x < (Constants.WINDOW_REAL_WIDTH)) {
            this.x = x;
        } else if (x <= Constants.MAX_LEFT_POSITION ) {
            this.x = Constants.MAX_LEFT_POSITION;
        } else if (x >= (Constants.WINDOW_REAL_WIDTH)) {
            this.x = (Constants.WINDOW_REAL_WIDTH);
        }
    }

    public void setY(int y) {
        if (y > Constants.MAX_UP_POSITION && y < Constants.WINDOW_REAL_HEIGHT) {
            this.y = y;
        } else if (y <= Constants.MAX_UP_POSITION) {
            this.y = Constants.MAX_UP_POSITION;
        } else if (y >= Constants.WINDOW_REAL_HEIGHT) {
            this.y = Constants.WINDOW_REAL_HEIGHT;
        }
    }

}

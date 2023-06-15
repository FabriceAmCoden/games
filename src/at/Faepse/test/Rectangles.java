package at.Faepse.test;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangles extends BasicGame {
    private enum DIRECTION {RIGHT, DOWN, LEFT, UP};

    private float x;
    private float y;
    private DIRECTION objectDirection;

    private float x1;
    private float y1;
    private DIRECTION object1Direction;

    private float x2;
    private float y2;
    private DIRECTION object2Direction;

    private float speed;




    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;
        this.speed = 2.0f;
        this.objectDirection = DIRECTION.RIGHT;

        this.y1 = 50;
        this.object1Direction = DIRECTION.DOWN;

        this.x2 = 50;
        this.object2Direction = DIRECTION.RIGHT;

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        if (this.object1Direction == DIRECTION.DOWN) {
            this.y1 + (float)int/this.speed;
            if (this.y1>500){
                this.object1Direction = DIRECTION.UP;
            }
        } else{
            this.y1
        }


    }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

    }


    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new AnimationTest());
            container.setDisplayMode(800,600,false);
            container.start();
        }

        catch (SlickException e) {
            e.printStackTrace();
        }
    }
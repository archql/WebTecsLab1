package com.archql.labs.tasks.task09;

import com.archql.labs.help.IReadableWritable;
import com.archql.labs.help.Utils;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Basket implements IReadableWritable {

    private ArrayList<Ball> balls;

    public Basket() {
        balls = new ArrayList <Ball>();
    }

    public void addBall(Ball ball)
    {
        balls.add(ball);
    }

    public double weight()
    {
        double ret = 0.0;
        for (Ball b : balls)
            ret += b.weight();
        return ret;
    }

    public int countByColor(Ball.COLOR clr) {
        int cnt = 0;
        for (Ball b : balls)
            if (b.hasColor(clr))
                cnt ++;
        return cnt;
    }

    @Override
    public boolean read() {
        System.out.println("Read basket: ");
        int len = Utils.readInt("array len");
        if (!Utils.lastInputValid || len <= 0) {
            return false;
        }
        for (int i = 0; i < len; i++)
        {
            Ball b = new Ball();
            if (!b.read())
                return false;

            balls.add(b);
        }

        return true;
    }

    @Override
    public void write() {
        System.out.println("basket {");
        for(Ball b : balls) {
            b.write();
        }
        System.out.println("} basket");
    }
}

package com.archql.labs.tasks.task09;

import com.archql.labs.help.IReadableWritable;
import com.archql.labs.help.Utils;

public class Ball implements IReadableWritable {

    public enum COLOR {
        RED("red"),
        GREEN("green"),
        BLUE("blue"),
        NONE("none");

        private String text;

        COLOR(String name) {
            this.text = name;
        }

        public String getText() {
            return text;
        }

        public static COLOR fromString(String text) {
            for (COLOR b : COLOR.values()) {
                if (b.text.equalsIgnoreCase(text)) {
                    return b;
                }
            }
            return NONE;
        }
    }

    double _weight;
    COLOR _color;

    public Ball() {}

    public Ball(double weight, COLOR color) {
        _weight = weight;
        _color = color;
    }

    public double weight()
    {
        return _weight;
    }

    public boolean hasColor(COLOR color)
    {
        if (color == null)
            return false;
        return color.equals(_color);
    }


    @Override
    public boolean read() {
        System.out.println("Input next ball to basket (invalid to stop): ");
        _weight = Utils.readDouble("weight");
        if (!Utils.lastInputValid || Utils.realLessEquals(_weight, 0)) {
            return false;
        }
        System.out.print("Input color name: ");
        String colorName = Utils.scanner.nextLine();
        _color = COLOR.fromString(colorName.trim());

        return true;
    }

    @Override
    public void write() {
        System.out.println("Ball: { weight = " + _weight + "; color = " + _color + "} ");
    }
}

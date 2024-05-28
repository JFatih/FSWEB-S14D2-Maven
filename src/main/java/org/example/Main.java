package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(LampType.NORMAL, false, 1);
//        lamp.turnOn();
        Bed bed = new Bed("Vintage", 2, 1, 1,2);
//        bed.make();
        Wardrobe wardrobe = new Wardrobe(6,2,30.5);
//        wardrobe.add();
        Carpet carpet = new Carpet(2, 3, PaintColor.GREEN);
//        carpet.lying();
        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);
//        ceiling.create();
        Wall wall = new Wall("Right");
        Wall wall1 = new Wall("left");
        Wall wall2 = new Wall("Right");
        Wall wall3 = new Wall("Right");
//        wall.create();
        Bedroom bedroom = new Bedroom("Parents Bedroom", wall1,wall,wall2,wall3,
                ceiling,bed,lamp,wardrobe,carpet);
        System.out.println(bedroom.toString());;
    }
}
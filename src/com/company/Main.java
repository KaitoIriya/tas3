package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Упражение №1-3");
        System.out.println();

        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius());  s1 наследует все методы из абстрактного Shape при этом не может использовать метод getRadius() из класса Circle (upcast)

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape(); Класс Shape абстрактный и не может быть создан

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); s3 наследует все методы из абстрактного Shape при этом не может использовать метод getLength() из класса Rectangle (upcast to Shape)

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); s4 наследует все методы из абстрактного Shape при этом не может использовать метод getSide() из класса Square (upcast to Shape)

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); так же, как и в случае с s4 не может использовать метод getSide() из класса Square (downcast to Shape)
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2; // Downcast Rectangle r2 to Square
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Упражение №4-5");
        System.out.println();

        MovablePoint mp = new MovablePoint(1, 1, 1, 1);
        System.out.println(mp.toString());
        mp.moveRight();
        mp.moveLeft();
        mp.moveDown();
        mp.moveUp();
        //Точка останется на прежнем месте
        System.out.println(mp.toString());

        MovableCircle mc = new MovableCircle(2, 2, 2, 2, 4);
        System.out.println(mc.toString());
        mc.moveRight();
        mc.moveUp();
        //Круг сместится на (+1, +1)
        System.out.println(mc.toString());

        MovableRectangle mr1 = new MovableRectangle(4, 6, 2, 4, 3, 3);
        System.out.println(mr1.toString());

        mr1.moveDown();
        mr1.moveLeft();
        //Прямоугольник сместится на (-1, -1)
        System.out.println(mr1.toString());

        MovableRectangle mr2 = new MovableRectangle(1, 5, 3, 2, 2, 4); //разные скорости xSpeed и ySpeed



    }
}

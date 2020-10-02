package com.company;

public class MovableRectangle implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        if (xSpeed == ySpeed) {
            System.out.println("Скорость перемещения точек одинакова, следовательно, программа может работать с заданными координатами");
        } else {
            System.out.println("Скорость разная, создайте объект Rectangle с одинаковыми скоростями xSpeed и ySpeed");
            System.exit(0);
        }
    }

    @Override
    public String toString(){
        return "Rectangle at ("+topLeft.x+", "+topLeft.y+", "+bottomRight.x+", "+bottomRight.y+")";
    }
    @Override
    public void moveUp(){
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    @Override
    public void moveDown(){
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    @Override
    public void moveLeft(){
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    @Override
    public void moveRight(){
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}

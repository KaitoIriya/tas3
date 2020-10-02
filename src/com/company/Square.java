package com.company;

public class Square extends Rectangle {
    protected double side;

    public Square(){
        this.filled = false;
        side = 0;
    }
    public Square(double side){
        this.filled = false;
        this.color = "black";
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        this.filled = filled;
        this.color = color;
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public String toString() {
        return "Shape: square, side: "+this.side+", color: "+this.color;
    }
}

package demo1.advanceShape;

import demo1.myShape.Shape;
import demo1.otherShape.XxCircle;

/**
 * 组合模式，实现适配器模式
 */
public class Circle extends Shape {

    private XxCircle xxCircle;

    public Circle(){
        this.xxCircle = new XxCircle();
    }

    public Circle(XxCircle xxCircle) {
        this.xxCircle = xxCircle;
    }

    @Override
    public void display() {
        xxCircle.displayIt();
    }

    @Override
    public void fill() {
        xxCircle.fillIt();
    }

    @Override
    public void unDisplay() {
        //todo implement own display method
    }
}

package com.day11.day11homework.test7;

/**
 * @author Symon
 * @version 1.0
 * @className Apple
 * @description TODO
 * @date 2020/8/4 23:10
 */
public class Apple {
    private double size;
    private String color;

    public Apple(double size, String color) {
        this.size = size;
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    static class Compare implements CompareAble{
        public void compareColor(Apple... apples) {
            for (Apple a : apples) {
                if ("红色".equals(a.getColor()) || "red".equals(a.getColor())) {
                    System.out.println(a);
                }
            }
        }
    }
}

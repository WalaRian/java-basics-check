package at.tasks.incapsulation;

import java.awt.*;

public class Square {
    private int x;
    private int y;
    private int sideLength;

    // Конструктор класса
    public Square(int x, int y, int sideLength) {
        this.x = x;
        this.y = y;
        setSideLength(sideLength);
    }

    // Геттеры и сеттеры
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Длина стороны должна быть положительной");
        }
        this.sideLength = sideLength;
    }

    // Метод для строкового представления
    public String toString() {
        return String.format("Квадрат в точке (%d, %d) со стороной %d", x, y, sideLength);
    }
}
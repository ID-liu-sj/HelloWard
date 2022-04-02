package day0323;

import java.util.Objects;

public class Text {
    private  int x;
    private  int y;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return x == text.x && y == text.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public Text(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Text{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

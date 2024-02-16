package geo;

public class Punkt {

    private double x,y;

    public Punkt(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(final double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(final double y) {
        this.y = y;
    }

    public void rechts() {
        x ++;
    }


    public String toString() {
        final StringBuilder sb = new StringBuilder("Punkt{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}

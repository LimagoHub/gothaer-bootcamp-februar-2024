package geo;

public class Kreis extends Punkt{

    private double radius;

    public Kreis(final double x, final double y, final double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(final double radius) {
        this.radius = radius;
    }


    public String toString() {
        final StringBuilder sb = new StringBuilder("Kreis{");
        sb.append("radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }
}

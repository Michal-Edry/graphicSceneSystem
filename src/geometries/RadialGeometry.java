package geometries;

public abstract class RadialGeometry implements Geometry {
    double _radius;

    public RadialGeometry(double _radius) {
        this._radius = _radius;
    }

    public RadialGeometry(RadialGeometry _r) {
        this._radius = _r._radius;
    }

    public double get_radius() {
        return _radius;
    }

}
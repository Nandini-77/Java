abstract class Shape3D {
        public abstract double calculateVolume();
        public abstract double calculateSurfaceArea();
    }
    class Sphere extends Shape3D {
        int radius;
         Sphere(int radius) {
            this.radius = radius;
        }
        @Override
        public double calculateVolume() {
            return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        }
        @Override
        public double calculateSurfaceArea() {
            return 4 * Math.PI * Math.pow(radius, 2);
        }
    }
    class Cube extends Shape3D {
        int edge;
         Cube(int edge) {
            this.edge = edge;
        }
        @Override
        public double calculateVolume() {
            return Math.pow(edge, 3);
        }
        @Override
        public double calculateSurfaceArea() {
            return 6 * Math.pow(edge, 2);
        }
    }
    public class Calc {
        public static void main(String[] args) {
            System.out.println("K.Nandini, AV.SC.U4CSE24205, CSE-C");
            Sphere s = new Sphere(5);
            System.out.println("Volume of Sphere of radius 5 : " + s.calculateVolume());
            System.out.println("Surface Area of Sphere of radius 5 : " + s.calculateSurfaceArea());
            Cube c = new Cube(7);
            System.out.println("Volume of Cube of edge 7: " + c.calculateVolume());
            System.out.println("Surface Area of Cube of edge 7 : " + c.calculateSurfaceArea());
        }
    }
    
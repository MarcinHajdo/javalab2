package agh.cs.lab2;

public class World {
    public static void main(String[] args) {
        /*Vector2d position1 = new Vector2d(2,1);
        Vector2d position2 = new Vector2d(1,2);
        Vector2d position3 = position1.upperRight(position2);
        Vector2d position4 = position1.lowerLeft(position2);
        Vector2d position5 = position1.add(position2);
        Vector2d position6 = position1.subtract(position2);
        Vector2d position7 = position1.opposite();
        System.out.println(position3.toString());
        System.out.println(position4.toString());
        System.out.println(position5.toString());
        System.out.println(position6.toString());
        System.out.println(position7.toString());
        System.out.println(position1.equals(position1));
        System.out.println(position1.equals(position2));*/
        /*Vector2d position1 = new Vector2d(1,2);
        System.out.println(position1);
        Vector2d position2 = new Vector2d(-2,1);
        System.out.println(position2);
        System.out.println(position1.add(position2));
        System.out.println(MapDirection.NORTH.toString());
        System.out.println(MapDirection.NORTH.next());
        System.out.println(MapDirection.NORTH.previous());
        System.out.println(MapDirection.NORTH.toUnitVector().toString());*/
        System.out.println(MapDirection.NORTH.previous());
    }
    enum MoveDirection {
        FORWARD,
        BACKWARD,
        RIGHT,
        LEFT
    }
    enum MapDirection {
        NORTH,
        SOUTH,
        EAST,
        WEST;

        public String toString(){
            switch(this) {
                case NORTH: return "Polnoc";
                case SOUTH: return "Poludnie";
                case EAST:  return "Wschod";
                case WEST:  return "Zachod";
                default:    return "Error";
            }
        }
        public MapDirection next(){
            switch(this) {
                case NORTH: return EAST;
                case SOUTH: return WEST;
                case EAST:  return SOUTH;
                case WEST:  return NORTH;
                default:    return null;
            }
        }
        public MapDirection previous(){
            switch(this) {
                case NORTH: return WEST;
                case SOUTH: return EAST;
                case WEST:  return SOUTH;
                case EAST:  return NORTH;
                default:    return null;
            }

        }
        public Vector2d toUnitVector(){
            switch(this) {
                case NORTH: return new Vector2d(0,1);
                case SOUTH: return new Vector2d(0,-1);
                case WEST: return new Vector2d(-1,0);
                case EAST: return new Vector2d(1,0);
            }
            return new Vector2d(0,0);
        }
        public String toUnitedVector(){
            switch(this) {
                case NORTH: return new Vector2d(0,1).toString();
                case SOUTH: return new Vector2d(0,-1).toString();
                case WEST: return new Vector2d(-1,0).toString();
                case EAST: return new Vector2d(1,0).toString();
            }
            return new Vector2d(0,0).toString();
        }
    }
}

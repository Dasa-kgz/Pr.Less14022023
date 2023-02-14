public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        animals[0] = new Animal();
        animals[1] = new Fish();
        animals[2] = new Shark();
        animals[3] = new Turtle();

        for (int i = 0; i < animals.length; i++) {

            if (animals[i].getClass() == Animal.class) {

                animals[i].move();

            } else if (animals[i].getClass() == Fish.class) {

                ((Fish) animals[i]).swim();

            } else if (animals[i].getClass() == Shark.class) {

                ((Shark) animals[i]).attack();

            }else if (animals[i].getClass() == Turtle.class) {

                ((Turtle) animals[i]).rest();

            }
        }
    }
}
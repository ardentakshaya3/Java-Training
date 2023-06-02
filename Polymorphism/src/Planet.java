public class Planet {
    public void printPlanet() {
        System.out.println("Check out Planet names!");
    }
}

class First extends Planet {
    @Override
    public void printPlanet() {
        System.out.println("1st planet is Mercury");
    }
}

class Second extends Planet {
    @Override
    public void printPlanet() {
        System.out.println("2nd planet is Venus");
    }
}
class Third extends Planet {
    @Override
    public void printPlanet() {
        System.out.println("3rd planet is Earth");
    }
}
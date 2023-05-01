class City
{
    String name;
    int population;

    City(City c1)
    {
        this.name = c1.name;
        this.population = c1.population;
        System.out.println(name);
        System.out.println(population);

    }
    City()
    {
        System.out.println("checking");
    }
}
public class Main {
    public static void main(String[] args)
    {
        City city  = new City(  );
        city.name =  "pune";
        city.population = 1000;
        City city1 = new City(city);


    }
}
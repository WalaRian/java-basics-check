package at.tasks.objects_and_classes;

public class City {
    String name;
    Route[] routes;

    public City(String name) {
        this.name = name;
        this.routes = null;
    }

    public City(String name, Route[] routes) {
        this.name = name;
        this.routes = routes;
    }

    public void addRoute(Route route) {

    }

    public void addRoute(City city, int price) {
        
    }
}

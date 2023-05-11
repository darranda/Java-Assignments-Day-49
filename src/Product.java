public class Product {
    public double cost;
    public int quantity;
    public String name;

    public Product (double cost, int quantity, String name) {
        this.cost = cost;
        this.quantity = quantity;
        this.name = name;
    }

    public void totalCost (){
        System.out.println("Total cost is " + (quantity*cost));
    }

    public void printProduct() {
        System.out.println("A gallon of " + name + " costs " + cost + " and " + quantity + " units were purchased.");
    }
}

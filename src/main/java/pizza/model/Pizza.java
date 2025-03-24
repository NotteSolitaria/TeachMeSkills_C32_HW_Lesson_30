package pizza.model;

import lombok.Builder;

@Builder
public class Pizza {
    String name;
    String price;
    String description;

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

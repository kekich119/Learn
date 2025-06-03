package application;

import java.time.LocalDate;
import java.util.stream.Stream;

public class Product {
    private String name;
    private LocalDate expirationDate;

    public Product(String name, LocalDate expirationDate) {
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

}
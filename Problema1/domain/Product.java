package domain;

import java.util.UUID;

public abstract class Product {
    protected UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}

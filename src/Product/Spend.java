package Product;

import java.io.Serializable;

public class Spend implements Serializable {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Spend() {
    }

    public Spend(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

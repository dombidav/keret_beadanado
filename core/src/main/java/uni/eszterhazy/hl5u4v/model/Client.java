package uni.eszterhazy.hl5u4v.model;

import java.util.UUID;

public class Client {
    private String id;
    private String name;

    public Client() {
        this.setId(UUID.randomUUID().toString());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) { //TODO: Private?
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

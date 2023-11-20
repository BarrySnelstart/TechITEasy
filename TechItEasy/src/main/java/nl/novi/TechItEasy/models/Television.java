package nl.novi.TechItEasy.models;

public class Television {
    private int ID;
    private String name;
    private String model;

    public Television() {
    }
    public Television(int ID, String name, String model) {
        this.ID = ID;
        this.name = name;
        this.model = model;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



}





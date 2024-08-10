public class Customer {
    private int id;
    private String name;
    private String location;
    private int rewardPoints;

    // Constructor
    public Customer(int id, String name, String location, int rewardPoints) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rewardPoints = rewardPoints;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for location
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Getter and Setter for rewardPoints
    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    // toString method for displaying customer information
    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", location=" + location + ", rewardPoints=" + rewardPoints + "]";
    }
}

package Week_7_object_oriented;

public class SwimmingPool {

    private String name;  // field, or a variable.
    private double length; // another field.
    private String address;
    private double maxDepth;

    SwimmingPool(String poolName, double poolLength, String PoolAddress, double poolMaxDepth) {

        name = poolName;
        length = poolLength;
        address = PoolAddress;
        maxDepth = poolMaxDepth;
    }
    // instance method
    // Instance is another word for an object
    // an instance of a class
    // A pool object is an instance of the pool class
    public double distanceForLaps(int laps) {
        // 10 laps of pools of length 50, that's 500 meters.
        double total = laps * length;
        return total;
    }

    @Override
    public String toString() {
        String description = name + " pool is " + length + " meters long. City " + address + ". A Max Deep is " + maxDepth + " feet's.";
        return description;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if (length < 0 || length > 1000) {
            return;
        }
        this.length = length;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }
}

public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory list;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.list = new ChangeHistory();
        list.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }

    public String history(){
        return list.toString();
    }

    public void printAnalysis(){
        System.out.printf("Product: " + super.getName()+
                "\nHistory: " + list +
                "\nLargest amount of product: " + list.maxValue() +
                "\nSmallest amount of product: " + list.minValue() +
                "\nAverage: "+ list.average());
    }

    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        list.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount){
        double whatItTake = super.takeFromWarehouse(amount);
        list.add(super.getBalance());
        return whatItTake;
    }

}

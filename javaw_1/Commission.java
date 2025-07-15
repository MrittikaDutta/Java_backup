public class Commission {
    private double sales;

    public Commission(double sales) {
        this.sales = sales;
    }

    public double commission() {
        double commissionRate;

        if (sales >= 10000) {
            commissionRate = 0.10;
        } else if (sales >= 5000) {
            commissionRate = 0.07;
        } else {
            commissionRate = 0.05;
        }

        return sales * commissionRate;
    }
}
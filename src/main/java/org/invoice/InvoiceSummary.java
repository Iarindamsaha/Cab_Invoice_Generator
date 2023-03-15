package org.invoice;

public class InvoiceSummary {

    private final int numberOfRides;
    private final double totalFare;
    private final double averageFare;


    public InvoiceSummary(int numberOfRides, double totalFare) {
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
        this.averageFare = this.totalFare / this.numberOfRides;
    }


}

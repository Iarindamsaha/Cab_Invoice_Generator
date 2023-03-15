package org.invoice;

public class InvoiceGenerator {

    double MINIMUM_COST_PER_KM;
    int COST_PER_TIME;
    double MINIMUM_FARE;

    public double calculateFare(double distance,int time,Ride.RideType rideType) {


                if(rideType == Ride.RideType.NORMAL) {
                    MINIMUM_COST_PER_KM = 10;
                    COST_PER_TIME = 1;
                    MINIMUM_FARE = 5;

                } else {
                    MINIMUM_COST_PER_KM = 15;
                    COST_PER_TIME = 2;
                    MINIMUM_FARE = 20;
                }

                double totalFare = distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;

                if( totalFare < MINIMUM_FARE) {
                    totalFare = MINIMUM_FARE;
                }

        return totalFare;
    }

    public double calculateFare(Ride[] rides, Ride.RideType rideType, String userName) {

        UserId user = new UserId("Arindam");
        boolean update = userName.equals(user.getUser());
        double totalFare = 0.0;

        try{
            if (!update){
                throw new UserIdException ("--Invalid User Id---");
            }
            else{
                for (Ride ride : rides){

                    totalFare += this.calculateFare (ride.distance, ride.time, rideType);

                }


            }

        }
        catch (UserIdException e){
            System.out.println(e.getMessage());
        }
        return totalFare;
    }

}

package builder;

public class FlightLeg {
    int price;
    String origin;
    String destination;

    private FlightLeg(FlightLegBuilder flightLegBuilder) {
        this.price = flightLegBuilder.price;
        this.origin = flightLegBuilder.origin;
        this.destination = flightLegBuilder.destination;
    }

    public static class FlightLegBuilder {

        int price;
        String origin;
        String destination;

        public FlightLegBuilder(final String origin, final String destination) {
            origin(origin);
            destination(destination);
        }

        public FlightLegBuilder destination(String destination) {
            this.destination = destination;
            return this;
        }

        public FlightLegBuilder origin(String origin) {
            this.origin = origin;
            return this;
        }

        public FlightLegBuilder price(final int price) {
            this.price = price;
            return this;
        }

        public FlightLeg build() {
            return new FlightLeg(this);
        }

    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "price=" + price +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}

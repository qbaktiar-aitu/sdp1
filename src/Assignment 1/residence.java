// Task 3: Builder Pattern

class Residence {
    private int rooms;
    private int floors;
    private boolean poolAvailable;
    private boolean garageAvailable;

    private Residence(ResidenceBuilder builder) {
        this.rooms = builder.rooms;
        this.floors = builder.floors;
        this.poolAvailable = builder.poolAvailable;
        this.garageAvailable = builder.garageAvailable;
    }

    public static class ResidenceBuilder {
        private int rooms;
        private int floors;
        private boolean poolAvailable;
        private boolean garageAvailable;

        public ResidenceBuilder configureRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public ResidenceBuilder configureFloors(int floors) {
            this.floors = floors;
            return this;
        }

        public ResidenceBuilder withPool(boolean poolAvailable) {
            this.poolAvailable = poolAvailable;
            return this;
        }

        public ResidenceBuilder withGarage(boolean garageAvailable) {
            this.garageAvailable = garageAvailable;
            return this;
        }

        public Residence create() {
            return new Residence(this);
        }
    }

    @Override
    public String toString() {
        return "Residence{" +
                "rooms=" + rooms +
                ", floors=" + floors +
                ", poolAvailable=" + poolAvailable +
                ", garageAvailable=" + garageAvailable +
                '}';
    }
}
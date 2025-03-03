public class Park {

    private String parkName;
    private Attraction[] attractions;

    public Park(String parkName, Attraction[] attractions) {
        this.parkName = parkName;
        this.attractions = attractions;
    }

    public static class Attraction {
        private String attractionName;
        private String workingHours;
        private Double cost;

        public Attraction(String attractionName, String workingHours, double cost) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void displayAttractionInfo() {
            System.out.println("Attraction Name: " + attractionName);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Cost: " + cost);
        }
    }

}

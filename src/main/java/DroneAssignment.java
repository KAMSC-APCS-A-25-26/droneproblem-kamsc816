// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
public class DroneAssignment {
    public static void main(String[] args) {
        // Initial drone values
        double altitude = 150.7;
        double battery = 87.3;
        int photos = 0;
        
        System.out.println("=== Drone Flight Simulation ===");
        System.out.println("Initial Status:");
        System.out.println("Altitude: " + altitude + " meters");
        System.out.println("Battery: " + battery + "%");
        System.out.println("Photos: " + photos);
        System.out.println();

        int displayAltitude = (int)altitude;
        int batteryRounded = (int)battery;
        System.out.println("Display Altitude: " + displayAltitude);
        System.out.println("Battery Rounded: " + batteryRounded);
        System.out.println();

        altitude += 20;
        battery -= 15;
        photos += 3;
        System.out.println("After climbing 20m: " + altitude);
        System.out.println("After battery drain: " + battery);
        System.out.println("After taking 3 photos: " + photos);

        altitude /= 2;
        System.out.println("After descending to half: " + altitude);
        System.out.println("Photos: " + photos);

        photos %= 4;
        System.out.println("Storage slots used: " + photos + " out of 4");



    }
}

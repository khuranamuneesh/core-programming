public class EarthVolume {
    public static void main(String[] args) {
        double radiusKM = 6378;
        double radiusMiles = radiusKM * 1.6;
        double constantValue = (double) 4/3;
        double earthVolumeCubicKM = constantValue * Math.PI * Math.pow(radiusKM,3.0D);
        double earthVolumeCubicMiles = constantValue * Math.PI * Math.pow(radiusMiles,3.0D);
        System.out.println("The volume of earth in cubic kilometers is " + earthVolumeCubicKM + " and cubic miles is " + earthVolumeCubicMiles);


    }
}

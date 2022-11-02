package ua.hillel.HW_002;

public class ConvertorDegrees {
    public static void main(String[] args) {
        float x = 5f, y, z;
        y = 9*x/5+32;
        z = x + 273.16f;  // Kelvin
        System.out.println(x + "C:"  + y + "F;" + z + "K");
    }
}

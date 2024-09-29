import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Приложение для конвертации температуры");
        int fahrenheit = 37;
        double calculatedCelsius = ConvertFrtToCls(fahrenheit);
        DecimalFormat myFormat = new DecimalFormat("#.##");
        System.out.println(fahrenheit + " градусов по фаренгейту, будет " + myFormat.format(calculatedCelsius) + " градусов по цельсию");
        int celsius = 12;
        double calculatedFahrenheit = ConvertClsToFrt(celsius);
        System.out.println(celsius + " градусов по цельсию, будет " + calculatedFahrenheit + " градусов по фаренгейту");
    }

    public static double ConvertFrtToCls(int frt){
        return (double) (frt - 32) * 5/9;
    }
    public static double ConvertClsToFrt(int cls){
        return cls * 1.8 + 32;
    }
}

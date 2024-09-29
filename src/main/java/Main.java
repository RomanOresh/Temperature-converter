import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Приложение для конвертации температуры");
        int fahrenheit = 49;
        double calculatedCelsius = ConvertFrtToCls(fahrenheit);
        DecimalFormat myFormat = new DecimalFormat("#.##");
        System.out.println(fahrenheit + " градусов по фаренгейту, будет " + myFormat.format(calculatedCelsius) + " градусов по цельсию");
    }

    public static double ConvertFrtToCls(int frt){
        return (double) (frt - 32) * 5/9;
    }
}

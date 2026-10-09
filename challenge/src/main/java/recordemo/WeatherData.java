package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {
 
   // Instance method to convert Celsius to Fahrenheit
  public double temperatureFahrenheit() {
    return (temperatureCelsius*9.0/5+32);
  }
   // Instance method to get a formatted summary string
  public String getSummary() {
    return "Current weather: "+ temperatureCelsius + "°C ("+temperatureFahrenheit()+"°F) and "+conditions;
    }
 // Static factory method to create a WeatherData record from Fahrenheit
  public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
    return new WeatherData(((tempFahrenheit-32)*(5.0/9)), conditions);
   }

   public static void main(String[] args) {
    WeatherData Today_weather = new WeatherData(25,"Sunny" );
    System.out.println("Today's weather: "+Today_weather.getSummary());
    WeatherData Yesterday_weather = WeatherData.fromFahrenheit(50, "Cloudy");
    System.out.println("Yesterday's weather: " +Yesterday_weather.getSummary());
   }
}

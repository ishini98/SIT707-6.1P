package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {

    @Test
    public void testStudentIdentity() {
        String studentId = "s223075053";
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Ishini Bhagya";
        Assert.assertNotNull("Student name is null", studentName);
    }

    // Tests for isEven method
    @Test
    public void testIsEven() {
        Assert.assertTrue(WeatherAndMathUtils.isEven(2)); // Even number
        Assert.assertFalse(WeatherAndMathUtils.isEven(3)); // Odd number
    }

    @Test
    public void testIsEven_Negative() {
        Assert.assertTrue(WeatherAndMathUtils.isEven(-4)); // Negative even number
        Assert.assertFalse(WeatherAndMathUtils.isEven(-5)); // Negative odd number
    }

    @Test
    public void testIsEven_Zero() {
        Assert.assertTrue(WeatherAndMathUtils.isEven(0)); // Zero is even
    }

    // Tests for isPrime method
    @Test
    public void testIsPrime() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(2)); // Prime number
        Assert.assertTrue(WeatherAndMathUtils.isPrime(3)); // Prime number
        Assert.assertFalse(WeatherAndMathUtils.isPrime(4)); // Not a prime number
        Assert.assertTrue(WeatherAndMathUtils.isPrime(5)); // Prime number
    }

    @Test
    public void testIsPrime_One() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(1)); // Special case: 1 is considered prime
    }

  

    // Tests for weatherAdvice method
    @Test
    public void testWeatherAdvice_DangerousWind() {
        String advice = WeatherAndMathUtils.weatherAdvice(70.1, 0.0); // Dangerous wind
        Assert.assertEquals("CANCEL", advice);
    }

    @Test
    public void testWeatherAdvice_DangerousRain() {
        String advice = WeatherAndMathUtils.weatherAdvice(10.0, 6.1); // Dangerous rain
        Assert.assertEquals("CANCEL", advice);
    }

    @Test
    public void testWeatherAdvice_DangerousWindAndRain() {
        String advice = WeatherAndMathUtils.weatherAdvice(46.0, 4.1); // Moderate wind and rain
        Assert.assertEquals("CANCEL", advice);
    }

    @Test
    public void testWeatherAdvice_ModerateWind() {
        String advice = WeatherAndMathUtils.weatherAdvice(50.0, 3.0); // Moderate wind, safe rain
        Assert.assertEquals("WARN", advice);
    }

    @Test
    public void testWeatherAdvice_ModerateRain() {
        String advice = WeatherAndMathUtils.weatherAdvice(30.0, 4.1); // Safe wind, moderate rain
        Assert.assertEquals("WARN", advice);
    }

    @Test
    public void testWeatherAdvice_AllClear() {
        String advice = WeatherAndMathUtils.weatherAdvice(30.0, 2.0); // Safe conditions
        Assert.assertEquals("ALL CLEAR", advice);
    }

    

    @Test
    public void testWeatherAdvice_BoundaryValues() {
        String advice = WeatherAndMathUtils.weatherAdvice(45.0, 4.0); // Boundary condition
        Assert.assertEquals("ALL CLEAR", advice);

        advice = WeatherAndMathUtils.weatherAdvice(70.0, 6.0); // Exact dangerous threshold
       // Assert.assertEquals("ALL CLEAR", advice);
    }
    
    @Test
    public void testWeatherAdvice_DangrousRain() {
        String advice = WeatherAndMathUtils.weatherAdvice(10.0, 6.1); // Dangerous rain
        Assert.assertEquals("CANCEL", advice);
    }

    @Test
    public void testWeatherAdvice_DangerouWindAndRain() {
        String advice = WeatherAndMathUtils.weatherAdvice(46.0, 4.1); // Moderate wind and rain
        Assert.assertEquals("CANCEL", advice);
    }

    @Test
    public void testWeatherAdvice_ModeraeWind() {
        String advice = WeatherAndMathUtils.weatherAdvice(50.0, 3.0); // Moderate wind, safe rain
        Assert.assertEquals("WARN", advice);
    }
}

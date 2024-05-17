package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class ConditionalLoopsTest {

    @Test
    public void testCountEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(2, result); // Expected output should be the number of even numbers
    }

    @Test
    public void testCountEvenNumbers_AllEven() {
        int[] numbers = {2, 4, 6, 8};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(4, result); // All numbers are even
    }

    @Test
    public void testCountEvenNumbers_AllOdd() {
        int[] numbers = {1, 3, 5, 7};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(0, result); // All numbers are odd
    }

    @Test
    public void testCountEvenNumbers_EmptyArray() {
        int[] numbers = {};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(0, result); // No numbers, so no evens
    }

    @Test
    public void testCountEvenNumbers_NegativeNumbers() {
        int[] numbers = {-2, -3, -4, -5};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(2, result); // -2 and -4 are even
    }

    @Test
    public void testCountEvenNumbers_LargeNumbers() {
        int[] numbers = {1000000, 1000001};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(1, result); // 1000000 is even
    }

    @Test
    public void testCountEvenNumbers_MixedPositiveNegative() {
        int[] numbers = {-1, -2, 3, 4, 5, 6};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(3, result); // -2, 4, and 6 are even
    }

    @Test
    public void testCountEvenNumbers_MixedOrder() {
        int[] numbers = {3, 4, 5, 2, 1, 6};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(3, result); // 4, 2, and 6 are even
    }

    @Test
    public void testCountEvenNumbers_SingleEvenNumber() {
        int[] numbers = {2};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(1, result); // Single even number
    }

    @Test
    public void testCountEvenNumbers_SingleOddNumber() {
        int[] numbers = {1};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(0, result); // Single odd number
    }

    @Test
    public void testCountEvenNumbers_RepeatedEvenNumbers() {
        int[] numbers = {2, 2, 2};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(3, result); // Three even numbers
    }
    
    @Test
    public void testContainsPrime_AllPrime() {
        int[] numbers = {2, 3, 5, 7};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // All numbers are prime
    }

    @Test
    public void testContainsPrime_LargeNumber() {
        int[] numbers = {999983, 1000000}; // 999983 is a prime number
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result);
    }

    @Test
    public void testContainsPrime_AllSmalPrime() {
        int[] numbers = {2, 3, 5, 7, 11};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // All are prime numbers
    }

    @Test
    public void testContainsPrime_MixdNumber() {
        int[] numbers = {1, 4, 6, 9, 10, 13}; // 13 is a prime number
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result);
    }

    @Test
    public void testCountEvenNumbers_SingleLargeEvenNumber() {
        int[] numbers = {Integer.MAX_VALUE - 1}; // A large even number
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(1, result); // One even number
    }
    
    @Test
    public void testCountEvenNumbers_SingleLargeOddNumber() {
        int[] numbers = {Integer.MAX_VALUE}; // A large odd number
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(0, result); // No even numbers
    }
    
    @Test
    public void testContainsPrime_MixedSmallLargeNumbers() {
        int[] numbers = {2, 3, 4, 5, Integer.MAX_VALUE}; // Contains small primes and large prime
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // Should contain prime numbers
    }

    @Test
    public void testContainsPrime_PrimeAtStart() {
        int[] numbers = {13, 4, 6, 8, 9, 10};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // 13 is a prime number at the start
    }



    @Test
    public void testCountEvenNumbers_RepeatedOddNumbers() {
        int[] numbers = {1, 1, 1};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(0, result); // Three odd numbers
    }

    @Test
    public void testCountEvenNumbers_AltrnatingNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(4, result); // 2, 4, 6, 8 are even
    }
    
    @Test
    public void testContainsPrime_NegatveAndZer() {
        int[] numbers = {-10, -3, -2, 0, 1};
        boolean result = ConditionalLoops.containsPrime(numbers);
    }

    @Test
    public void testContainsPrime_SingleLrgePrim() {
        int[] numbers = {2147483647}; // 2147483647 is a prime number
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // Single large prime number
    }

    @Test
    public void testContainsPrime_BounaryNumber() {
        int[] numbers = {0, 1, 2, 3};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // 2 and 3 are prime
    }
    
    
    @Test
    public void testCountEvenNumbers_AlternatingNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(4, result); // 2, 4, 6, 8 are even
    }
    
    @Test
    public void testContainsPrime_NegativeAndZer() {
        int[] numbers = {-10, -3, -2, 0, 1};
        boolean result = ConditionalLoops.containsPrime(numbers);
    }

    @Test
    public void testContainsPrime_SingleLargePrim() {
        int[] numbers = {2147483647}; // 2147483647 is a prime number
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // Single large prime number
    }

    @Test
    public void testContainsPrime_BoundaryNumber() {
        int[] numbers = {0, 1, 2, 3};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // 2 and 3 are prime
    }


    @Test
    public void testCountEvenNumbers_MaxIntegerValues() {
        int[] numbers = {Integer.MAX_VALUE, Integer.MAX_VALUE - 1};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(1, result); // Only Integer.MAX_VALUE - 1 is even
    }

    @Test
    public void testCountEvenNumbers_AllNegativeNumbers() {
        int[] numbers = {-2, -4, -6, -8};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(4, result); // All numbers are negative and even
    }

    @Test
    public void testCountEvenNumbers_MixedLargeSmallNumbers() {
        int[] numbers = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0, -1, 1};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(2, result); // Integer.MIN_VALUE and 0 are even
    }

    @Test
    public void testCountEvenNumbers_RepeatedEvenNumber() {
        int[] numbers = {2, 2, 2, 2};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(4, result); // Four even numbers
    }

    @Test
    public void testCountEvenNumbers_RepeatedOddNumber() {
        int[] numbers = {1, 1, 1, 1};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(0, result); // No even numbers
    }

    @Test
    public void testContainsPrime() {
        int[] numbers = {4, 6, 8, 9, 11};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // Expected output is true, because 11 is prime
    }

    @Test
    public void testContainsPrime_SinglePrime() {
        int[] numbers = {11};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // Only one prime number
    }

    @Test
    public void testContainsPrime_NoPrime() {
        int[] numbers = {4, 6, 8, 9, 10};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertFalse(result); // Expected output is false, because there are no prime numbers
    }

    @Test
    public void testContainsPrime_EmptyArray() {
        int[] numbers = {};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertFalse(result); // No numbers, so no primes
    }
    
    @Test
    public void testContainsPrim_NegativeAndZero() {
        int[] numbers = {-10, -3, -2, 0, 1};
        boolean result = ConditionalLoops.containsPrime(numbers);
    }

    @Test
    public void testContainsPrim_SingleLargePrime() {
        int[] numbers = {2147483647}; // 2147483647 is a prime number
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // Single large prime number
    }

    @Test
    public void testContainsPrim_BoundaryNumbers() {
        int[] numbers = {0, 1, 2, 3};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // 2 and 3 are prime
    }


    @Test
    public void testContainsPrime_AllPrimes() {
        int[] numbers = {2, 3, 5, 7};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // All numbers are prime
    }

    @Test
    public void testContainsPrime_LargeNumbers() {
        int[] numbers = {999983, 1000000}; // 999983 is a prime number
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result);
    }

    @Test
    public void testContainsPrime_AllSmallPrimes() {
        int[] numbers = {2, 3, 5, 7, 11};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // All are prime numbers
    }

    @Test
    public void testContainsPrime_MixedNumbers() {
        int[] numbers = {1, 4, 6, 9, 10, 13}; // 13 is a prime number
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result);
    }

    @Test
    public void testContainsPrime_MixedPositiveNegative() {
        int[] numbers = {-3, -4, -5, 2, 3, 5};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // 2, 3, and 5 are prime
    }

    @Test
    public void testContainsPrime_EdgeCaseZeroOne() {
        int[] numbers = {0, 1};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // 1 is considered prime based on the implementation
    }

    @Test
    public void testContainsPrime_SinglePrimeNumber() {
        int[] numbers = {2};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // Single prime number
    }

    @Test
    public void testContainsPrime_SingleNonPrimeNumber() {
        int[] numbers = {4};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertFalse(result); // Single non-prime number
    }

    @Test
    public void testContainsPrime_RepeatedPrimeNumbers() {
        int[] numbers = {3, 3, 3};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // Three prime numbers
    }
    
    @Test
    public void testContainsPrime_AllSmallPrime() {
        int[] numbers = {2, 3, 5, 7, 11};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // All are prime numbers
    }

    @Test
    public void testContainsPrime_MixedNumber() {
        int[] numbers = {1, 4, 6, 9, 10, 13}; // 13 is a prime number
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result);
    }

    @Test
    public void testContainsPrime_MixedPositveNegative() {
        int[] numbers = {-3, -4, -5, 2, 3, 5};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // 2, 3, and 5 are prime
    }

    @Test
    public void testContainsPrime_EdgeCasZeroOne() {
        int[] numbers = {0, 1};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // 1 is considered prime based on the implementation
    }
    
   

    @Test
    public void testCountEvenNumbers_RepeatedOdNumber() {
        int[] numbers = {1, 1, 1};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(0, result); // Three odd numbers
    }

    @Test
    public void testCountEvenNumbers_AlternatingNumber() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(4, result); // 2, 4, 6, 8 are even
    }

    @Test
    public void testCountEvenNumbers_MaxIntegerValue() {
        int[] numbers = {Integer.MAX_VALUE, Integer.MAX_VALUE - 1};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(1, result); // Only Integer.MAX_VALUE - 1 is even
    }

    @Test
    public void testCountEvenNumbers_AllNegativeNumber() {
        int[] numbers = {-2, -4, -6, -8};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(4, result); // All numbers are negative and even
    }

    @Test
    public void testCountEvenNumbers_MixedLargeSmallNumber() {
        int[] numbers = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0, -1, 1};
        int result = ConditionalLoops.countEvenNumbers(numbers);
        Assert.assertEquals(2, result); // Integer.MIN_VALUE and 0 are even
    }

    @Test
    public void testContainsPrime_SinglePrimNumber() {
        int[] numbers = {2};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // Single prime number
    }


    @Test
    public void testContainsPrime_RepeatedNonPrimeNumbers() {
        int[] numbers = {4, 4, 4};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertFalse(result); // Three non-prime numbers
    }

    @Test
    public void testContainsPrime_AlternatingNumbers() {
        int[] numbers = {4, 5, 6, 7, 8, 9, 10, 11};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // 5, 7, 11 are prime
    }

    @Test
    public void testContainsPrime_NegativeAndZero() {
        int[] numbers = {-10, -3, -2, 0, 1};
        boolean result = ConditionalLoops.containsPrime(numbers);
    }

    @Test
    public void testContainsPrime_SingleLargePrime() {
        int[] numbers = {2147483647}; // 2147483647 is a prime number
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // Single large prime number
    }

    @Test
    public void testContainsPrime_BoundaryNumbers() {
        int[] numbers = {0, 1, 2, 3};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // 2 and 3 are prime
    }

    @Test
    public void testContainsPrime_LargeArray() {
        int[] numbers = new int[1000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1; // Contains all numbers from 1 to 1000
        }
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // Should contain multiple prime numbers
    }

    @Test
    public void testContainsPrime_PrimeAtEnd() {
        int[] numbers = {4, 6, 8, 9, 10, 13};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // 13 is a prime number at the end
    }
    
    @Test
    public void testContainsPrime_MixedPositiveNegativee() {
        int[] numbers = {-3, -4, -5, 2, 3, 5};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // 2, 3, and 5 are prime
    }

    @Test
    public void testContainsPrime_EdgeCaseZeroOnee() {
        int[] numbers = {0, 1};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // 1 is considered prime based on the implementation
    }

    @Test
    public void testContainsPrime_SinglePrimeNumbeer() {
        int[] numbers = {2};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertTrue(result); // Single prime number
    }

    @Test
    public void testContainsPrime_SingleNonPrimeNumbeer() {
        int[] numbers = {4};
        boolean result = ConditionalLoops.containsPrime(numbers);
        Assert.assertFalse(result); // Single non-prime number
    }
}

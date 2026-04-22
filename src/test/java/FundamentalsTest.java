import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for Fundamentals.java — Attempt 2
 *
 * Run with Maven:  mvn test
 * All tests should pass once the coding questions are correctly solved.
 */
@DisplayName("Fundamentals – Attempt 2")

class FundamentalsTest {

    // ============================================================
    // Question 1 — countEvens
    // ============================================================

    @Test
    @DisplayName("Q1: countEvens – n less than 1 returns 0")
    void testCountEvens_belowOne() {
        assertEquals(0, Fundamentals.countEvens(0));
        assertEquals(0, Fundamentals.countEvens(-5));
    }

    @Test
    @DisplayName("Q1: countEvens – n=1 has no even numbers")
    void testCountEvens_one() {
        assertEquals(0, Fundamentals.countEvens(1));
    }

    @Test
    @DisplayName("Q1: countEvens – n=2 has one even number")
    void testCountEvens_two() {
        assertEquals(1, Fundamentals.countEvens(2));
    }

    @Test
    @DisplayName("Q1: countEvens – n=10 has five even numbers")
    void testCountEvens_ten() {
        assertEquals(5, Fundamentals.countEvens(10));
    }

    @Test
    @DisplayName("Q1: countEvens – odd upper bound (n=9)")
    void testCountEvens_oddBound() {
        assertEquals(4, Fundamentals.countEvens(9));
    }

    @Test
    @DisplayName("Q1: countEvens – n=6 has three even numbers")
    void testCountEvens_six() {
        assertEquals(3, Fundamentals.countEvens(6));
    }


    // ============================================================
    // Question 2 — findMax
    // ============================================================

    @Test
    @DisplayName("Q2: findMax – null array returns Integer.MIN_VALUE")
    void testFindMax_null() {
        assertEquals(Integer.MIN_VALUE, Fundamentals.findMax(null));
    }

    @Test
    @DisplayName("Q2: findMax – empty array returns Integer.MIN_VALUE")
    void testFindMax_empty() {
        assertEquals(Integer.MIN_VALUE, Fundamentals.findMax(new int[]{}));
    }

    @Test
    @DisplayName("Q2: findMax – single element")
    void testFindMax_singleElement() {
        assertEquals(42, Fundamentals.findMax(new int[]{42}));
    }

    @Test
    @DisplayName("Q2: findMax – max is at the start")
    void testFindMax_maxAtStart() {
        assertEquals(9, Fundamentals.findMax(new int[]{9, 3, 1, 5}));
    }

    @Test
    @DisplayName("Q2: findMax – max is at the end")
    void testFindMax_maxAtEnd() {
        assertEquals(10, Fundamentals.findMax(new int[]{2, 4, 6, 8, 10}));
    }

    @Test
    @DisplayName("Q2: findMax – max is in the middle")
    void testFindMax_maxInMiddle() {
        assertEquals(99, Fundamentals.findMax(new int[]{10, 45, 99, 32, 7}));
    }

    @Test
    @DisplayName("Q2: findMax – all negative numbers")
    void testFindMax_negatives() {
        assertEquals(-1, Fundamentals.findMax(new int[]{-5, -1, -8, -3}));
    }

    @Test
    @DisplayName("Q2: findMax – all identical values")
    void testFindMax_allSame() {
        assertEquals(5, Fundamentals.findMax(new int[]{5, 5, 5, 5}));
    }


    // ============================================================
    // Question 3 — classifyAge
    // ============================================================

    @Test
    @DisplayName("Q3: classifyAge – negative age is Invalid")
    void testClassifyAge_negative() {
        assertEquals("Invalid", Fundamentals.classifyAge(-1));
    }

    @Test
    @DisplayName("Q3: classifyAge – age above 120 is Invalid")
    void testClassifyAge_tooOld() {
        assertEquals("Invalid", Fundamentals.classifyAge(121));
    }

    @Test
    @DisplayName("Q3: classifyAge – age 0 is Child")
    void testClassifyAge_zero() {
        assertEquals("Child", Fundamentals.classifyAge(0));
    }

    @Test
    @DisplayName("Q3: classifyAge – age 12 is Child (boundary)")
    void testClassifyAge_child_upper() {
        assertEquals("Child", Fundamentals.classifyAge(12));
    }

    @Test
    @DisplayName("Q3: classifyAge – age 13 is Teen (boundary)")
    void testClassifyAge_teen_lower() {
        assertEquals("Teen", Fundamentals.classifyAge(13));
    }

    @Test
    @DisplayName("Q3: classifyAge – age 15 is Teen (mid)")
    void testClassifyAge_teen_mid() {
        assertEquals("Teen", Fundamentals.classifyAge(15));
    }

    @Test
    @DisplayName("Q3: classifyAge – age 17 is Teen (boundary)")
    void testClassifyAge_teen_upper() {
        assertEquals("Teen", Fundamentals.classifyAge(17));
    }

    @Test
    @DisplayName("Q3: classifyAge – age 18 is Adult (boundary)")
    void testClassifyAge_adult_lower() {
        assertEquals("Adult", Fundamentals.classifyAge(18));
    }

    @Test
    @DisplayName("Q3: classifyAge – age 30 is Adult (mid)")
    void testClassifyAge_adult_mid() {
        assertEquals("Adult", Fundamentals.classifyAge(30));
    }

    @Test
    @DisplayName("Q3: classifyAge – age 64 is Adult (boundary)")
    void testClassifyAge_adult_upper() {
        assertEquals("Adult", Fundamentals.classifyAge(64));
    }

    @Test
    @DisplayName("Q3: classifyAge – age 65 is Senior (boundary)")
    void testClassifyAge_senior_lower() {
        assertEquals("Senior", Fundamentals.classifyAge(65));
    }

    @Test
    @DisplayName("Q3: classifyAge – age 120 is Senior (boundary)")
    void testClassifyAge_senior_upper() {
        assertEquals("Senior", Fundamentals.classifyAge(120));
    }


    // ============================================================
    // Question 4 — countUpperCase
    // ============================================================

    @Test
    @DisplayName("Q4: countUpperCase – null returns 0")
    void testCountUpperCase_null() {
        assertEquals(0, Fundamentals.countUpperCase(null));
    }

    @Test
    @DisplayName("Q4: countUpperCase – empty string returns 0")
    void testCountUpperCase_empty() {
        assertEquals(0, Fundamentals.countUpperCase(""));
    }

    @Test
    @DisplayName("Q4: countUpperCase – all lowercase returns 0")
    void testCountUpperCase_allLower() {
        assertEquals(0, Fundamentals.countUpperCase("hello world"));
    }

    @Test
    @DisplayName("Q4: countUpperCase – all uppercase")
    void testCountUpperCase_allUpper() {
        assertEquals(5, Fundamentals.countUpperCase("HELLO"));
    }

    @Test
    @DisplayName("Q4: countUpperCase – mixed case")
    void testCountUpperCase_mixed() {
        assertEquals(6, Fundamentals.countUpperCase("HeLLo WoRLd"));
    }

    @Test
    @DisplayName("Q4: countUpperCase – digits and symbols are not counted")
    void testCountUpperCase_withSymbols() {
        assertEquals(2, Fundamentals.countUpperCase("A1B2c3!@#"));
    }

    @Test
    @DisplayName("Q4: countUpperCase – single uppercase letter")
    void testCountUpperCase_single() {
        assertEquals(1, Fundamentals.countUpperCase("A"));
    }

    @Test
    @DisplayName("Q4: countUpperCase – spaces only")
    void testCountUpperCase_spaces() {
        assertEquals(0, Fundamentals.countUpperCase("     "));
    }
}


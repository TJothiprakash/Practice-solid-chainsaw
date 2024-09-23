package dsa_assignments_kunal.sept23;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        MaximumPopulationYear solution = new MaximumPopulationYear();

        // Example 1
        int[][] logs1 = {{1993, 1999}, {2000, 2010}};
        System.out.println(solution.maximumPopulation(logs1));  // Output: 1993

        // Example 2
        int[][] logs2 = {{1950, 1961}, {1960, 1971}, {1970, 1981}};
        System.out.println(solution.maximumPopulation(logs2));  // Output: 1960
    }

    public int maximumPopulation(int[][] logs) {
        int[] populationChange = new int[2051]; // 2050 is the max year, hence we use 2051 for indexing convenience.

        // Record population changes
        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];
            populationChange[birth]++;  // Increment population at birth year
            populationChange[death]--;  // Decrement population at death year
        }

        // Find the year with the maximum population
        int maxPopulation = 0;
        int currentPopulation = 0;
        int yearWithMaxPopulation = 1950;

        for (int year = 1950; year <= 2050; year++) {
            currentPopulation += populationChange[year]; // Update current population for the year

            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                yearWithMaxPopulation = year; // Update the earliest year with the max population
            }
        }

        return yearWithMaxPopulation;
    }
}

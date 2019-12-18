package main;

import java.util.Scanner;
public class Fib {
        public int calculate(int index) {
            if (index < 0) {
                throw new IllegalArgumentException("Fibonacci numbers are defined only by non-negative indexes.");
            }
            if (index <= 1) {
                return 1;
            }

            return calculate(index - 1) + calculate(index - 2);
        }
}
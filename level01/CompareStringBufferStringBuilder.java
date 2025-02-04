package org.example;

public class CompareStringBufferStringBuilder {
    public static void main(String[] args) {

        // Measure execution time for StringBuilder
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append(" hello");
        }
        long end = System.nanoTime();
        long totalTime = end - start;
        System.out.println("Total time for StringBuilder:");
        System.out.println(totalTime + " nanoseconds");

        // Measure execution time for StringBuffer
        long start1 = System.nanoTime();
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < 1_000_000; i++) {
            sb1.append(" hello");
        }
        long end1 = System.nanoTime();
        long totalTime1 = end1 - start1;
        System.out.println("Total time for StringBuffer:");
        System.out.println(totalTime1 + " nanoseconds");  // Fixed incorrect variable reference
    }
}

package org.leiBenford;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.io.InputStream;
import java.util.Scanner;

public class LeiBenford {

    public static void main(String[] args) {
        int[] numbers = readNumbersFromClasspath("leiBenfordFiles/LeiBenfordFile.txt");
        DefaultCategoryDataset dataset = createDataset(numbers);

        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);

        System.out.println("teste");

        JFrame frame = new JFrame("Benford's Law Distribution");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(chartPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    private static int[] readNumbersFromClasspath(String filePath) {
        try {
            InputStream inputStream = LeiBenford.class.getClassLoader().getResourceAsStream(filePath);
            Scanner scanner = new Scanner(inputStream);
            int count = 0;
            while (scanner.hasNextInt()) {
                count++;
                scanner.nextInt();
            }
            int[] numbers = new int[count];

            inputStream = LeiBenford.class.getClassLoader().getResourceAsStream(filePath);
            scanner = new Scanner(inputStream);
            for (int i = 0; i < count; i++) {
                numbers[i] = scanner.nextInt();
            }

            return numbers;
        } catch (Exception e) {
            e.printStackTrace();
            return new int[0];
        }
    }


    private static DefaultCategoryDataset createDataset(int[] numbers) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int digit = 1; digit <= 9; digit++) {
            dataset.addValue(getObservedCount(numbers, digit), "Observed", String.valueOf(digit));
            dataset.addValue(getExpectedCount(digit), "Expected", String.valueOf(digit));
        }

        return dataset;
    }

    private static int getObservedCount(int[] numbers, int digit) {
        int count = 0;
        for (int number : numbers) {
            if (getFirstDigit(number) == digit) {
                count++;
            }
        }
        return count;
    }

    private static int getFirstDigit(int number) {
        while (number >= 10) {
            number /= 10;
        }
        return number;
    }

    private static double getExpectedCount(int digit) {
        return Math.log10(1 + 1.0 / digit) * 100;
    }

    private static JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(
                "Benford's Law Distribution",
                "First Digit",
                "Count",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        return chart;
    }
}




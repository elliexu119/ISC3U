/* Ellie Xu             
 * 12. 5. 2016.
 * methods: bubble, selection, max, average, min, println. 
 * Version 1.0. 
 */
package ca.hdsb.gwss.elliex.ics3u.u6;

import static ca.hdsb.gwss.elliex.ics3u.other.SOPL.sopl;

public class ArrayUtilEllie {

    public static void bubble(double number[], boolean way) {
        int a = 0, x, y, cases = 1, unnessary = 0, compareCount = 0, swappedCount = 0, i = number.length;
        String output = "";

        while (cases <= (i - 1)) {
            x = 0;
            y = 1;
            while (y < i - unnessary) {
                if (way == true) {
                    if (number[x] > number[y]) {
                        swapBubble(number, x, y);
                        swappedCount += 1;
                    }
                } else {
                    if (number[x] < number[y]) {
                        swapBubble(number, x, y);
                        swappedCount += 1;
                    }
                }
                x++;
                y++;
                compareCount++;
            }
            if (swappedCount == 0) {
                cases = i;
            }
            unnessary++;
            cases++;
        }
        while (a < i) {
            output = output + number[a] + " ";
            a++;
        }
        sopl("Number of times compared: " + compareCount + "\nNumber of times swapped: " + swappedCount * 3);
        sopl(output);
    }

    public static void bubble(int number[], int i, boolean way) {
        double number2[] = new double[i];
        int a = 0;
        while (a < i) {
            number2[a] = number[a];
            a++;
        }
        bubble(number2, way);
        a = 0;
        while (a < i) {
            number[a] = (int) number2[a];
            a++;
        }
    }

    public static void bubble(String number[], boolean way) {
        int a = 0, x, y, cases = 1, unnessary = 0, compareCount = 0, swappedCount = 0, i = number.length;
        String output = "";

        for (int n = 0; n < i; n++) {
            number[n] = number[n].toUpperCase();
        }

        while (cases <= (i - 1)) {
            x = 0;
            y = 1;
            while (y < i - unnessary) {
                if (way == true) {
                    if (number[x].compareTo(number[y]) > 0) {
                        swapBubble(number, x, y);
                        swappedCount += 1;
                    }
                } else {
                    if (number[x].compareTo(number[y]) < 0) {
                        swapBubble(number, x, y);
                        swappedCount += 1;
                    }
                }
                x++;
                y++;
                compareCount++;
            }
            if (swappedCount == 0) {
                cases = i;
            }
            unnessary++;
            cases++;
        }
        while (a < i) {
            output = output + number[a] + " ";
            a++;
        }
        sopl("Number of times compared: " + compareCount + "\nNumber of times swapped: " + swappedCount);
        sopl(output);
    }

    public static void swapBubble(double[] number, int x, int y) {
        double x2 = number[x];
        number[x] = number[y];
        number[y] = x2;
    }

    public static void swapBubble(String[] number, int x, int y) {
        String sub = number[x];
        number[x] = number[y];
        number[y] = sub;
    }

    public static void selection(double number[], boolean way) {
        int x, unnessary = 0, compareCount = 0, i = number.length, max;
        String output = "";

        for (int cases = 1; cases <= (i - 1); cases++) {
            max = 0;
            for (x = 1; x < i - unnessary; x++) {
                if (way == true) {
                    if (number[x] > number[max]) {
                        max = x;
                    }
                } else if (number[x] < number[max]) {
                    max = x;
                }
                compareCount++;
            }
            swapSelection(number, i, max, unnessary);
            unnessary++;
        }
        for (int a = 0; a < i; a++) {
            output = output + number[a] + " ";
        }
        sopl("Number of times compared: " + compareCount + "\nNumber of times swapped: " + (i - 1));
        sopl(output);
    }

    public static void selection(int number[], boolean way) {
        int a = 0, i = number.length;
        double number2[] = new double[i];
        while (a < i) {
            number2[a] = number[a];
            a++;
        }
        selection(number2, way);
        a = 0;
        while (a < i) {
            number[a] = (int) number2[a];
            a++;
        }
    }

    public static void selection(String number[], boolean way) {
        int x, unnessary = 0, cases = 1, compareCount = 0, i = number.length, max;
        String output = "";

        for (int n = 0; n < i; n++) {
            number[n] = number[n].toUpperCase();
        }

        for (; cases <= (i - 1); cases++) {
            max = 0;
            for (x = 1; x < i - unnessary; x++) {
                if (way == true) {
                    if (number[x].compareTo(number[max]) > 0) {
                        max = x;
                    }
                } else if (number[x].compareTo(number[max]) < 0) {
                    max = x;
                }
                compareCount++;
            }
            swapSelection(number, i, max, unnessary);
            unnessary++;
        }
        for (int a = 0; a < i; a++) {
            output = output + number[a] + " ";
        }
        sopl("Times compared: " + compareCount + "\nTimes swapped: " + (i - 1));
        sopl(output);
    }

    public static void swapSelection(double[] number, int i, int max, int unnessary) {
        double sub;
        sub = number[(i - unnessary) - 1];
        number[(i - unnessary) - 1] = number[max];
        number[max] = sub;
    }

    public static void swapSelection(String[] number2, int i, int max, int unnessary) {
        String sub;
        sub = number2[(i - unnessary) - 1];
        number2[(i - unnessary) - 1] = number2[max];
        number2[max] = sub;
    }

    public static String printArray(double number[]) {
        int a = 0, i = number.length;
        String output = "";

        while (a < i) {
            output = output + number[a] + " ";
            a++;
        }
        sopl(output);
        return output;
    }

    public static String printArray(int number[]) {
        int a = 0, i = number.length;
        String output = "";
        while (a < i) {
            output = output + number[a] + " ";
            a++;
        }
        sopl(output);
        return output;
    }

    public static String printArray(String number[]) {
        int a = 0, i = number.length;
        String output = "";

        while (a < i) {
            output = output + number[a] + " ";
            a++;
        }
        sopl(output);
        return output;
    }

    public static double max(double[] number) {
        int x, i = number.length;
        double max;

        x = 1;
        max = number[0];
        while (x < i) {
            if (number[x] > max) {
                max = number[x];
            }
            x++;
        }
        sopl(max);
        return max;
    }

    public static int max(int[] number) {
        int a = 0, i = number.length;
        double number2[] = new double[i];
        while (a < i) {
            number2[a] = number[a];
            a++;
        }
        return (int) max(number2);
    }

    public static double average(double number[]) {
        double total = 0;
        int a = 0, i = number.length;
        while (a < i) {
            total = number[a] + total;
            a++;
        }
        sopl(total / i);
        return total / i;
    }

    public static int average(int number[]) {
        int a = 0, i = number.length;
        double number2[] = new double[i];
        while (a < i) {
            number2[a] = number[a];
            a++;
        }
        return (int) average(number2);
    }

    public static double min(double[] number) {
        int x, i = number.length;
        double min;

        x = 1;
        min = number[0];
        while (x < i) {
            if (number[x] < min) {
                min = number[x];
            }
            x++;
        }
        sopl(min);
        return min;
    }

    public static int min(int[] number) {
        int a = 0, i = number.length;
        double number2[] = new double[i];
        while (a < i) {
            number2[a] = number[a];
            a++;
        }
        return (int) min(number2);
    }

    public static double sum(double[] number) {
        int a = 0, i = number.length;
        double sum = 0;
        for (; a < i; a++) {
            sum = number[a] + sum;
        }
        sopl(sum);
        return sum;
    }

    public static int sum(int[] number) {
        int a = 0, i = number.length;
        int sum = 0;
        for (; a < i; a++) {
            sum = number[a] + sum;
        }
        sopl(sum);
        return sum;
    }

    public static int linearSearch(double number[], double search) {
        int correct = 0;
        for (int a = 0; a < number.length; a++) {
            if (search == number[a]) {
                correct = a;
                a = number.length;
            }
        }
        sopl(search + " is at" + " [" + correct + "].");
        return correct;
    }

    public static int linearSearch(int number[], int search) {
        double number2[] = new double[number.length];
        for (int a = 0; a < number.length; a++) {
            number2[a] = number[a];
        }
        return (int) linearSearch(number2, search);
    }
}

package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Counter {

    Map<Integer, Integer> values = new HashMap<>();
    private int maxValue = Integer.MIN_VALUE;
    private int minValue = Integer.MAX_VALUE;

    public Counter(List<Integer> i1) {
        put(i1);
    }

    public Counter() {

    }

    public void put(List<Integer> l1) {
        l1.forEach(this::put);
    }

    public void put(Integer i) {
        if (values.containsKey(i)) {
            Integer k = values.get(i);
            values.put(i, k + 1);
        } else {
            values.put(i, 1);
        }

        if (i > maxValue) {
            maxValue = i;
        }

        if (i < minValue) {
            minValue = i;
        }
    }

    public int getOccur(int i) {
        return values.getOrDefault(i, 0);
    }

    public double countAvg() {
        double sum = 0;
        double occur = 0;
        for (Entry<Integer, Integer> u : values.entrySet()) {
            occur += u.getValue();
            sum += u.getKey() * u.getValue();
        }
        return sum / occur;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }


    //TODO: future use when i will know what  my name and number are
    public String getFizzBuzzNumber(int number) {
        //TODO: implement
        return null;
    }
}
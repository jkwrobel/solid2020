package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NumberTracker {

    Map<Integer, Integer> numberCounter = new HashMap<Integer, Integer>();
    private int maxValueFound = Integer.MIN_VALUE;
    private int minValueFound = Integer.MAX_VALUE;

    public NumberTracker(List<Integer> numbersToTrack) {
        trackNumbers(numbersToTrack);
    }

    public NumberTracker() {
    }

    public void trackNumbers(List<Integer> integersToCount) {
        for (Integer integerToCount : integersToCount) {
            trackSingleNumber(integerToCount);
            checkIfNumberIsNewMax(integerToCount);
            checkIfNumberIsNewMin(integerToCount);
        }
    }

    public void checkIfNumberIsNewMax(int potentialMax){
        if (potentialMax > maxValueFound) {
            maxValueFound = potentialMax;
        }
    }

    public void checkIfNumberIsNewMin(int potentialMin){
        if (potentialMin < minValueFound) {
            minValueFound = potentialMin;
        }
    }

    public void trackSingleNumber(Integer numberToTrack) {
        if (numberCounter.containsKey(numberToTrack)) {
            Integer k = numberCounter.get(numberToTrack);
            numberCounter.put(numberToTrack, k + 1);
        } else {
            numberCounter.put(numberToTrack, 1);
        }
    }

    public int getCountOfGivenNumber(int i) {
		return numberCounter.getOrDefault(i, 0);
    }

    public double getAverageOfAllNumbers() {
        double numberSum = 0;
        double numberCount = 0;
        for (Entry<Integer, Integer> numberEntry : numberCounter.entrySet()) {
            numberCount += numberEntry.getValue();
            numberSum += numberEntry.getKey() * numberEntry.getValue();
        }
        return numberSum / numberCount;
    }

    public int getMaxValueFound() {
    	return maxValueFound;
    }

    public int getMinValueFound() {
        return minValueFound;
    }
}
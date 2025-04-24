package HASHMAPS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TimeBasedKeyValueStore {

    class TimeStampedValue{
        public int timeStamp;
        public String value;


        public TimeStampedValue(int timeStamp, String value) {
            this.timeStamp = timeStamp;
            this.value = value;
        }
    }


    class TimeMap {

        Map<String, ArrayList<TimeStampedValue>> entriesByKey;

        public TimeMap() {
            entriesByKey = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            if (!entriesByKey.containsKey(key))
                entriesByKey.put(key, new ArrayList<>());

            ArrayList<TimeStampedValue> timeStampedValues = entriesByKey.get(key);
            timeStampedValues.add(new TimeStampedValue(timestamp, value));

        }


        public String get(String key, int timestamp) {
            if (!entriesByKey.containsKey(key))
                return "";

            ArrayList<TimeStampedValue> timeStampedValues = entriesByKey.get(key);
            Optional<TimeStampedValue> timeStamp = binarySearchTimeStamp(timeStampedValues, timestamp);

            if (timeStamp.isEmpty())
                return "";

            return timeStamp.get().value;
        }

        private Optional<TimeStampedValue> binarySearchTimeStamp(ArrayList<TimeStampedValue> arr, int target) {
             int left = 0;
             int right = arr.size() - 1;
             int matchIndex = -1;

             while (left <= right){
                 int mid = left + (right - left)/ 2;
                 TimeStampedValue current = arr.get(mid);
                 if (current.timeStamp <= target){
                     matchIndex = mid;
                     left = mid + 1;
                 }
                 else
                     right = mid - 1;
             }
             if (matchIndex == -1)
                 return Optional.empty();

             return Optional.of(arr.get(matchIndex));
        }
    }

}

package InterviewQ;

import java.util.*;

public class HackerRank_Coding {

    public static List<String> closestStraightCity(List<String> cityName, List<Integer> x, List<Integer> y, List<String> q) {
        List<String> result = new ArrayList<>();
        int length = x.size();

        Map<Integer, List<Integer>> xMap = new HashMap<>();
        Map<Integer, List<Integer>> yMap = new HashMap<>();

        for (int i = 0; i < length; i++) {
            xMap.computeIfAbsent(x.get(i), k -> new ArrayList<>()).add(i);
            yMap.computeIfAbsent(y.get(i), k -> new ArrayList<>()).add(i);
        }

        for (String city : q) {
            int currentCityID = cityName.indexOf(city);
            int minDistance = Integer.MAX_VALUE;
            String unknownCity = "NONE";

            List<Integer> sameXCities = xMap.get(x.get(currentCityID));
            if (sameXCities != null) {
                for (int j : sameXCities) {
                    if (j != currentCityID) {
                        int distance = Math.abs(y.get(j) - y.get(currentCityID));
                        if (distance < minDistance || (distance == minDistance && cityName.get(j).compareTo(unknownCity) < 0)) {
                            unknownCity = cityName.get(j);
                            minDistance = distance;
                        }
                    }
                }
            }

            List<Integer> sameYCities = yMap.get(y.get(currentCityID));
            if (sameYCities != null) {
                for (int j : sameYCities) {
                    if (j != currentCityID) {
                        int distance = Math.abs(x.get(j) - x.get(currentCityID));
                        if (distance < minDistance || (distance == minDistance && cityName.get(j).compareTo(unknownCity) < 0)) {
                            unknownCity = cityName.get(j);
                            minDistance = distance;
                        }
                    }
                }
            }

            result.add(unknownCity);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(closestStraightCity(
                List.of("c1", "c2", "c3"),
                List.of(3,2,1),
                List.of(3,2,3),
                List.of("c1", "c2", "c3")
        ));
        System.out.println(closestStraightCity(
                List.of("fastcity", "bigbanana", "xyz"),
                List.of(23,23,23),
                List.of(1,10,20),
                List.of("fastcity", "bigbanana", "xyz")
        ));
    }

}

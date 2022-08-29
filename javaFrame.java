import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class javaFrame {
    public static void main(String[] args) {
        List<Map<String, String>> animalList = new ArrayList<>();
        Map<String, List<String>> result = new HashMap<>();
        
        animalList.add(new HashMap<String, String>() {{
            put("name", "shark");
            put("habitat", "ocean");
        }});

        animalList.add(new HashMap<String, String>() {{
            put("name", "bear");
            put("habitat", "land");
        }});

        animalList.add(new HashMap<String, String>() {{
            put("name", "moose");
            put("habitat", "land");
        }});

        animalList.add(new HashMap<String, String>() {{
            put("name", "frog");
            put("habitat", "swamp");
        }});

        animalList.add(new HashMap<String, String>() {{
            put("name", "jelly fish");
            put("habitat", "ocean");
        }});

        animalList.add(new HashMap<String, String>() {{
            put("name", "heron");
            put("habitat", "swamp");
        }});

        animalList.add(new HashMap<String, String>() {{
            put("name", "whale");
            put("habitat", "ocean");
        }});

        for (Map<String, String> animal: animalList) {
            String habitat = animal.get("habitat");
            String name = animal.get("name");
            if (result.containsKey(habitat)) {
                result.get(habitat).add(name);
            } else {
                result.put(habitat, new ArrayList<String>() {{
                    add(name);
                }});
            }
        }

        result.forEach((k, v) -> {
            System.out.println(k + ": " + String.join(", ", v));
        });

        Map<String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Thailand", "Bangkok");
        capitalMap.put("UK", "London");
        capitalMap.put("Australia", "Canberra");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("Egypt", "Cairo");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Italy", "Rome");
        capitalMap.put("Brazil", "Brazilia");
        for (Map.Entry<String, String> entry : capitalMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
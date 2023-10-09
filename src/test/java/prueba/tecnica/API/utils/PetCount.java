package prueba.tecnica.API.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetCount {

    private List<Map<String,Object>> pets;

    public PetCount(List<Map<String, Object>> pets) {
        this.pets = pets;
    }

    public Map<String, Integer> countDuplicateNames() {
        Map<String, Integer> nameCount = new HashMap<>();
        for (Map<String, Object> pet : pets) {
            String name = (String) pet.get("name");
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }
        return nameCount;
    }
}

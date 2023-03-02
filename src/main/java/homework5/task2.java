package homework5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class task2 {
    public static void main(String[] args) {
        String[] dataNames = new String[] {"Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"};
        Map <Integer, String[]> personsNames = new HashMap<>();
        Map <String, Integer> namesAnalyze = new HashMap<>();
        Map <Integer, String[]> namesSorted = new LinkedHashMap<>();

        int i = 0;
        for (String name : dataNames) {
            String[] personData;
            personData = name.split(" ");
            personsNames.put(i, personData);
            i++;
        }

        for (Integer id : personsNames.keySet()) {
            String[] personData = personsNames.get(id);
            if (! namesAnalyze.containsKey(personData[0]) ) {
                namesAnalyze.put(personData[0], 1);
            }
            else {
                namesAnalyze.put(personData[0], namesAnalyze.get(personData[0]) + 1);
            }
        }

        for (Integer id : personsNames.keySet()) {
            System.out.printf("Данные %d до сортировки %s \n",id, Arrays.toString(personsNames.get(id)));
        }

        Map <String, Integer> temp = mySortingDescent(namesAnalyze);

        int j = 0;
        for (Entry<String, Integer> t : temp.entrySet()) {
            for (Integer id: personsNames.keySet() ) {
                if ( personsNames.get(id)[0].equals(t.getKey()) ) {
                    namesSorted.put(j, personsNames.get(id));
                    j++;
                }
            }
        }

        for (String id : temp.keySet()) {
            System.out.printf("Имя %s имеет %d повторов \n",id, (temp.get(id)));
        }

        for (Integer id : namesSorted.keySet()) {
            System.out.printf("Данные %d после сортировки %s \n",id, Arrays.toString(namesSorted.get(id)));
        }
    }

    public static Map<String, Integer> mySortingDescent(Map<String, Integer> arg) {
        Map <String, Integer> out = new LinkedHashMap<>(); //с
        ArrayList<Entry<String, Integer>> temp = new ArrayList<>(arg.entrySet());
        temp.sort(Entry.comparingByValue(Comparator.reverseOrder()));
        for (Entry<String, Integer> t : temp) {
            out.put(t.getKey(), t.getValue());
        }
        return out;
    }
}

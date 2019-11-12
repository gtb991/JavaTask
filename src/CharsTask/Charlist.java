package CharsTask;

import java.util.*;
import java.util.stream.Collectors;

public class Charlist {

    List<Character> container;

    Charlist() {
        container = new ArrayList<>();
    }

    Charlist(String inputText) {
        char[] chars = inputText.toCharArray();
        container = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            container.add(chars[i]);
        }
    }

    private Charlist(List<Character> list) {
        container = new ArrayList<>();
        container.addAll(list);
    }

    @Override
    public String toString() {
        return container.toString();
    }

    public int length() {
        return container.size();
    }

    public char charAt(int index) {
        return container.get(index);
    }

    public int indexOf(char c) {
        return container.indexOf(c);
    }

    List<Character> subString(int start, int end) {
        return container.subList(start, end);
    }

    List<Character> removeDuplicates() {
        return container.stream().distinct().collect(Collectors.toList());
    }
//    List<Character> removeDuplicates1() {
//        Set<Character> charSet = new LinkedHashSet<Character>();
//        return  charSet.add(container);
//    }



    public Charlist replaceFirst(Character c) {
        container.set(0, c);
        return new Charlist(container);
    }

    public boolean isEmpty() {
        return container.isEmpty();
    }

    public boolean contains(Character character) {
        return container.contains(character);
    }

    public Charlist sortedList() {
        List<Character> value = new ArrayList<>(container);
        Collections.sort(value);
        return new Charlist(value);
    }

    public Charlist mixedList() {
        List<Character> value = new ArrayList<>(container);
        Collections.shuffle(value);
        return new Charlist(value);
    }

    public Charlist reversList() {
        List<Character> value = new ArrayList<>(container);
        Collections.reverse(value);
        return new Charlist(value);
    }

    public Charlist clearList() {
        container.clear();
        return new Charlist(container);
    }

    public Charlist removeAll(Character... c) {
        container.removeAll(Arrays.asList(c));
        return new Charlist(container);

    }

    public Charlist removeFirst(Character c) {
        container.remove(c);
        return new Charlist(container);
    }


}

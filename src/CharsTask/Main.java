package CharsTask;

import CharsTask.Charlist;

public class Main {

    public static void main(String[] args) {
        //List<Character> charList = Arrays.asList('a', 'c','b','1','2','3','1','2','3');
        Charlist myCharList = new Charlist("acb123123");
        System.out.println("To string: " + myCharList);
        System.out.println("Length: " + myCharList.length());
        System.out.println("Char at: " + myCharList.charAt(1));
        System.out.println("Index of: " + myCharList.indexOf('c'));
        System.out.println("Sub string: " + myCharList.subString(1, 3));
        System.out.println("Remove Duplicates: " + myCharList.removeDuplicates());
        System.out.println("Is Empty: " + myCharList.isEmpty());
        System.out.println("Contains a: " + myCharList.contains('a'));
        System.out.println("Contains q: " + myCharList.contains('q'));
        System.out.println("MixedList: " + myCharList.mixedList());
        System.out.println("To string: " + myCharList);
        System.out.println("Reverse list: " + myCharList.reversList());
        System.out.println("Sorted list: " + myCharList.sortedList());
        System.out.println("Replace first: " + myCharList.replaceFirst('1'));
        System.out.println("Remove first: " + myCharList.removeFirst('1'));
        System.out.println("Remove all: " + myCharList.removeAll('1', 'a'));
    }
}


import java.util.*;

public class Character {
    String name;
    String race;
    double height;
    int age;
    boolean hasMagic;

    public Character(String name, String race, double height, int age, boolean hasMagic)
    {
        this.name = name;
        this.race = race;
        this.height = height;
        this.age = age;
        this.hasMagic = hasMagic;
    }

    public String toString(){
        return name + ", " + race + ", " + age;
    }

    public static void main(String[] args) {
        // Test "data": define a list of characters to play with
        List<Character> characters = new ArrayList<>();
        characters.add(new Character("Gandalf the grey", "Wizard", 1.88, 137, true));
        characters.add(new Character("Aragorn", "Half-elf", 1.80, 120, false));
        characters.add(new Character("Gimli", "Dwarf", 1.60, 103, false));
        characters.add(new Character("Legolas", "Elf", 1.93, 171, false));
        characters.add(new Character("Frodo", "Halfling", 1.47, 42, false));

        System.out.println(characters);
    }
}

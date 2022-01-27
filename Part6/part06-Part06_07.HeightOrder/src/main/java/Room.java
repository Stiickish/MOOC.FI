
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yelon
 */
public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }
    //Method that adds a person to persons arrayList
    public void add(Person person) {
        this.persons.add(person);
    }
    //Method that checks wether or not the room is empty
    public boolean isEmpty() {
        if (persons.isEmpty()) {
            return true;
        }
        return false;
    }
    //Method that returns the list of persons
    public ArrayList<Person> getPersons() {

        return this.persons;
    }
    //Method that returns the shortest person on the list
    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }
        Person shortestPerson = this.persons.get(0);

        for (Person p : persons) {

            if (p.getHeight() < shortestPerson.getHeight()) {

                shortestPerson = p;
            }

        }

        return shortestPerson;
    }
    //Method that takes the shortest person out of the list
    public Person take() {
        if (persons.isEmpty()) {
            return null;
        }
        Person shortestPerson = shortest();

        this.persons.remove(shortestPerson);

        return shortestPerson;
    }
}

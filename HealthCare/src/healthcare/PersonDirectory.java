/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moukthikamanapati
 */
public class PersonDirectory implements Serializable {
     private List<Person> PersonList;

    public PersonDirectory() {
        PersonList = new ArrayList<Person>();
    }
    
    public List<Person> getPersonlist() {
        return PersonList;
    }

    public Person addPerson() {
        Person newPerson = new Person();
        PersonList.add(newPerson);
        return newPerson;
    }

    public void removePerson(Person s) {
        PersonList.remove(s);
    }

//    public Person searchSupplier(String supplierName) {
//        for (Person person : PersonList) {
//            if (person.getPersonlist().equals(supplierName)) {
//                return Person;
//            }
//        }
//        return null;
//    }
}

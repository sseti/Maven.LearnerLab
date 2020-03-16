package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People <TypeOfPerson extends Person> {

    protected ArrayList<TypeOfPerson> personList;

    public People() {
        personList = new ArrayList<>();
    }

    public void add(TypeOfPerson person) {
        personList.add(person);
    }

    public TypeOfPerson findById(long id) {
        for (TypeOfPerson person: personList) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void removeByPerson(TypeOfPerson person) {
        personList.remove(person);
    }

    public  void removeById(long id) {
        personList.remove(findById(id));
    }

    public Integer getCount() {
        return personList.size();
    }

    public TypeOfPerson[] toArray(){
        return (TypeOfPerson[]) personList.toArray();
    }

    public void removeAll() {
        personList.clear();
    }
}


package com.example.person.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.person.model.Person;

public class PersonViewModel extends ViewModel {

    private MutableLiveData<Person> mutableLiveData;
    private Person person;

    public PersonViewModel()
    {
        this.mutableLiveData = new MutableLiveData<>();
        this.person = new Person("Iga", "Tennis player");
    }

    public void changePerson(String name, String job)
    {
        this.person.setName(name);
        this.person.setJob(job);
        this.setUpPerson();
    }

    public void setUpPerson()
    {
        this.mutableLiveData.setValue(this.person);
    }

    public MutableLiveData<Person> getObservedPerson()
    {
        return mutableLiveData;
    }
}

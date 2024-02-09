package com.dockerpostgres.dockerpostgres.service;

import com.dockerpostgres.dockerpostgres.entity.People;
import com.dockerpostgres.dockerpostgres.repository.PeopleRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeopleService {

    @Autowired
    PeopleRepository peopleRepository;
    public void saveEntry(People people){
        peopleRepository.save(people);
        System.out.println("Entry made");
    }

    public List<People> getEntries(){
       // System.out.println("Found:"+peopleRepository.findAll().size()+" entries");
        List<People> ppl = new ArrayList<>();
        for(People person:peopleRepository.findAll()){
            ppl.add(person);
        }
        return ppl;
    }
}

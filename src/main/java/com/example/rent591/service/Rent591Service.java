package com.example.rent591.service;

import com.example.rent591.entity.Rent591;
import com.example.rent591.repository.Rent591Repository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * User: ChiYuan
 * Date: 2021/03/25 上午 10:24
 * To change this template use File | Settings | File Templates.
 */

@Slf4j
@Service
public class Rent591Service {
    @Autowired
    private Rent591Repository rent591Repository;

    public Rent591Service() {
    }

    public List<Rent591> getTasks() {
        return rent591Repository.findAll();
    }

    public Rent591 getTask(String taskId) {
        Optional<Rent591> task = rent591Repository.findById(taskId);
        return task.get();
    }

    public List<Rent591> getRent591Not(String publisherStatus) {
        return rent591Repository.findByPublisherStatusNot(publisherStatus);
    }

    public List<Rent591> getRent591(String telephone) {
        return rent591Repository.findByTelephone(telephone);
    }

    public List<Rent591> findAllByGenderOrGenderAndArea(String gender, String gender1, String area) {
        return rent591Repository.findByGenderOrGenderAndArea(gender, gender1, area);
    }

    public List<Rent591> findAllByAreaAndPublisherStartingWith(String area, String publisher) {
        return rent591Repository.findByAreaAndPublisherStartingWith(area, publisher);
    }
}
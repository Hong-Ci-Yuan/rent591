package com.example.rent591.controller;

import com.example.rent591.entity.Rent591;
import com.example.rent591.links.Rent591Links;
import com.example.rent591.service.Rent591Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ChiYuan
 * Date: 2021/03/24 下午 12:42
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@RepositoryRestController
@RequestMapping("/rent591/")
@RequiredArgsConstructor
public class Rent591Controller {
    @Autowired
    private Rent591Service rent591Service;

    @GetMapping(path = Rent591Links.TASKS)
    public ResponseEntity<?> getTask() {
        List<Rent591> rent591List = rent591Service.getTasks();
        return ResponseEntity.ok(rent591List);
    }

//    @GetMapping(path = Rent591Links.TASK)
//    public ResponseEntity<?> getTask(@PathVariable("id") String taskId) {
//        try {
//            Rent591 task = rent591Service.getTask(taskId);
//            return ResponseEntity.ok(task);
//        } catch (RuntimeException exc) {
//            throw new ResponseStatusException(
//                    HttpStatus.NOT_FOUND, "Resource Not Found", exc);
//        }
//    }

    @GetMapping(path = Rent591Links.TASKPHONE)
    public ResponseEntity<?> getTaskPhone(@PathVariable("telephone") String telephone) {
        try {
            List<Rent591> task = rent591Service.getRent591(telephone);
            return ResponseEntity.ok(task);
        } catch (RuntimeException exc) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Resource Not Found", exc);
        }
    }

    @GetMapping(path = Rent591Links.TASKNOT)
    public ResponseEntity<?> getTaskPublisherStatus(@PathVariable("publisherStatus") String publisherStatus) {
        try {
            List<Rent591> task = rent591Service.getRent591Not(publisherStatus);
            return ResponseEntity.ok(task);
        } catch (RuntimeException exc) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Resource Not Found", exc);
        }
    }

    @GetMapping(path = Rent591Links.TASKAND)
    public ResponseEntity<?> getRentByGenderOrGenderAndArea(@PathVariable("gender") String gender, @PathVariable("gender1") String gender1, @PathVariable("area") String area) {
        try {
            List<Rent591> task = rent591Service.findAllByGenderOrGenderAndArea(gender, gender1, area);
            return ResponseEntity.ok(task);
        } catch (RuntimeException exc) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Resource Not Found", exc);
        }
    }

    @GetMapping(path = Rent591Links.TASKANDREGEX)
    public ResponseEntity<?> getRentByByAreaAndPublisherStartingWith(@PathVariable("area") String area, @PathVariable("publisher") String publisher, @PathVariable("publisher1") String publisher1) {
        try {
            List<Rent591> task = rent591Service.findAllByAreaAndPublisherStartingWith(area, publisher);
            for (int i = 0; i < task.size() - 1; i++) {
                if (task.get(i).publisher.contains(publisher1)) {
                    task.remove(i);
                }
            }
            return ResponseEntity.ok(task);
        } catch (RuntimeException exc) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Resource Not Found", exc);
        }
    }

}
package com.example.rent591.repository;

import com.example.rent591.entity.Rent591;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: ChiYuan
 * Date: 2021/03/24 下午 12:34
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface Rent591Repository extends MongoRepository<Rent591, String> {
    List<Rent591> findByTelephone(String telephone);

    List<Rent591> findByPublisherStatusNot(String publisherStatus);

    List<Rent591> findByGenderOrGenderAndArea(String gender, String gender1, String area);

    List<Rent591> findByAreaAndPublisherStartingWith(String area, String publisher);
}
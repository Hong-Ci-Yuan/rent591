package com.example.rent591.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: ChiYuan
 * Date: 2021/03/24 下午 12:11
 * To change this template use File | Settings | File Templates.
 */
@Document(collection = "rent591")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rent591 {
    @Id
    public String _id;
    public String publisher;
    public String publisherStatus;
    public String telephone;
    public String type;
    public String situation;
    public String gender;
    public String area;
}
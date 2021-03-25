package com.example.rent591.links;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: ChiYuan
 * Date: 2021/03/25 上午 10:43
 * To change this template use File | Settings | File Templates.
 */
@Component
public class Rent591Links {
    public static final String TASKS = "/rent591";
    //    public static final String TASK = "/rent591/{id}";
    public static final String TASKPHONE = "/rent591/{telephone}/";
    public static final String TASKNOT = "/rent591/!{publisherStatus}/";
    public static final String TASKAND = "/rent591/{gender}/{gender1}/{area}/";
    public static final String TASKANDREGEX = "/rent591/{area}/{publisher}/!{publisher1}";
//    public static final String CREATE_TASK = "/task";
//    public static final String UPDATE_TASK = "/task";
//    public static final String DELETE_TASK = "/task/{id}";
}
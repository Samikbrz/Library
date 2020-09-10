package com.spring.applibrary.api;

import com.spring.applibrary.service.abstracts.PublishingHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
public class PublishingHouseController {

    private final PublishingHouseService publishingHouseService;

    @Autowired
    public PublishingHouseController(PublishingHouseService publishingHouseService) {
        this.publishingHouseService = publishingHouseService;
    }

    @RequestMapping("/publishinghouse")
    public ModelAndView getAll(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("publishinghouselist");
        modelAndView.addObject("publishinghouse",publishingHouseService.getAll());
        return modelAndView;
    }

}

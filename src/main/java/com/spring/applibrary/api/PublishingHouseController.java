package com.spring.applibrary.api;

import com.spring.applibrary.model.Author;
import com.spring.applibrary.model.PublishingHouse;
import com.spring.applibrary.service.abstracts.PublishingHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
public class PublishingHouseController {

    private final PublishingHouseService publishingHouseService;
    private final ModelAndView modelAndView=new ModelAndView();

    @Autowired
    public PublishingHouseController(PublishingHouseService publishingHouseService) {
        this.publishingHouseService = publishingHouseService;
    }

    @RequestMapping("/publishinghouse")
    public ModelAndView getAll(){
        modelAndView.setViewName("publishinghouselist");
        modelAndView.addObject("publishinghouse",publishingHouseService.getAll());
        return modelAndView;
    }

    @RequestMapping("/addnewpublishinghouse")
    public ModelAndView newAuthorIndex() {
        modelAndView.setViewName("addnewpublishinghouse");
        return modelAndView;
    }

    @PostMapping("/savenewpublishinghouse")
    public String savePublishingHouse(PublishingHouse publishingHouse) {
        publishingHouseService.save(publishingHouse);
        return "redirect:/api/publishinghouse";
    }
}

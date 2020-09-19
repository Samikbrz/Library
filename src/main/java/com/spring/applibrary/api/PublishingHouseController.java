package com.spring.applibrary.api;

import com.spring.applibrary.model.Author;
import com.spring.applibrary.model.PublishingHouse;
import com.spring.applibrary.service.abstracts.AuthorService;
import com.spring.applibrary.service.abstracts.PublishingHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api")
public class PublishingHouseController {

    private final PublishingHouseService publishingHouseService;

    private final ModelAndView modelAndView=new ModelAndView();

    @Autowired
    public PublishingHouseController(PublishingHouseService publishingHouseService) {
        this.publishingHouseService = publishingHouseService;
    }

    @RequestMapping(value = "/publishinghouse",method = RequestMethod.GET)
    public ModelAndView getAll(){
        modelAndView.setViewName("publishinghouselist");
        modelAndView.addObject("publishinghouse",publishingHouseService.getAll());
        return modelAndView;
    }

    @RequestMapping("/findbypublishinghouseid")
    @ResponseBody
    public Optional<PublishingHouse> findById(int id)
    {
        Optional<PublishingHouse> result = publishingHouseService.findById(id);
        return result;
    }

    @RequestMapping("/addnewpublishinghouse")
    public ModelAndView newAuthorIndex() {
        modelAndView.setViewName("addnewpublishinghouse");
        return modelAndView;
    }

    @PostMapping("/savenewpublishinghouse")
    public String savePublishingHouse(PublishingHouse publishingHouse) {
        boolean isexist=false;
        List<PublishingHouse> publishingHouses=publishingHouseService.getAll();
        for (int i=0;i<publishingHouses.size();i++){
            if (publishingHouses.get(i).getPublishingHouseName().contains(publishingHouse.getPublishingHouseName())){
                isexist=true;
            }
        }
        if (isexist==false){
            publishingHouseService.save(publishingHouse);
        }
        return "redirect:/api/publishinghouse";
    }

    @RequestMapping(value = "/deletepublishinghouse",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String deletePublishingHouse(int id){
        publishingHouseService.deleteById(id);
        return "redirect:/api/publishinghouse";
    }

    @RequestMapping(value = "/updatepublishinghouse",method = {RequestMethod.PUT,RequestMethod.GET})
    public String updatePublishingHouse(PublishingHouse publishingHouse){
        publishingHouseService.update(publishingHouse);
        return "redirect:/api/publishinghouse";
    }
}

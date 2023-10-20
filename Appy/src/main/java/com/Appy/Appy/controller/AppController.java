package com.Appy.Appy.controller;
import com.Appy.Appy.model.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Appy.Appy.services.AppService;
import java.util.List;

@RestController
@RequestMapping("/app")
@CrossOrigin
public class AppController {
    
    @Autowired
    private AppService appService;

    @PostMapping("/add")
    public String add(@RequestBody App app){
        appService.saveApp(app);
        return "New application was added.";
    }

    @GetMapping("/getAll")
    public List<App> list(){
        return appService.getAllApps();
    }
}

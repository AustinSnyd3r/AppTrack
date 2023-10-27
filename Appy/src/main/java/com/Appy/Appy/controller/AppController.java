package com.Appy.Appy.controller;
import com.Appy.Appy.model.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    //Deletes an application from the database by the id.... hopefully.
    @DeleteMapping("/remove/{id}")
    public void deleteApp(@PathVariable("id") int id){
        try{
          appService.deleteAppById(id);  
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    //Delete an application from the database by Status ex. Rejected, Applied, Offer. maybe only by rejected. 
    @PutMapping("/updateStatus/{id}/{status}")
    public String updateStatus(@PathVariable("id") int id, @PathVariable("status") String status){
        appService.updateStatus(id, status);
        return "Status has been changed to " + status;
    }

    //For testing purposes. 
    @DeleteMapping("/removeAll")
    public void deleteAll(){
        appService.deleteAll();
        //le troll
        System.out.println("LOST ALL DATA ALERT ALERT ALERT. (THERES NOTHING YOU CAN DO!)");
    }
    

}

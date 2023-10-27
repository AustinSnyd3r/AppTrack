package com.Appy.Appy.services;
import com.Appy.Appy.model.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.Appy.Appy.repository.AppRepository;

@Service
public class AppServiceImp implements AppService {
    
    @Autowired
    private AppRepository appRepository;

    @Override
    public App saveApp(App app){
        return appRepository.save(app);
    }

    @Override
    public List<App> getAllApps(){
        return appRepository.findAll();
    }


    @Override
    public void deleteAppById(int id){
        appRepository.deleteById(id);
    }

    @Override
    public String updateStatus(int id, String newStatus){
       App app = appRepository.findById(id).orElse(null);
       
       //could add in a check if it is one of my status pre-sets. rejected, offer, applied
       if(app != null){
         app.setStatus(newStatus);
         appRepository.save(app);
       }
       return "happy fucking vscode? ";
        
    }

    @Override
    public void deleteAll(){
        appRepository.deleteAll();
    }
}

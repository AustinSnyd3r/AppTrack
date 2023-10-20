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
}

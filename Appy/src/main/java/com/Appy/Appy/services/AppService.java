package com.Appy.Appy.services;
import com.Appy.Appy.model.App;
import java.util.List;

public interface AppService {

    //abstract class
    public App saveApp(App app);
    public List<App> getAllApps();

    
    public void deleteAppById(int id);
    public String updateStatus(int id, String newStatus);
    public void deleteAll();
}

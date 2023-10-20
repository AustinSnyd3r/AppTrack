package com.Appy.Appy.repository;
import com.Appy.Appy.model.App;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AppRepository extends JpaRepository<App, Integer> {
    
}

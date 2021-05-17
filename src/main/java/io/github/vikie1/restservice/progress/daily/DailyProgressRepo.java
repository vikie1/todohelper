package io.github.vikie1.restservice.progress.daily;

import org.springframework.data.repository.CrudRepository;

public interface DailyProgressRepo extends CrudRepository<DailyProgress, String>{
    
}

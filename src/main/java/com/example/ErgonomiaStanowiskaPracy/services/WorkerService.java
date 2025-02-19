package com.example.ErgonomiaStanowiskaPracy.services;

import com.example.ErgonomiaStanowiskaPracy.model.WorkerDB;
import com.example.ErgonomiaStanowiskaPracy.repository.WorkerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {

    public WorkerService(WorkerRepository workerRepository){
        this.workerRepository = workerRepository;
    }
    WorkerRepository workerRepository;

    public void save (WorkerDB workerDB) {workerRepository.save(workerDB);}

    public List<WorkerDB> findByName(String name){
        return (List<WorkerDB>) workerRepository.findByName(name);
    }
}

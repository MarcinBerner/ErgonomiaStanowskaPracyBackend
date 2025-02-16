package com.example.ErgonomiaStanowiskaPracy.translator;

import com.example.ErgonomiaStanowiskaPracy.model.WorkerDB;
import com.example.ErgonomiaStanowiskaPracy.model.WorkerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public abstract class TranslatorWorkerDTOtoWorkerDB {
    public WorkerDB ToWorkerDTO(WorkerDTO workerDTO){
        WorkerDB workerDB = toWorkerDB(workerDTO);
        return workerDB;
    }

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "surname", target = "surname"),
            @Mapping(source = "questions", target = "questions")
    })
    protected abstract WorkerDB toWorkerDB(WorkerDTO workerDTO);



}

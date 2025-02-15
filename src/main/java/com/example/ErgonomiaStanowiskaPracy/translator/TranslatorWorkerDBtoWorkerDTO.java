package com.example.ErgonomiaStanowiskaPracy.translator;
import com.example.ErgonomiaStanowiskaPracy.model.*;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public abstract class TranslatorWorkerDBtoWorkerDTO {
    public WorkerDTO ToWorkerDTO(WorkerDB workerDB){
        WorkerDTO workerDTO = toWorkerDTO(workerDB);
        return workerDTO;
    }

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "surname", target = "surname"),
            @Mapping(source = "questions", target = "questions")
    })
    protected abstract WorkerDTO toWorkerDTO(WorkerDB workerDB);


}

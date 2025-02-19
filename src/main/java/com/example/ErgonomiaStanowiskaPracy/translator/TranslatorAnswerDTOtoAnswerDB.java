package com.example.ErgonomiaStanowiskaPracy.translator;

import com.example.ErgonomiaStanowiskaPracy.model.AnswerDB;
import com.example.ErgonomiaStanowiskaPracy.model.AnswerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public abstract class TranslatorAnswerDTOtoAnswerDB {
    public AnswerDB ToAnswerDTO (AnswerDTO answerDTO){
        AnswerDB answerDB = toAnswerDB(answerDTO);
        return answerDB;
    }

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "question", target = "question"),
            @Mapping(source = "answerIndex", target = "answerIndex"),
            @Mapping(source = "answerText", target = "answerText"),
            @Mapping(source = "score", target = "score")
    })
    public abstract AnswerDB toAnswerDB(AnswerDTO answerDTO);
}

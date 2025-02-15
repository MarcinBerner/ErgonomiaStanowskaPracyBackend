package com.example.ErgonomiaStanowiskaPracy.translator;

import com.example.ErgonomiaStanowiskaPracy.model.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
@Mapper
public abstract class TranslatorAnswerDBtoAnswerDTO {
    public AnswerDTO ToAnswerDTO (AnswerDB answerDB){
        AnswerDTO answerDTO = toAnswerDTO(answerDB);
        return answerDTO;
    }

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "question", target = "question"),
            @Mapping(source = "answerIndex", target = "answerIndex"),
            @Mapping(source = "answerText", target = "answerText"),
            @Mapping(source = "score", target = "score")
    })
    protected abstract AnswerDTO toAnswerDTO(AnswerDB answerDB);
}

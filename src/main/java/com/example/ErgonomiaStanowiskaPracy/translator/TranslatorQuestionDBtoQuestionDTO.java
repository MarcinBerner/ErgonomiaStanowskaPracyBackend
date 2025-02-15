package com.example.ErgonomiaStanowiskaPracy.translator;

import com.example.ErgonomiaStanowiskaPracy.model.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public abstract class TranslatorQuestionDBtoQuestionDTO {

    public QuestionDTO ToQuestionsDTO(QuestionDB questionDB){
        QuestionDTO questionDTO = toQuestionDTO(questionDB);
        return questionDTO;
    }

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "number", target = "number"),
            @Mapping(source = "score", target = "score"),
            @Mapping(source = "answers", target = "answers")
    })
    protected abstract QuestionDTO toQuestionDTO(QuestionDB questionDB);




}

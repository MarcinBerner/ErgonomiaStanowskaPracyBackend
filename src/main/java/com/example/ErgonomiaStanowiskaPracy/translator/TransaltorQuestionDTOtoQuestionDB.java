package com.example.ErgonomiaStanowiskaPracy.translator;

import com.example.ErgonomiaStanowiskaPracy.model.QuestionDB;
import com.example.ErgonomiaStanowiskaPracy.model.QuestionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public abstract class TransaltorQuestionDTOtoQuestionDB {
    public QuestionDB ToQuestionsDB(QuestionDTO questionDTO){
        QuestionDB questionDB = toQuestionDB(questionDTO);
        return questionDB;
    }
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "number", target = "number"),
            @Mapping(source = "score", target = "score"),
            @Mapping(source = "answers", target = "answers")
    })
    protected abstract QuestionDB toQuestionDB(QuestionDTO questionDTO);
}

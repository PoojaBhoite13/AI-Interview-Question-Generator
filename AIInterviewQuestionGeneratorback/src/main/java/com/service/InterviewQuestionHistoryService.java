package com.service;

import com.dto.InterviewQuestionDTO;
import com.entity.InterviewQuestionHistory;
import com.repository.InterviewQuestionHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewQuestionHistoryService {
    @Autowired
    InterviewQuestionHistoryRepository iresp;
    @Autowired
    GeminiService geminiService;

    public String addinterviewquestion(InterviewQuestionDTO dto)
    {
        InterviewQuestionHistory interviewquehistory = new InterviewQuestionHistory();
        interviewquehistory.setTechnology(dto.getTechnology());
        interviewquehistory.setExperiencelevel(dto.getExperiencelevel());
        interviewquehistory.setQuestioncount(dto.getQuestioncount());
       String result = geminiService.generateQuestion(dto.getTechnology(),dto.getExperiencelevel(),dto.getQuestioncount());
        interviewquehistory.setQuestions(result);
        iresp.save(interviewquehistory);
        return result;

    }

    public List<InterviewQuestionHistory>findallinterviewquestions()
    {
        return iresp.findAll();
    }

    public String deleteinterquestionhistory(int id)
    {
        if (iresp.existsById(id))
        {
            iresp.deleteById(id);
            return "Interview Question History deleted";
        }
        else {
            return "Given Interview Question History id does not exists";
        }
    }
}

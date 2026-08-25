package com.controller;

import com.dto.InterviewQuestionDTO;
import com.entity.InterviewQuestionHistory;
import com.service.GeminiService;
import com.service.InterviewQuestionHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class InterviewQuestionHistoryController {
    @Autowired
    InterviewQuestionHistoryService service;

    @PostMapping("/addinterquehistory")
    public String addinterquehistory(@RequestBody InterviewQuestionDTO dto)
    {
        return service.addinterviewquestion(dto);
    }

    @GetMapping("/findallinterquestions")
    public List<InterviewQuestionHistory> findallinterquestions()
    {
        return service.findallinterviewquestions();
    }

    @DeleteMapping("/deleteinterquehistory")
    public String deleteinterquehistory(@RequestParam int id)
    {
        return service.deleteinterquestionhistory(id);
    }

    @Autowired
    private GeminiService geminiService;

//
    @PostMapping("/generatequestion")
    public String generate(@RequestBody InterviewQuestionDTO dto)
    {
         return geminiService.generateQuestion( dto.getTechnology(),dto.getExperiencelevel(),dto.getQuestioncount());
    }
}

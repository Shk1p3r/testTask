package com.example.testTask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.testTask.service.VacationService;

@Controller
public class VacationController {
    @Autowired
    private VacationService vacationService;
    @GetMapping("/calculacte")
    public ResponseEntity<?> getSumVacation(@RequestParam double salary12Months, @RequestParam int days )
    {
        return new ResponseEntity<>(vacationService.getSumVacation(salary12Months, days), HttpStatus.OK);

    }
}
package com.example.testTask.service;

import org.springframework.stereotype.Service;

@Service
public class VacationService {
    public double getSumVacation(double salary12Months, int days) {
        return salary12Months / 29.3 * days;
    }
}

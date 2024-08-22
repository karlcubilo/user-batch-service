package com.user.batch.employee.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@Slf4j
public class EmployeeService {

    final Job maintainEmployeesJob;
    final JobLauncher jobLauncher;
    public void maintainEmployees() {
        try {
            JobParameters jobParameters = new JobParametersBuilder()
                    .addLong("timestamp",System.currentTimeMillis())
                    .toJobParameters();
            jobLauncher.run(maintainEmployeesJob,jobParameters);
        } catch(Exception e) {
            log.error("Failed to run maintain employee batch job", e);
        }

    }
}

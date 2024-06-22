package com.labours.labour_Connect.repository;

import com.labours.labour_Connect.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
//import com.labours.labourconnect.model.Job;
public interface JobRepository extends JpaRepository<Job,Long> {
}

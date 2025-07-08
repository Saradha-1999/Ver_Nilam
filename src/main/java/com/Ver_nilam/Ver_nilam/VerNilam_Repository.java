package com.Ver_nilam.Ver_nilam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerNilam_Repository extends JpaRepository<VerNilam_Model, Integer> {
    // You can define custom queries here if needed
}

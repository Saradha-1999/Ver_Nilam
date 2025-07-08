package com.Ver_nilam.Ver_nilam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VerNilam_Service {

    @Autowired
    private VerNilam_Repository verNilamRepository;

    // Save a contact (called from controller)
    public void saveContact(VerNilam_Model model) {
        verNilamRepository.save(model);
    }

    // Retrieve all contact entries
    public List<VerNilam_Model> getAllContacts() {
        return verNilamRepository.findAll();
    }
}

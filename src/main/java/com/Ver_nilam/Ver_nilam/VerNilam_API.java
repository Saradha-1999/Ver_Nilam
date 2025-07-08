package com.Ver_nilam.Ver_nilam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class VerNilam_API {

    @Autowired
    private VerNilam_Service verNilamService;

    @GetMapping("/contacts")
    public List<VerNilam_Model> getAllContacts() {
        return verNilamService.getAllContacts();
    }
}

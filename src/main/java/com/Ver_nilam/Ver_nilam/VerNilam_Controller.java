package com.Ver_nilam.Ver_nilam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class VerNilam_Controller {

    @Autowired
    private VerNilam_Service verNilamService;

//    @GetMapping("/")
//    public String homeRedirect() {
//        return "redirect:/contact.html";
//    }

    @PostMapping("/submitContact")
    public String submitContactForm(@ModelAttribute VerNilam_Model verNilamModel) {
        verNilamService.saveContact(verNilamModel);
        return "redirect:/contact_success.html";
    }

    @GetMapping("/admin")
    public String showAdminPage() {
        return "adminpage.html";
    }

    
}

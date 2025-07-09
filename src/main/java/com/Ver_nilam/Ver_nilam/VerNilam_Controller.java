package com.Ver_nilam.Ver_nilam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class VerNilam_Controller {

    @Autowired
    private VerNilam_Service verNilamService;

    // Redirect root URL to contact.html
    @GetMapping("/")
    public String homeRedirect() {
        return "redirect:/contact.html";
    }

    // Process contact form submission
    @PostMapping("/submitContact")
    public String submitContactForm(@ModelAttribute VerNilam_Model verNilamModel) {
        verNilamService.saveContact(verNilamModel);
        return "redirect:/contact_success.html";
    }

    // Admin dashboard
    @GetMapping("/admin")
    public String showAdminPage() {
        return "redirect:/adminpage.html";
    }
}

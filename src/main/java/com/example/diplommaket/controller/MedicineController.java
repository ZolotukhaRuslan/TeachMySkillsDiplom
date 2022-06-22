package com.example.diplommaket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MedicineController {

@RequestMapping("/medicine")
    public String medicine(){
    return "medicine";
}
}

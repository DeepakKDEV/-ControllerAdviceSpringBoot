//package com.example.demoSprinboot;
//
//import com.example.demoSprinboot.Model.Admin;
//import com.example.demoSprinboot.Model.User;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@ResponseBody
//public class HomeController {
//
//    @RequestMapping("/")
//    public String  home(){
//        return "home  controller";
//    }
//
//    @RequestMapping("/user")
//    public User user() {
//        User user = new User();
//        user.setId("1");
//        user.setName("Sande");
//        user.setEmailId("sandeep@gmail.com");
//        return user;
//    }
//
//    @GetMapping("/Admin")
//    public Admin  admin(){
//        Admin admin=new Admin();
//            admin.setId(1);
//            admin.setName("Admin");
//            return  admin;
//    }
//
//    @GetMapping("/Admin/{id}")
//    public  String   Adminn(@PathVariable   int id){
//        return  "Admin path Variable " + id;
//    }
//
//    @GetMapping("/requestParam")
//    public String requestParam(@RequestParam String name) {
//        return "request param: " + name;
//    }
//
//
//}
//

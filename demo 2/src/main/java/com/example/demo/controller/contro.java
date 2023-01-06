package com.example.demo.controller;
import java.util.*;
import com.example.demo.entity.entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.demo.service.service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class contro {
    @Autowired
    private service Service;
    @PostMapping("/addProduct")
    public entity addprod(@RequestBody entity e){
        return Service.saverepo(e);
    }
    @GetMapping("/products")
  public List<entity> findall(){
        return Service.findprod();
  }
  @GetMapping("/product/{id}")
public entity byid(int id){
        return Service.getprodbyid(id);
}
    @GetMapping("/products/{name}")
    public entity byname(String s){
        return Service.getprodbyname(s);
}
@DeleteMapping("/delete/{id}")
public String del(int id){
        return Service.del(id);

}
}

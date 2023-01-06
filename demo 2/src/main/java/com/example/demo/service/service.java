package com.example.demo.service;
import java.util.*;
import com.example.demo.entity.entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repo.repository;
@Service
public class service {
    @Autowired
    private repository repo;
public entity saverepo(entity rep) {
   return  repo.save(rep);

}
public List<entity> findprod(){
    return repo.findAll();
}
public entity getprodbyid(int id){
    return repo.findById(id).orElse(null);
}
    public entity getprodbyname(String name){

    return repo.findByName(name);
    }
    public String del(int id){
    repo.deleteById(id);
    return "fuck u";
    }
//    public service update(entity s){
//    entity prod=repo.findById(s.getId()).orElse(s);
//    prod
//    }

}

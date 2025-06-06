package com.test.api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.test.api.response.CheckList;
import com.test.api.service.CheckService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping; 
// import org.springframework.web.servlet.ModelAndView; // Usado para manipular o RestController a aceitar retornar paginas
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class APIController {
  String id = "0123456";
  // @RequestMapping("/")
  // public ModelAndView mainPage() {
  //   ModelAndView modelAndView = new ModelAndView();
  //   modelAndView.setViewName("index.html");
  //   return modelAndView;
  // }
  @GetMapping("/check")
  public List<CheckList> check() {
    return List.of(
      new CheckList(0, "Abacate", 25),
      new CheckList(1, "Pêra", 12),
      new CheckList(2, "Banana", 5),
      new CheckList(3, "Melância", 41)
    );
  }

  @PostMapping("/create")
  public void createItem() {
    ;
  }

  @PutMapping("/edit/{id}")
  public void editItem() {
    ;
  }

  @DeleteMapping("/delete/{id}")
  public void deleteItem(@PathVariable String id) {
    ;
  }

}
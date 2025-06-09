package com.test.api.controller;

import org.springframework.web.bind.annotation.*;

import com.test.api.response.CheckList;

import java.util.ArrayList;
import java.util.List;

@RestController
public class APIController {

  private List<CheckList> testDB = new ArrayList<>(
      List.of(
          new CheckList(0, "Abacate", 25),
          new CheckList(1, "Pêra", 12),
          new CheckList(2, "Banana", 5),
          new CheckList(3, "Melância", 41)));
 
  private int nextId = 4;

  @GetMapping("/api/check")
  public List<CheckList> check() {
    return testDB;
  }

  @PostMapping("/api/create")
  public void createItem(@RequestBody CheckList item) {
    item.setId(nextId++);
    testDB.add(item);
  }

  @PutMapping("/api/edit/{id}")
  public void editItem(@PathVariable int id, @RequestBody CheckList updatedItem) {
    for (int i = 0; i < testDB.size(); i++) {
      if (testDB.get(i).getId() == id) {
        updatedItem.setId(id);
        testDB.set(i, updatedItem);
        break;
      }
    }
  }

  @DeleteMapping("/api/delete/{id}")
  public void deleteItem(@PathVariable int id) {
    testDB.removeIf(item -> item.getId() == id);
  }

}

package oit.is.z1452.kaizi.calc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sample21Controller {

  // sample21の呼び出し
  @GetMapping("/sample21")
  public String sample21() {
    return "sample21.html";
  }
}

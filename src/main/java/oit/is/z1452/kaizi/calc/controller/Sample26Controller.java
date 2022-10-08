package oit.is.z1452.kaizi.calc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample26")

public class Sample26Controller {

  /**
   * sample26のコントロール
   *
   * @return
   */
  @GetMapping
  public String sample26() {
    return "sample26.html";
  }
}

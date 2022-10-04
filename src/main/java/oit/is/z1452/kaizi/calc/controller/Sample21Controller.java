package oit.is.z1452.kaizi.calc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sample21Controller {

  // sample21の呼び出し
  @GetMapping("/sample21")
  public String sample21() {
    return "sample21.html";
  }

  @GetMapping("/sample22/{param1}/{param2}")
  public String sample22(@PathVariable String param1, @PathVariable String param2, ModelMap model) {
    int tasu = Integer.parseInt(param1);
    int tasareru = Integer.parseInt(param2);
    int tasuResult = tasu + tasareru;

    model.addAttribute("tasuResult1", tasuResult);
    return "sample21.html";
  }
}

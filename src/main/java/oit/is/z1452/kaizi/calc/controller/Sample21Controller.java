package oit.is.z1452.kaizi.calc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sample21Controller {

  /**
   * sample21のコントロール
   * 
   * @return
   */
  @GetMapping("/sample21")
  public String sample21() {
    return "sample21.html";
  }

  /**
   * sample22のコントロール
   * 
   * @param param1
   * @param param2
   * @param model
   * @return
   */
  @GetMapping("/sample22/{param1}/{param2}")
  public String sample22(@PathVariable String param1, @PathVariable String param2, ModelMap model) {
    int tasu = Integer.parseInt(param1);
    int tasareru = Integer.parseInt(param2);
    int tasuResult = tasu + tasareru;

    model.addAttribute("tasuResult1", tasuResult);
    return "sample21.html";
  }

  /**
   * sample23のコントロール
   * 
   * @param tasu1
   * @param tasu2
   * @param model
   * @return
   */
  @GetMapping("/sample23")
  public String sample23(@RequestParam Integer tasu1, @RequestParam Integer tasu2, ModelMap model) {
    int tasuResult = tasu1 + tasu2;
    model.addAttribute("tasuResult2", tasuResult);
    // ModelMap型変数のmodelにtasuResult2という名前の変数で，tasuResultの値を登録する．
    // ここで値を登録するとthymeleafが受け取り，htmlで処理することができるようになる
    return "sample21.html";
  }

  /**
   * sample24のコントロール
   * 
   * @return
   */
  @GetMapping("/sample24")
  public String sample24() {
    return "sample24.html";
  }

  /**
   * sample25のコントロール
   *
   * @param kakeru1
   * @param kakeru2
   * @param model
   * @return
   */
  @PostMapping("/sample25")
  public String sample25(@RequestParam Integer kakeru1, @RequestParam Integer kakeru2, ModelMap model) {
    int kakeruResult = kakeru1 * kakeru2;
    model.addAttribute("kakeruResult", kakeruResult);
    return "sample24.html";
  }
}

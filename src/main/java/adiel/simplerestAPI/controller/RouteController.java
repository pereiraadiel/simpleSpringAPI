package adiel.simplerestAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RouteController {
  private String value;

  @GetMapping
  public String show() {
    return this.value;
  }

  @PostMapping
  public String create(@RequestBody String value) {
    this.value = value;
    return this.value;
  }
}

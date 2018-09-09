package com.ramslabs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController
{
  @RequestMapping("/add")
  public ModelAndView add(@RequestParam int t1, @RequestParam int t2)
  {
    int t3 = t1 + t2;
    ModelAndView mv = new ModelAndView();
    mv.setViewName("display");
    mv.addObject("result", t3);
    return mv;
  }
}

package pl.code.academy.alkomacik.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.code.academy.alkomacik.Model.danePodstawowe;
import pl.code.academy.alkomacik.Service.serviceAlkomacik;

import java.math.BigDecimal;

@Controller
public class FirstController {

   @Autowired
   serviceAlkomacik serviceAlkomacik;

   @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showForm(Model model) {
       Integer [] servingList =  {25,50,60,100,125,150,200,250,330,400,500};
       model.addAttribute("danePodstawowe",  new danePodstawowe());
       model.addAttribute("servingList", servingList);
       return "home";
   }

   @RequestMapping (value = "/", method =RequestMethod.POST)
    public String submitForm(@ModelAttribute danePodstawowe danePodstawowe, Model model){
      float wzórEricka = serviceAlkomacik.ericPattern(danePodstawowe);
      BigDecimal wzórEricaWidmarka= new BigDecimal(wzórEricka).setScale(2,BigDecimal.ROUND_DOWN);
       danePodstawowe.setAlkomat(wzórEricaWidmarka);
        return "result";
    }
}

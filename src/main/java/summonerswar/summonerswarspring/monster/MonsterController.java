package summonerswar.summonerswarspring.monster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MonsterController {

    private MonsterService monsterService;

    @Autowired
    public MonsterController(MonsterService monsterService) {
        this.monsterService = monsterService;
    }

    @GetMapping("/monster/new")
    public String createForm(){
        return "createMonster";
    }


    @PostMapping("/monster/new")
    public String create(){

        //홈으로
        return "redirect:/";
    }

    @GetMapping("/monsters")
    public String list(Model model){
        //List<Monster> monsters = MonsterService.
        //model.addAttribute("monsters",monsters);
        return "monsters";
    }

}

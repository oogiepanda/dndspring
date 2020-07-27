package com.oogie.dndspring;

import com.oogie.dndspring.model.CharactersEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class CharactersController {
    private final CharactersRepository repository;

    public CharactersController(CharactersRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/getcharacter";
    }

    @GetMapping("/getcharacter")
    public String characterGetAll(Model model) {
        List<CharactersEntity> charactersEntities = repository.findAll();
        model.addAttribute("characters", charactersEntities);
        return "getcharacter";
    }

    @GetMapping("/addcharacter")
    public String characterForPost() {
        return "addcharacter";
    }

    @PostMapping("addcharacter")
    public String characterPost(CharactersEntity charactersEntity, Model model) {
        model.addAttribute("characters", charactersEntity);
        repository.save(charactersEntity);
        return "addcharacter";
    }
}

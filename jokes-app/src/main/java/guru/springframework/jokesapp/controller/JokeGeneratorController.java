package guru.springframework.jokesapp.controller;

import guru.springframework.jokesapp.service.JokeGeneratorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeGeneratorController {

    private final JokeGeneratorService jokeGeneratorService;

    public JokeGeneratorController(JokeGeneratorService jokeGeneratorService) {
        this.jokeGeneratorService = jokeGeneratorService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        String joke = jokeGeneratorService.generateJoke();
        model.addAttribute("joke", joke);

        return "index";
    }
}

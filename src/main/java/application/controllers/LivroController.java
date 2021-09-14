package application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/livro")
public class LivroController {
@Autowired
@RequestMapping("/list")
public String list(Model model){
    model.addAllAttributes("livros");
    return"list.jsp";
}
}

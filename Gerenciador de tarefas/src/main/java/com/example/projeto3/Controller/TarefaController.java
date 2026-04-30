package com.example.projeto3.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.projeto3.models.Tarefa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/tarefas")
public class TarefaController {

    private List<Tarefa> lista = new ArrayList<>();

    public TarefaController() {
        lista.add(new Tarefa(1L, "Estudar", "Spring", LocalDate.now()));
        lista.add(new Tarefa(2L, "Treinar", "Academia", LocalDate.now()));
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("tarefas", lista);
        return "tarefa-lista";
    }

    @GetMapping("/cadastrar")
public String form() {
    return "tarefa-cadastro";
}

@PostMapping("/salvar")
public String salvar(Tarefa tarefa) {
    tarefa.setId((long) (lista.size() + 1));
    lista.add(tarefa);
    return "redirect:/tarefas";
}}

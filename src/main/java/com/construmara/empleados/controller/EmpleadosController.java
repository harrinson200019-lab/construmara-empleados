package com.construmara.empleados.controller;

import com.construmara.empleados.model.Empleados;
import com.construmara.empleados.repository.EmpleadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// Controlador principal para gestionar empleados
@Controller
@RequestMapping("/empleados")
public class EmpleadosController {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    // Método para listar todos los empleados en la vista
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("empleados", empleadoRepository.findAll());
        model.addAttribute("empleado", new Empleados());
        return "empleados";
    }

    // Método para guardar un nuevo empleado o actualizar uno existente
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Empleados empleado) {
        empleadoRepository.save(empleado);
        return "redirect:/empleados?msg=guardado";
    }

    // Método para actualizar un empleado
    @PostMapping("/actualizar")
    public String actualizar(@ModelAttribute Empleados empleado) {
        empleadoRepository.save(empleado);
        return "redirect:/empleados?msg=actualizado";
    }

    // Método para eliminar un empleado por su ID
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        empleadoRepository.deleteById(id);
        return "redirect:/empleados?msg=eliminado";
    }

    // Método para cargar los datos de un empleado en el formulario para edición
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Empleados empleado = empleadoRepository.findById(id).orElse(null);

        model.addAttribute("empleado", empleado);
        model.addAttribute("empleados", empleadoRepository.findAll());

        return "empleados";
    }

    // Metodo para buscar un usuario
    @GetMapping("/buscar")
    public String buscar(@RequestParam("nombre") String nombre, Model model) {

        List<Empleados> lista = empleadoRepository.findByNombreContainingIgnoreCase(nombre);

        if (lista.isEmpty()) {
            model.addAttribute("error", "Usuario no encontrado");
        }

        model.addAttribute("empleados", lista);
        model.addAttribute("empleado", new Empleados());

        return "empleados";
    }
}
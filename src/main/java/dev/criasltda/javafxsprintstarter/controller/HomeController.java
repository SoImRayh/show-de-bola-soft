package dev.criasltda.javafxsprintstarter.controller;

import dev.criasltda.javafxsprintstarter.domain.models.Product;
import dev.criasltda.javafxsprintstarter.domain.service.ProductService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final ProductService service;
    @FXML
    void buscar(ActionEvent event) {
    }

    @FXML
    void criar(ActionEvent event) {

    }

}

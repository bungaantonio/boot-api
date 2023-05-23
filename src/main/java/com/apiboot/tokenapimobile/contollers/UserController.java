package com.apiboot.tokenapimobile.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // lida com solicitacoes HTTP
@RequestMapping("users") // disponibiliza metodos de recurso quando uma solicitacao for enviada
public class UserController {
    @GetMapping("/status/check")
    public String status(){
        return "carregando";
    }
}
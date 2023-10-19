package com.atacado.presentes.api.dto;

import com.atacado.presentes.api.constants.UsuarioRole;

public record RegisterDTO(String login, String password, UsuarioRole role) {
    
}

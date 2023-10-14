package com.atacado.presentes.api.model;

import com.atacado.presentes.api.constants.Perfil;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(nullable = false, length = 100, unique = true)
    @Email(message = "Email inválido")
    @NotBlank(message = "O e-mail deve ser preenchido!")
    private String email;

    @Column(nullable = false, length = 20)
    @Pattern(regexp  = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$",message = "A senha deve conter no mínimo 8 caracteres, no mínimo uma letra maiúscula, no mínimo uma letra minúscula, no mínimo um caractere especial e no mínimo um número.")
    private String senha;

    @Column(nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private Perfil perfil;

    @Column(length = 50)
    @Pattern(regexp = "\\d{2}.\\d{4,5}-\\d{4}",message = " O telefone deve seguir o Formato: XX-XXXXX-XXXX")
    private String telefone;

}

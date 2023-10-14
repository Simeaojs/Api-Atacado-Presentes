package com.atacado.presentes.api.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @Column(nullable = false, length = 255)
    @NotBlank(message = "O sobrenome é obrigatório")
    private String sobrenome;

    @Column(nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "A data de nascimento é obrigatoria")
    private LocalDate dataNascimento;

    @Embedded
    private Endereco endereco;

    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

}

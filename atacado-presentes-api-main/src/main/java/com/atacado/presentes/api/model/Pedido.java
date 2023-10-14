package com.atacado.presentes.api.model;

import java.time.LocalDate;

import com.atacado.presentes.api.constants.Status;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;

    @Column(nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "A data do pedido é obrigatoria")
    private LocalDate data;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    @NotNull(message = "O status do pedido é obrigatoria")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;
}

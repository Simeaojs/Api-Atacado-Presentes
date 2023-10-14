package com.atacado.presentes.api.model;

import org.hibernate.validator.constraints.br.CNPJ;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_fornecedores")

public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFornecedor;

    @Column(nullable = false, length = 255)
    @NotBlank(message = "O nome fantasia é obrigatório")
    private String nomeFantasia;

    @Column(nullable = false, length = 255)
    @NotBlank(message = "A razão social é obrigatório")
    private String razaoSocial;

    @Column(nullable = false, length = 18)
    @CNPJ(message = "O CNPJ é inválido")
    @NotBlank(message = "O CNPJ é obrigatório")
    private String cnpj;

    @Embedded
    private Endereco endereco;

    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
}

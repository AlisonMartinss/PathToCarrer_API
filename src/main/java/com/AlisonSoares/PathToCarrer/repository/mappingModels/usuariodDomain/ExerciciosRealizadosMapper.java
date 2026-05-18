package com.AlisonSoares.PathToCarrer.repository.mappingModels.usuariodDomain;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "exerciciosRealizados")
public class ExerciciosRealizadosMapper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exercicioRealizadoID;

    private String opcaoMarcada;
    private boolean acertou;
    private  LocalDate ultimoContato;

    @ManyToOne
    @JoinColumn(name = "usuarioID")
    private UsuarioMapper usuarioID;

    @ManyToOne
    @JoinColumn(name = "exercicioID")
    private Long exercicioID; /*PENDENTE*/

    @ManyToOne
    @JoinColumn(name = "conteudoID")
    private Long conteudoID; /*PENDENTE*/




}

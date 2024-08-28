package ru.gb.eshop.gb_eshop.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Класс сущности картинки со свойствами id, fileName, product
 *
 * @author Пещенко Т.А
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Image {

    /**
     * Поле id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Поле fileName
     */
    private String fileName;

    /**
     * Поле product
     */
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    private Product product;

}

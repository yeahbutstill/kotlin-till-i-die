package oop.`object`.`class`

import annotations.NotBlank

data class CreateProductReq(
    @NotBlank val id: String,
    @NotBlank val name: String,
    @NotBlank val price: Long
)

data class CreateCategoryReq(
    @NotBlank val idCatgry: String,
    @NotBlank val nameCatgry: String
)

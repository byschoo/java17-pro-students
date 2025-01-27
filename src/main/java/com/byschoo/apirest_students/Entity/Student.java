package com.byschoo.apirest_students.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/*import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;*/
import jakarta.validation.constraints.NotNull;
/*import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;*/
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @NotNull
   private Long id;

   @Column(name = "name", nullable = false)
   /*@NotBlank(message = "El nombre es obligatorio")
   @Pattern(regexp = "^[A-Za-zÁÉÍÓÚÜÑáéíóúüñ\\s]+$", message = "El nombre solo puede contener letras latinas y espacios")
   @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres") */
   private String name;

   @Column(name = "age", nullable = false)
   @NotNull(message = "La edad es obligatoria y debe ser mayor de edad")
   /*@Min(value = 18, message = "La edad debe ser mayor o igual a 18")
   @Max(value = 125, message = "La edad no puede ser mayor a 125") */
   private int age;
}

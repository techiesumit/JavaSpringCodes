package com.library.management.library.management.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Books {
    @Id
  private String isbn;
  private String title;
  private int published_year;
}

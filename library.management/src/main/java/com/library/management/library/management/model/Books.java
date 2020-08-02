package com.library.management.library.management.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Books {
    private String isbn;
    private String title;
    private int published_year;
}

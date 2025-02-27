package co.musicshop.fis.models;

import jakarta.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Entity
@Table(name = "Instrument")
public class Instrument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instrument_id")
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String type;

    @NonNull
    private String brand;

    @NonNull
    private String album;

    @NonNull
    private Double price;

    @Column(name = "Photo")
    @NonNull
    private String photo;
}

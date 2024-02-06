package ptm.financetracker.model;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "spendingRecords")
public class FinanceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "recordId")
    private Long id;
    @Column(name = "recordDate")
    private String date;
    @Column(name = "recordPlace")
    private String place;
    @Column(name = "recordDescription")
    private String description;
    @Column(name = "recordAmount")
    private float amount;
}

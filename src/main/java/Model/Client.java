package Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Client {

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String mame;
    @Column
    private String state;
    @Column
    private Double salary;
    @Column
    private int timeInJob;
    @Column
    private boolean SPCRestrictions;
    @Column
    private boolean latePayment;

    public Client(Integer id, String mame, String state) {
        this.id = id;
        this.mame = mame;
        this.state = state;
    }
}

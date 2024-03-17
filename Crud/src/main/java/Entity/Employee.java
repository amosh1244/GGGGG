package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Employee_name", unique = true)
    private String name;

    @Column(name = "Employee_gmail", unique = true)
    private String gmail;

    @Column(name = "Employee_phone", unique = true)
    private String phone;


}

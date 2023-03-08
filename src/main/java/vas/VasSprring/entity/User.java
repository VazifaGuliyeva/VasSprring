package vas.VasSprring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="tam_ad")
    private String fullName;
    @Column(name="tevellud")
    private LocalDate age;

    @OneToMany(mappedBy ="user")
    List<Blog> blogs;
}

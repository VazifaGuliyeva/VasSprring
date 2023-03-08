package vas.VasSprring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="paylasimlar")
public class Blog {
    @Id
    @GeneratedValue
    Integer id;

    @Column(name="blog_bashligi")
    String bashliq;

    @Column(name="blog_contenti")
    String content;

    @ManyToOne
    @JoinColumn(name="user_id")
    User user;
}

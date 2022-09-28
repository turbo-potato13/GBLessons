package lesson25.entities;

import lombok.Data;

@Entity
@Data
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Book book;

    @Column(name = "count")
    private int count;

    @Column(name = "price")

    private int price;
}

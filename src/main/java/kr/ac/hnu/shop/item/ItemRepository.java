package kr.ac.hnu.shop.item;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    // List<Item> findByNameLikeIgnoreCase(String name);
    List<Item> findByName(String name);

}

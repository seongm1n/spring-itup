package kr.ac.hnu.shop.item;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ItemRepositoryTest {
    @Autowired
    private ItemRepository repository;

    @Test
    void createItemTest() {
        Item item = new Item();
        item.setName("test");
        item.setPrice(10000);
        item.setDescription("This is a test");
        item.setQuantity(100);
        item.setStatus("Selling");
        item.setRegisterDate(LocalDateTime.now());
        Item savedItem = repository.save(item);
    }
    
    private void createItemList() {
        for (int i = 1; i <= 10; i++) {
            Item item = new Item();
            item.setName("테스트 상품" + i);
            item.setPrice(10000 + i);
            item.setDescription("This is a test" + i);
            item.setQuantity(100 + i);
            item.setStatus("Selling");
            item.setRegisterDate(LocalDateTime.now());
            Item savedItem = repository.save(item);
        }
    }
    
    @Test
    @DisplayName("상품명 조희 테스트")
    void findByNameTest() {
        createItemList();
        List<Item> itemList = repository.findByName("테스트 상품1");
        assertEquals(1, itemList.size());
    }
}